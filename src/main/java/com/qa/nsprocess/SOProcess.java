package com.qa.nsprocess;
import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;
	import com.qa.exceldataReader.ExcelReader;
import com.qa.exceldataReader.ExcelReaderbycolumnname;
import com.qa.functions.SOCreationfun;
import com.qa.functions.Sales_order_functions;
import com.qa.pages.AuthPage;
import com.qa.util.TestBase;
	import com.qa.util.TestUtil;

import io.cucumber.plugin.event.TestCase;

	public class SOProcess extends TestBase {
		TestUtil testUtil;
		ExcelReader reader;
		ExtentSparkReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
		SOCreationfun page;
		AuthPage authpage;

		public void send_email() throws EmailException
		{
			EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath("./SO_report/myReport.html");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			 // attachment.setDescription("Test Report");
			 // attachment.setName("Bulk Email Invoices");
			  MultiPartEmail email = new MultiPartEmail();
			  email.setHostName("smtp.gmail.com");
			  email.setSmtpPort(465);
			  email.setAuthenticator(new DefaultAuthenticator("sindhuja.b@tvarana.com", "Sindhu@123"));
			  email.setSSLOnConnect(true);
			  email.addTo("sindhuja.b@tvarana.com", "Sindhu");
			  email.setFrom("sindhuja.b@tvarana.com", "Sindhuja");
			  email.setSubject("Sales Order Validation Report");
			  email.setMsg("Here is the report please find the attachment");
			  email.attach(attachment);
			  email.send();
		}
		@BeforeTest
		public void setExtent() {
			// specify location of the report
			htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/SO_report/myReport.html");
			htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
			htmlReporter.config().setReportName("Sales Order Automation"); // Name of the report
			htmlReporter.config().setTheme(Theme.STANDARD);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			// Passing General information
			extent.setSystemInfo("Environemnt", "QA");
			extent.setSystemInfo("user", "Sindhuja");
		}

		@AfterTest
		public void endReport() throws EmailException {
			extent.flush();
			send_email();
		}

		@AfterMethod
		public void tearDown(ITestResult result) throws IOException {
			if (result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																						// report
			} else if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
			} else if (result.getStatus() == ITestResult.SUCCESS) {
				//test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
			}
			driver.quit();
		}

		@BeforeMethod
		public void setUp() throws InterruptedException {
			testUtil = new TestUtil();
			testUtil.setUp();
		}
		
		@Test
		public void form_test() throws IOException, InterruptedException
		{
			String file_path="C:\\\\Users\\\\Sindhuja\\\\Desktop\\\\SoData.xlsx";
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String[] field=reader.excelReader(file_path, 2, "Field");
			String[] mandatory=reader.excelReader(file_path, 2, "Mandatory");
			String[] show=reader.excelReader(file_path, 2, "show");
			String[] display_type=reader.excelReader(file_path, 2, "display_type");
			page=new SOCreationfun();
			test=extent.createTest(" Custom Form changes Functionality Testing ");
			page.form_test(field,mandatory,show,display_type,test);
		}
		@Test
		public void actions() throws IOException, InterruptedException
		{
			String file_path="C:\\\\Users\\\\Sindhuja\\\\Desktop\\\\SoData.xlsx";
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String[] customer=reader.excelReader(file_path, 1, "customer_name");
			String[] item=reader.excelReader(file_path, 1, "itemname");
			String[] quantity=reader.excelReader(file_path, 1, "quantity");
			String[] amount=reader.excelReader(file_path, 1, "amount");
			String[] location=reader.excelReader(file_path, 1, "location");
			String [] testcase=reader.excelReader(file_path, 1, "testcase");
			page=new SOCreationfun();
			for(int i=0;i<customer.length;i++)
			{
			test=extent.createTest(testcase[i]);	
			page.Sales_order_basic_info(customer[i],item[i],quantity[i],amount[i],location[i]);
			if(testcase[i].trim().equals("Make a Copy Functionality Testing"))
			{
			page.make_copy(item[i],quantity[i],amount[i],location[i],test);
			}
			if(testcase[i].trim().equals("Copy Previous Functionality Testing"))
			{
				page.copy_previous(item[i],quantity[i],amount[i],location[i],test);

			}
			if(testcase[i].trim().equals("Insert Functionality Testing"))
			{
				page.insert(item[i],quantity[i],amount[i], test);
			}
			if(testcase[i].trim().equals("Remove Functionality Testing"))
			{
				page.remove(item[i],quantity[i],amount[i],test);
			}
			}
			
		}
		@Test
		public void soCreation() throws IOException, InterruptedException
		{
			String file_path="C:\\\\Users\\\\Sindhuja\\\\Desktop\\\\SoData.xlsx";
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String[] customer=reader.excelReader(file_path, 0, "customer_name");
			String[] item=reader.excelReader(file_path, 0, "itemname");
			String[] quantity=reader.excelReader(file_path, 0, "quantity");
			String[] amount=reader.excelReader(file_path, 0, "amount");
			String[] location=reader.excelReader(file_path, 0, "location");
			String[] rate=reader.excelReader(file_path, 0, "rate");
			String[] terms=reader.excelReader(file_path, 0, "terms");
			String[] discount_item=reader.excelReader(file_path, 0, "discount_item");
			String[] contact=reader.excelReader(file_path, 0, "contact");
			String[] fax_number=reader.excelReader(file_path, 0, "fax_number");
			String[] shipping_cost=reader.excelReader(file_path, 0, "shipping_cost");
			String[] sales_rep=reader.excelReader(file_path, 0, "sales_rep");
			String[] shipping_carrier=reader.excelReader(file_path, 0, "shipping_carrier");
			String[] shipping_tax_code=reader.excelReader(file_path, 0, "shipping_tax_code");
			String[] payment_method=reader.excelReader(file_path, 0, "payment_method");
			String[] shipping_method=reader.excelReader(file_path, 0, "shipping_method");
			test=extent.createTest("Sales Order Creation");
			for(int i=0;i<customer.length;i++)
			{
				page=new SOCreationfun();
				page.so_creation(customer[i],item[i], quantity[i], amount[i],location[i],rate[i], terms[i], discount_item[i], contact[i], fax_number[i], shipping_cost[i], sales_rep[i],shipping_carrier[i],shipping_tax_code[i],payment_method[i],shipping_method[i],test);
				page.item_shipment(test);
				page.invoice_creation(test);
				page.payment_creation(test);
				page.return_authorization_creation(test);
				page.item_receipt_creation(test);
				page.credit_memo_creation(test);
				page.customer_refund_creation(test);
				page.return_authorization_status();
				
				
			}

	}
		
		
		
	}
	
