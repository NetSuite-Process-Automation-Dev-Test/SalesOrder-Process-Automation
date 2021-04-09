package com.qa.functions;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.pages.AuthPage;
import com.qa.util.TestBase;
public class SOCreationfun extends TestBase {
	//customer selection web elements
	@FindBy(xpath = "//span[@id='class_fs_lbl_uir_label']//following-sibling::span")
	WebElement class_from_so;
	@FindBy(xpath = "//span[@id='location_fs_lbl_uir_label']//following-sibling::span")
	WebElement location_from_so;
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement secondary_so_save;
	@FindBy(xpath = "//div[@class='uir-record-name']")
	WebElement customer_refund_id;
	@FindBy(xpath = "//img[@id='inpt_location7_arrow']")
	WebElement location_arrow_in_credit_memo;
	@FindBy(xpath = "//img[@id='inpt_location17_arrow']")
	WebElement item_receipt_location_arrow;
	@FindBy(xpath = "//td[@id='tdbody_approvereturn']")
	WebElement approve_return;
	@FindBy(xpath = "//div[@class='descr']")
	WebElement SO_confirmation;
	@FindBy(xpath="//span[@id='parent_actionbuttons_entity_fs']")
	WebElement Customer_arrow;
	@FindBy(xpath="//a[@id='entity_popup_list']")
	WebElement Customer_list;
	@FindBy(xpath="//input[@id='st']")
	WebElement Customer_searchbox;
	@FindBy(xpath="//input[@id='Search']")
	WebElement Customer_search;
	@FindBy(xpath="//div[@id='inner_popup_div']//table//tbody//tr")
	List<WebElement> Customers_list;
	//order type webelements
	@FindBy(xpath="//img[@id='inpt_custbody_order_type22_arrow']")
	WebElement Order_type;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> Order_type_dropdown;
	//end user web elements
	@FindBy(xpath="//span[@id='parent_actionbuttons_custbody_end_user_fs']")
	WebElement EndUser_arrow;
	@FindBy(xpath="//a[@id='custbody_end_user_popup_list']")
	WebElement EndUser_List;
	@FindBy(xpath = "//img[@id='inpt_location8_arrow']")
	WebElement location_arrow_in_so;
	@FindBy(xpath="//input[@id='st']")
	WebElement EndUser_searchbox;
	@FindBy(xpath="//input[@id='Search']")
	WebElement EndUser_search;
	@FindBy(xpath="//div[@id='inner_popup_div']//table//tbody//tr")
	List<WebElement> EnderUsers_list;
	@FindBy(xpath="//span[@id='parent_actionbuttons_item_item_fs']")
	WebElement Item_arrow;
	@FindBy(xpath="//a[@id='item_popup_list']")
	WebElement item_list;
	@FindBy(xpath="//input[@id='st']")
	WebElement Item_searchbox;
	@FindBy(xpath="//input[@id='Search']")
	WebElement Item_search;
	@FindBy(xpath="//div[@id='inner_popup_div']//table/tbody/tr//following-sibling::tr//td//following-sibling::td//a")
	List<WebElement> items_list;
	@FindBy(xpath="//input[@id='quantity_formattedValue']")
	WebElement Quantity;
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='item_headerrow']//following-sibling::tr//td[9]")
	//@FindBy(xpath="//div[@class='uir-machine-table-container']//table[@id='item_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[8]")
	List<WebElement> Amount_click;
	@FindBy(xpath="//input[@id='amount_formattedValue']")
	WebElement Amount;
	@FindBy(xpath="//td[@id='spn_secondarymultibutton_submitter']")
	WebElement SO_Save;
	@FindBy(xpath="//div[@class='uir-record-id']")
	WebElement id;
	@FindBy(xpath="//div[@class='uir-record-status']")
	WebElement status;
	//@FindBy(xpath="//span[@id='itemreceive1_fs']")
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='itemheader']//following-sibling::tr//td[count(//td[@data-label='Fulfill'])]//img")
	List<WebElement> fulfill_checkbox;
	@FindBy(xpath="//img[@id='inpt_location17_arrow']")
	WebElement location_arrow;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> location_dropdown;
	//@FindBy(id="inventorydetail_helper_popup_1")
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='itemheader']//following-sibling::tr//td[count(//td[@data-label='Inventory Detail']//preceding-sibling::td)+1]//span//a")
	List<WebElement> inventory_detail;
	@FindBy(id="tdbody_secondaryok")
	WebElement inventory_ok;
	@FindBy(id="spn_secondarymultibutton_submitter")
	WebElement fulfill_save;
	@FindBy(xpath="//*[@id=\"tdbody_process\"]")
	WebElement fulfill;
	@FindBy(xpath="//td[@id='tdbody_submitinv']")
	WebElement bill;
	@FindBy(xpath="//img[@id='inpt_approvalstatus2_arrow']")
	WebElement approval_arrow;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> approval_status;
	@FindBy(xpath="//img[@id='inpt_location10_arrow']")
	WebElement location_arrow1;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> location;
	@FindBy(xpath="//td[@id='spn_secondarymultibutton_submitter']")
	WebElement save_invoice;
	@FindBy(xpath="//td[@id='tdbody_acceptpayment']")
	WebElement payment_button;
	@FindBy(xpath="//input[@id='undepfunds_fs_inp']")
	List<WebElement> account_list;
	@FindBy(xpath="//img[@id='inpt_account4_arrow']")
	WebElement account_arrow;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> account_select;
	@FindBy(xpath="//td[@id='spn_multibutton_submitter']")
	WebElement payment_save;
	@FindBy(xpath="//a[text()='Invoice']")
	WebElement invoice_link;
	@FindBy(xpath="//td[@id='tdbody_return']")
	WebElement return_button;
	@FindBy(xpath="//img[@id='inpt_orderstatus2_arrow']")
	WebElement status_arrow;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> status_dropdown;
	@FindBy(xpath="//td[@id='spn_multibutton_submitter']")
	WebElement submit_return;
	@FindBy(xpath="//td[@id='tdbody_receive']")
	WebElement receive;
	//@FindBy(xpath="//span[@id='itemreceive1_fs']")
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='itemheader']//following-sibling::tr//td[count(//td[@data-label='Receive'])]//img")
	List<WebElement> item_receive;
	@FindBy(xpath="//td[@id='spn_secondarymultibutton_submitter']")
	WebElement submit_receive;
	@FindBy(xpath="//td[@id='tdbody_refund']")
	WebElement refund_button;
	@FindBy(xpath="//td[@id='spn_multibutton_submitter']")
	WebElement submit_refund;
	@FindBy(xpath="//td[@id='tdbody_refund']")
	WebElement refund;
	@FindBy(xpath="//td[@id='paymentlnk']")
	WebElement payment;
	@FindBy(xpath="//img[@id='inpt_paymentmethod13_arrow']")
	WebElement payment_arrow;
	@FindBy(xpath="//div[@class='dropdownDiv']//div")
	List<WebElement> dropdown_link;
	@FindBy(xpath="//td[@id='spn_secondarymultibutton_submitter']")
	WebElement submit_custrefund;
	@FindBy(xpath="//div[@class='uir-record-name']")
	WebElement payment_id;
	@FindBy(xpath = "//input[@id='memo']")
	WebElement before_memo;
	@FindBy(xpath = "//span[@id='department_fs_lbl_uir_label']//following-sibling::span")
	WebElement department1;
	@FindBy(xpath = "//span[@id='memo_fs_lbl_uir_label']//following-sibling::span")
	WebElement after_memo;
	@FindBy(xpath = "//table[@id='item_splits']//tr//following-sibling::tr//td[count(//table[@id='item_splits']//td[@data-label='Subtotal_and_Amount']//preceding-sibling::td)+1]")
	List<WebElement> inr_amount;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement customer_refond_first;
	@FindBy(xpath = "//input[@id='item_addedit']")
	WebElement add_item;
	
	@FindBy(xpath = "//input[@id='item_insert']")
	WebElement insert_item;
	
	@FindBy(xpath = "//input[@id='item_remove']")
	WebElement remove_item;
	
	@FindBy(xpath = "//img[@id='inpt_entity2_arrow']")
	WebElement customer_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> customer_in_test;
	@FindBy(xpath = "//img[@id='inpt_orderstatus3_arrow']")
	WebElement so_status_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> status_list;
	@FindBy(xpath = "//input[@id='entity_display']")
	WebElement enter_customer;
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='item_headerrow']//following-sibling::tr//td[count(//td[@data-label='Item']//preceding-sibling::td)+1]")
	List<WebElement> click_item;
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[@id='item_headerrow']//following-sibling::tr//td[3]")
	WebElement quantity_click;
	@FindBy(xpath = "//td[@id='cmmnctntablnk']")
	WebElement communication_tab;
	@FindBy(xpath = "//input[@id='tobefaxed_fs_inp']//following-sibling::img")
	WebElement fax_checkbox;
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='itemheader']//following-sibling::tr//td[count(//td[@data-label='Location']//preceding-sibling::td)+1]//img")
	List<WebElement>location_arrow_in_item_shipment;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> locations_in_shipment;
	@FindBy(xpath = "//td[@id='itemslnk']")
	WebElement item_tab;
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement so_first_save;
	@FindBy(xpath = "//td[@class='bntBgB multiBnt']")
	WebElement save_action;
	@FindBy(xpath = "//td[@id='nl7']")
	WebElement save_button_in_item_receipt;
	@FindBy(xpath = "//span[@id='createdfrom_lbl_uir_label']//following-sibling::span")
	WebElement refund_link;
	@FindBy(xpath = "//img[@id='inpt_binnumber1_arrow']")
	WebElement bin_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> bin_list;
	@FindBy(xpath = "//input[@id='quantity_formattedValue']")
	WebElement bin_quantity;
	@FindBy(xpath = "//input[@id='inpt_salesrep3']")
	WebElement sales_rep;
	@FindBy(xpath = "//input[@id='inpt_discountitem17']")
	WebElement discount_item;
	@FindBy(xpath = "//table[@id='item_splits']//tr[@id='item_headerrow']//following-sibling::tr//td[8]")
	List<WebElement> rate_click;
	@FindBy(xpath = "//input[@id='rate_formattedValue']")
	WebElement rate;
	@FindBy(xpath = "//td[@id='shippinglnk']")
	WebElement shipping_tab;
	@FindBy(xpath = "//td[@id='billingtablnk']")
	WebElement billing_tab;
	@FindBy(xpath = "//td[@id='accntingtablnk']")
	WebElement accounting_tab;
	@FindBy(xpath = "//td[@id='rltnshptablnk']")
	WebElement relationship_tab;
	@FindBy(xpath = "//input[@id='shippingcost_formattedValue']")
	WebElement shipping_cost;
	@FindBy(xpath = "//input[@id='inpt_terms39_arrow']")
	WebElement terms;
	@FindBy(xpath = "//input[@id='entityid']")
	WebElement contact;
	@FindBy(xpath = "//span[@id='fax_fs']//input[@id='fax']")
	WebElement fax_enter;
	@FindBy(xpath = "//img[@id='inpt_discountitem17_arrow']")
	WebElement discount_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> discount_list;
	@FindBy(xpath = "//img[@id='inpt_terms38_arrow']")
	WebElement terms_arrow;
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> terms_list;
	@FindBy(xpath = "//span[@id='subtotal_fs_lbl_uir_label']//following-sibling::span")
	WebElement sub_total;
	@FindBy(xpath = "//img[@id='inpt_shipcarrier35_arrow']")
	WebElement ship_carrier_arrow;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_shippingtaxcode_fs']")
	WebElement tax_arrow;
	@FindBy(xpath = "//div[@id='shippingtaxcode_fs_tooltipMenu']//a[@id='shippingtaxcode_popup_list']")
	WebElement tax_list;
	@FindBy(xpath = "//input[@id='st']")
	WebElement tax_enter;
	@FindBy(xpath = "//td[@id='tdbody_Search']")
	WebElement tax_search;
	@FindBy(xpath = "//div[@id='inner_popup_div']//table/tbody//tr//td//following-sibling::td//a")
	List<WebElement> tax_lists;
	@FindBy(xpath = "//img[@id='inpt_paymentmethod41_arrow']")
	WebElement payment_method_arrow;
	@FindBy(xpath = "//img[@id='inpt_shipmethod36_arrow']")
	WebElement shipping_method_arrow;
	@FindBy(xpath = "//span[@id='parent_actionbuttons_entity_fs']")
	WebElement customer_arrow1;
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[@id='item_headerrow']//following-sibling::tr//td[count(//table[@id='item_splits']//tbody//tr[@id='item_headerrow']//td[@data-label='Project'])+1]")
	WebElement item_click;
	
	//sales rep in so
	@FindBy(xpath = "//img[@id='inpt_salesrep3_arrow']")
	WebElement sales_rep_arrow_in_so;
		
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement>  sales_rep_dropdown_in_so;
		
	@FindBy(xpath = "//img[@id='inpt_location8_arrow']")
	WebElement location_arrow_in_so_;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> location_dropdown_in_so;
	// so navigation  
	@FindBy(xpath = "//li[@data-title='Transactions']")
	WebElement Transactions;
	
	@FindBy(linkText="Sales")
	WebElement Sales;
	
	@FindBy(linkText="Enter Sales Orders")
	WebElement EnterSO;
	
	@FindBy(xpath = "//input[@id='item_copy']")
	WebElement copy_previous;
	
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Quantity']//preceding-sibling::td)]")
	List<WebElement>item_click_list;
	
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Committed']//preceding-sibling::td)]//parent::tr[contains(@id,'item_row_')]")
	List<WebElement> parent_node_id;
	
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Units']//preceding-sibling::td)]")
	List<WebElement> quantity_click_list;
	
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//table[@id='item_splits']//td[@data-label='Amount']//preceding-sibling::td)]")
	List<WebElement> rate_click_list;
	
	@FindBy(xpath = "//table[@id='item_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//table[@id='item_splits']//td[@data-label='License Code']//preceding-sibling::td)]")
	List<WebElement> amount_click_list;
	
	@FindBy(xpath = "//input[@name='inpt_customform']")
	WebElement form_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> form_list;
	
	@FindBy(xpath = "//input[@id='memo']")
	WebElement memo;
	
	@FindBy(xpath = "//span[@id='department_fs_lbl_uir_label']//a[contains(text(),'Department')]//following-sibling::label")
	WebElement department_mandatory;
	
	@FindBy(xpath = "//span[@id='class_fs_lbl_uir_label']//a[contains(text(),'Class')]//following-sibling::label")
	WebElement class_mandatory;
	
	@FindBy(xpath = "//span[@id='location_fs_lbl_uir_label']//a[contains(text(),'Location')]//following-sibling::label")
	WebElement location_mandatory;
	
	@FindBy(xpath = "//span[@id='opportunity_fs']")
	WebElement opportunity;
	
	@FindBy(xpath = "//td[@id='SCREENlnk']")
	WebElement screen_fields_tab;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//input")
	List<WebElement> show_checkbox_checkoruncheck;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//img")
	List<WebElement> show_checkbox;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Show']//preceding-sibling::td)]//input")
	List<WebElement> label_list;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//input")
	List<WebElement> mandatory_checkbox_checkoruncheck;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//img")
	List<WebElement> mandatory_checkbox;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//tbody//tr[contains(@class,'uir-list-row-tr')]//td[count(//table[@id='mainflds_splits']//td[@data-label='Check Box Default']//preceding-sibling::td)]//input[contains(@class,'dropdownInput textbox')]")
	List<WebElement> disabled_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> disabled_dropdown;
	
	@FindBy(xpath = "//table[@id='mainflds_splits']//input[contains(@value,'Department')]//parent::span//parent::td//parent::tr")
	WebElement department_row;
	
	
	
	//nldropdown effectDisabled
	//checkbox_unck
	
	
	
	
	
	

	WebDriverWait wait=new WebDriverWait(driver, 100);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	Actions action=new Actions(driver);
	String SO_Url_before=null;
	String fixed_loc=null;
	String return_auth_url=null;
	AuthPage authpage;
	public  SOCreationfun() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToSO(String form_name) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(Transactions).build().perform();
		action.moveToElement(Sales).build().perform();
		EnterSO.click();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		select_form(form_name);
	}
	
	public boolean isAlertPresent_() {
		try {
			Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				System.out.println("Alert is present");
				return true;
			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			System.err.println("Alert isn't present!!");
			return false;
			
		}

	}
	ExtentTest test=null;
	public void customer_selecting(String customer) throws InterruptedException
	{
		Thread.sleep(10000);
		Customer_arrow.click();
		Customer_list.click();
		Customer_searchbox.sendKeys(customer);
		Customer_search.click();
		Thread.sleep(5000);
		boolean customer_falg=false;
		for(int i=0;i<Customers_list.size();i++)
		{
			if(Customers_list.get(i).getText().equals(customer.trim()))
			{
				Customers_list.get(i).click();
				Thread.sleep(2000);
				//customer_falg=true;
				break;
			}
		}
	}
	public void so_creation(String customer, String item, String quantity2, String amount2, String location2, String rate2, String terms2, String discount_item2, String contact2, String fax_number, String shipping_cost2, String sales_rep2, String shipping_carrier, String shipping_tax_code, String payment_method, String shipping_method, ExtentTest test1) throws InterruptedException
	{
		boolean sales_rep_flag=false;
		boolean shipping_carrier_flag=false;
		boolean shipping_method_flag=false;
		boolean shipping_tax_code_flag=false;
		boolean terms_flag=false;
		boolean payment_flag=false;
		boolean fax_flag=false;
		boolean item_flag=false;
		boolean discount_flag=false;
		boolean quantity_flag=false;
		boolean amount_flag=false;
		boolean rate_flag=false;
		boolean location_flag=false;
		 test=test1.createNode("Sales Order Creation for customer "+customer);

		String [] items=new String[3];
		for(int i=0;i<3;i++)
		{
			items=item.split(",");
			System.out.println("Items are: "+items[i]);
		}
		String[] quantitys=new String[3];
		for(int i=0;i<3;i++)
		{
			quantitys=quantity2.split(",");
			System.out.println("Quantites are: "+quantitys[i]);
		}
		String[] amounts=new String[3];
		for(int i=0;i<3;i++)
		{
			amounts=amount2.split(",");
			System.out.println("Amounts are: "+amounts[i]);
		}
		String[] rates=new String[3];
		for(int i=0;i<3;i++)
		{
			rates=rate2.split(",");
			System.out.println("Rates are: "+rates[i]);
		}
		navigateToSO("Standard Sales Order");
		Thread.sleep(10000);
		Customer_arrow.click();
		Customer_list.click();
		Customer_searchbox.sendKeys(customer);
		Customer_search.click();
		Thread.sleep(5000);
		boolean customer_falg=false;
		for(int i=0;i<Customers_list.size();i++)
		{
			if(Customers_list.get(i).getText().equals(customer.trim()))
			{
				Customers_list.get(i).click();
				Thread.sleep(2000);
				customer_falg=true;
				break;
			}
		}
		if(customer_falg)
		{
			String SO_Url_before=null;
			status_arrow.click();
			for(int i=0;i<status_list.size();i++)
			{
				if(status_list.get(i).getText().equals("Pending Fulfillment"))
				{
					status_list.get(i).click();
					break;
				}
			}
			sales_rep_arrow_in_so.click();
			
			for(int i=0;i<sales_rep_dropdown_in_so.size();i++)
			{
				if(sales_rep_dropdown_in_so.get(i).getText().equals(sales_rep2.trim()))
				{
					sales_rep_dropdown_in_so.get(i).click();
					Thread.sleep(2000);
					sales_rep_flag=true;
					break;
				}
			}
			if(sales_rep_flag)
			{
				jsx.executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(1000);
				location_arrow_in_so_.click();
				for(int i=0;i<location_dropdown_in_so.size();i++)
				{
					if(location_dropdown_in_so.get(i).getText().equals(location2.trim()))
					{
						location_dropdown_in_so.get(i).click();
						location_flag=true;
						break;
					}
				}
				if(location_flag)
				{
				Thread.sleep(2000);
				jsx.executeScript("window.scrollBy(0,800)", "");
				Thread.sleep(3000);
				shipping_tab.click();
				Thread.sleep(2000);
				ship_carrier_arrow.click();
				for(int i=0;i<dropdown_link.size();i++)
				{
					if(dropdown_link.get(i).getText().trim().equals(shipping_carrier.trim()))
					{
						dropdown_link.get(i).click();
						shipping_carrier_flag=true;
						break;
					}
				}
				if(shipping_carrier_flag)
				{
					Thread.sleep(2000);
					shipping_method_arrow.click();
					for(int i=0;i<dropdown_link.size();i++)
					{
						if(dropdown_link.get(i).getText().trim().equals(shipping_method.trim()))
						{
							dropdown_link.get(i).click();
							shipping_method_flag=true;
							break;
						}
					}
					if(shipping_method_flag)
					{
						wait.until(ExpectedConditions.visibilityOf(this.shipping_cost));
						action.doubleClick(this.shipping_cost).build().perform();
						action.sendKeys(Keys.BACK_SPACE).build().perform();
						this.shipping_cost.sendKeys(shipping_cost2.trim());
						tax_arrow.click();
						tax_list.click();
						tax_enter.sendKeys(shipping_tax_code.trim());
						tax_search.click();
						Thread.sleep(5000);
						for(int i=0;i<tax_lists.size();i++)
						{
							if(tax_lists.get(i).getText().equals(shipping_tax_code.trim()))
							{
								tax_lists.get(i).click();
								Thread.sleep(2000);
								shipping_tax_code_flag=true;
								break;
								
							}
						}
						if(shipping_tax_code_flag)
						{
							Thread.sleep(5000);
							jsx.executeScript("window.scrollBy(0,-200)");
							billing_tab.click();
							terms_arrow.click();
							for(int i=0;i<terms_list.size();i++)
							{
								if(terms_list.get(i).getText().equals(terms2.trim()))
								{
									terms_list.get(i).click();
									terms_flag=true;
									break;
								}
							}
							if(terms_flag)
							{
									Thread.sleep(3000);
									jsx.executeScript("window.scrollBy(0,-200)");
									relationship_tab.click();
									this.contact.sendKeys(contact2);
									Thread.sleep(2000);
									communication_tab.click();
									fax_enter.sendKeys(fax_number.trim());
									action.sendKeys(Keys.TAB).build().perform();
									if(isAlertPresent_()==true)
									{
										fax_flag=true;
										Alert alert=driver.switchTo().alert();
										alert.accept();
										fax_enter.clear();
									}
									if(!fax_flag)
									{
										
										item_tab.click();
										discount_arrow.click();
										for(int i=0;i<discount_list.size();i++)
										{
											if(discount_list.get(i).getText().trim().equals(discount_item2.trim()))
											{
												discount_list.get(i).click();
												discount_flag=true;
												break;
											}
										}
										if(discount_flag)
										{
											Thread.sleep(2000);
										     jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
										     for(int i=0;i<3;i++)
												{
												Item_arrow.click();
												item_list.click();
												Item_searchbox.sendKeys(items[i]);
												Item_search.click();
												Thread.sleep(10000);
												for(int k=0;k<items_list.size();k++)
												{
													if(items_list.get(k).getText().equals(items[i]))
													{
														item_flag=true;
														items_list.get(k).click();
														break;
													}
												}
												if(!item_flag)
												{
													test.fail("Item is not present in the list...Please select item from the list");
													System.out.println("Item is invalid");
													break;
												}
												Thread.sleep(5000);
												action.doubleClick(Quantity).build().perform();
												action.sendKeys(Keys.BACK_SPACE).build().perform();
												Thread.sleep(2000);
												Quantity.sendKeys(quantitys[i]);
												if(isAlertPresent_()==true)
												{
													Alert alert =driver.switchTo().alert();
													if(alert.getText().equals("Inventory items must have a positive quantity."))
													{
														quantity_flag=true;
														alert.accept();
													}
												}
												if(quantity_flag)
												{
													test.fail("Please enter Positive Quantity...quantity should not be negative");
													System.out.println("Quantity is invalid");
												}
												Thread.sleep(2000);
												rate_click.get(i).click();
												this.rate.sendKeys(rates[i].trim());
												Amount_click.get(i).click();
												Amount.clear();
												Amount.sendKeys(amounts[i]);
												action.sendKeys(Keys.TAB).build().perform();
												if(isAlertPresent_()==true)
												{
													Alert alert=driver.switchTo().alert();
													if(alert.getText().equals("Inventory items must have a positive amount."))
													{
														amount_flag=true;
													}
													alert.accept();
												}
												if(amount_flag)
												{
													test.fail("Amount is invalid...Inventory items must have a positive amount");
													System.out.println("Amount is invalid");
												}
												
												Thread.sleep(5000);
												add_item.click();
												if(i==2)
												break;
												click_item.get(i+1).click();
												Thread.sleep(2000);
												}
											
										}
										else
										{
											test.fail("Given discount is not present in the list...Please select discount from the list");
										}
									}
									else
									{
										test.fail("Fax number is invalid...Please enter valid fax number");
										System.out.println("Fax number is invalid");
									}
									
									
							
								
							}
							else
							{
								test.fail("Terms are not present in the list...Please select terms from the list");
							}
							
						}
						else
						{
							test.fail("Tax code is not present in the list...Please select taxcode from the list");
							System.out.println("Tax code is invalid");
						}
						
					}
					else
					{
						test.fail("Shipping method is not present in the list...Please select shipping method from the list");
						System.out.println("Shipping method is invalid");
					}
					
				}
				else
				{
					test.fail("Shipping carrier is not present in the list...Please select shipping carrier from the list");
					System.out.println("Shipping carrier is invalid");
				}
				
			}
				else
				{
					test.fail("Location is not present in the list...Please select location from the list");
				}
			}
		
			else
			{
				test.fail("Sales rep is not present in the list... Please select sales rep from the list");
				System.out.println("Sales rep is not present in the list... Please select sales rep from the list");
			}
			
			
			
		}
		else
		{
			action.moveToElement(status_arrow).build().perform();
			status_arrow.click();
			test.fail("Customer is not present in the list... Please select customer from the list");
			System.out.println("Customer is not present in the list... Please select customer from the list");
		}
		if(customer_falg==true&&sales_rep_flag==true&&location_flag==true&&shipping_carrier_flag==true&&shipping_method_flag==true&&shipping_tax_code_flag==true&&item_flag==true&&amount_flag==false&&quantity_flag==false&&terms_flag==true)
		{
			action.moveToElement(SO_Save).build().perform();
			SO_Save.click();
			wait.until(ExpectedConditions.visibilityOf(id));
			if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
			{
				System.out.println("Sales Order "+""+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
				test.pass("Sales Order "+""+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");	
			}
//			item_shipment(test1);
//			invoice_creation(test1);
//			payment_creation(test1);
//			return_authorization_creation(test1);
//			item_receipt_creation(test1);
//			credit_memo_creation(test1);
//			customer_refund_creation(test1);
//			return_authorization_status();
		}
		else
		{
			test.fail("Sales Order is not created");
			System.out.println("Sales order is not created");
		}
		
	}
	
	public void item_shipment(ExtentTest test2) throws InterruptedException
	{
		
		SO_Url_before=driver.getCurrentUrl();
		fulfill.click();
		Thread.sleep(3000);
		for(int i=0;i<3;i++)
		{
			fulfill_checkbox.get(i).click();
			 try
			    {
			        @SuppressWarnings("deprecation")
					WebDriverWait wait = new WebDriverWait(driver, 5);
			        wait.until(ExpectedConditions.elementToBeClickable(inventory_detail.get(i)));
			        inventory_detail.get(i).click();
			        driver.switchTo().frame("childdrecord_frame");
					Thread.sleep(3000);
					inventory_ok.click();	
					Thread.sleep(3000);
					}
			    catch (Exception e)
			    {
			    	System.out.println("Element is not clickable");
			    }		
			

		}
		
		fulfill_save.click();
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println("Item Shipment "+""+"" +id.getText()+" "+"is created successfully");
		Thread.sleep(5000);
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Item Shipment "+""+"" +id.getText()+" "+"is created successfully");
		}
		else
		{
			test.fail("Item Shipment is not created");
		}
	}
	
	public void invoice_creation(ExtentTest test3) throws InterruptedException
	{
		bill.click();
		Thread.sleep(6000);
		action.moveToElement(approval_arrow).build().perform();
		approval_arrow.click();
		approval_status.get(1).click();
		jsx.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		jsx.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		communication_tab.click();
		fax_checkbox.click();
		save_invoice.click();
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println("Invoice"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		Thread.sleep(10000);
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Invoice"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		}
		else
		{
			test.fail("Invoice is not created");
		}
	}
	
	public void payment_creation(ExtentTest test4) throws InterruptedException
	{
		payment_button.click();
		Thread.sleep(5000);
		account_list.get(1).click();
		account_arrow.click();
		account_select.get(2).click();
		Thread.sleep(3000);
		action.moveToElement(payment_save).build().perform();
		payment_save.click();
		wait.until(ExpectedConditions.visibilityOf(payment_id));
		System.out.println("Payment"+" "+"" +payment_id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		jsx.executeScript("arguments[0].scrollIntoView(true);",invoice_link);
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Payment"+" "+"" +payment_id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		}
		else
		{
			test.fail("Payment is not created");
		}
	}
	public void return_authorization_creation(ExtentTest test4) throws InterruptedException
	{
		driver.navigate().to(SO_Url_before);
	 	return_button.click();
	 	jsx.executeScript("window.scrollBy(0,500)", "");
	 	communication_tab.click();
	 	fax_checkbox.click();
		jsx.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		submit_return.click();
		wait.until(ExpectedConditions.visibilityOf(approve_return));
		approve_return.click();
		wait.until(ExpectedConditions.visibilityOf(id));
		System.out.println("Return Authorization"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		return_auth_url=driver.getCurrentUrl();
		if(SO_confirmation.getText().trim().equals("Return Authorization successfully Approved"))
		{
		test.pass("Return Authorization"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		}
		else
		{
			test.fail("Return Authorization is not created");
		}
	}
	public void item_receipt_creation(ExtentTest test) throws InterruptedException
	{
		receive.click();
		Thread.sleep(5000);
		jsx.executeScript("window.scrollBy(0,500)", "");
		action.moveToElement(item_receive.get(0)).build().perform();
		for(int i=0;i<3;i++)
		{
			item_receive.get(i).click();
			
			 try
			    {
			        @SuppressWarnings("deprecation")
					WebDriverWait wait = new WebDriverWait(driver, 5);
			        wait.until(ExpectedConditions.elementToBeClickable(inventory_detail.get(i)));
			        inventory_detail.get(i).click();
			        driver.switchTo().frame("childdrecord_frame");
					Thread.sleep(3000);
					bin_arrow.click();
					bin_list.get(1).click();
					action.sendKeys(Keys.TAB).build().perform();
					bin_quantity.sendKeys("1");
					inventory_ok.click();	
					Thread.sleep(3000);
					}
			    catch (Exception e)
			    {
			    	System.out.println("Element is not clickable");
			    }		
			

		}
		Thread.sleep(6000);
		jsx.executeScript("window.scrollTo(0,0)");
		submit_receive.click();
		System.out.println("Item Receipt"+" "+"" +id.getText()+" "+"is created successfully ");
		Thread.sleep(5000);
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Item Receipt"+" "+"" +id.getText()+" "+"is created successfully");
		}
		else
		{
			test.fail("Item Receipt is not created");
		}
	}
	public void credit_memo_creation(ExtentTest test5) throws InterruptedException
	{
		refund_link.click();
		refund_button.click();
		Thread.sleep(5000);
		jsx.executeScript("window.scrollBy(0,500)", "");
		communication_tab.click();
		fax_checkbox.click();
		Thread.sleep(5000);
		jsx.executeScript("window.scrollTo(0,0)", "");
		Thread.sleep(2000);
		submit_refund.click();
		System.out.println("Credit Memo"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		Thread.sleep(5000);
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Credit Memo"+" "+"" +id.getText()+" "+"is created successfully with"+" " +status.getText()+" "+"status");
		}
		else
		{
			test.fail("Credit memo is not created");
		}
	}
	public void customer_refund_creation(ExtentTest test6) throws InterruptedException
	{
		refund.click();
		Thread.sleep(5000);
		jsx.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		action.moveToElement(payment).build().perform();
		payment.click();
		payment_arrow.click();
		dropdown_link.get(2).click();
		Thread.sleep(2000);
		action.moveToElement(submit_custrefund).build().perform();
		submit_custrefund.click();
		wait.until(ExpectedConditions.visibilityOf(customer_refund_id));
		System.out.println("Customer refund"+" "+"" +customer_refund_id.getText()+" "+"is created successfully ");
		if(SO_confirmation.getText().trim().equals("Transaction successfully Saved"))
		{
		test.pass("Customer refund"+" "+"" +customer_refund_id.getText()+" "+"is created successfully ");
		}
		else
		{
			test.fail("Customer refund is not created");
		}	
	}
	public void return_authorization_status()
	{
		driver.navigate().to(return_auth_url);
		System.out.println("Return Authorization now"+" "+"" +id.getText()+" "+"is in"+" " +status.getText()+" "+"status");	
		test.pass("Return Authorization now"+" "+"" +id.getText()+" "+"is in"+" " +status.getText()+" "+"status");	
	}
	
	public void Sales_order_basic_info(String customer, String item, String quantity2, String amount2, String location2) throws InterruptedException
	{
		navigateToSO("Standard Sales Order");
		customer_selecting(customer);
		status_arrow.click();
		for(int i=0;i<status_list.size();i++)
		{
			if(status_list.get(i).getText().equals("Pending Fulfillment"))
			{
				status_list.get(i).click();
				break;
			}
		}
		jsx.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		location_arrow_in_so_.click();
		for(int i=0;i<location_dropdown_in_so.size();i++)
		{
			if(location_dropdown_in_so.get(i).getText().equals(location2))
			{
				location_dropdown_in_so.get(i).click();
				break;
			}
		}
		jsx.executeScript("window.scrollBy(0,800)", "");
		Item_arrow.click();
		item_list.click();
		Item_searchbox.sendKeys(item);
		Item_search.click();
		Thread.sleep(10000);
		for(int k=0;k<items_list.size();k++)
		{
			if(items_list.get(k).getText().equals(item))
			{
				items_list.get(k).click();
				break;
			}
		}
		Thread.sleep(5000);
		action.doubleClick(Quantity).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		Quantity.sendKeys("1");
		rate_click.get(0).click();
		this.rate.sendKeys("100");
		Amount_click.get(0).click();
		Amount.clear();
		Amount.sendKeys("100");
		Thread.sleep(5000);
		add_item.click();
//		
		
		
	}
	public void copy_previous(String item,String quantity, String amount, String location, ExtentTest test) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='item_splits']//td[contains(text(),'"+item+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		System.out.println(rowId);
		copy_previous.click();
		Thread.sleep(5000);
		add_item.click();
		String item_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+item+"')]")).getText();
		String item_name_copied=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+item+"')]")).getText();
		String quantity1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+quantity+"')]")).getText();
		String quantity2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+quantity+"')]")).getText();
		String amount1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+amount+"')]")).getText();
		String amount2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+amount+"')]")).getText();
//		String location1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+location+"')]")).getText();
//		String location2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+location+"')]")).getText();
		
		if(item_name.equals(item_name_copied)&& quantity1.equals(quantity2) && amount1.equals(amount2) )
		{
			test.pass("Copy Previous Functionality is working");
			System.out.println("Copy previous is working");
		}
		else
		{
			test.fail("Copy Previous Functionality is not working");
			System.out.println("copy previous is not working");
		}	
		
	}
	public void make_copy(String item,String quantity, String amount, String location, ExtentTest test) throws InterruptedException
	{
		copy_previous.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='item_splits']//td[contains(text(),'"+item+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(5000);
		add_item.click();
		String item_name=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+item+"')]")).getText();
		String item_name_copied=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+item+"')]")).getText();
		String quantity1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+quantity+"')]")).getText();
		String quantity2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+quantity+"')]")).getText();
		String amount1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+amount+"')]")).getText();
		String amount2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+amount+"')]")).getText();
//		String location1=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//following-sibling::tr[contains(@id,'item_row_')]//td[contains(text(),'"+location+"')]")).getText();
//		String location2=driver.findElement(By.xpath("//tr[@id='"+rowId+"']//td[contains(text(),'"+location+"')]")).getText();
		
		if(item_name.equals(item_name_copied)&& quantity1.equals(quantity2) && amount1.equals(amount2) )
		{
			test.pass("Make a copy Functionality is working");
			System.out.println("Make a copy is working");
		}
		else
		{
			test.fail("Make a copy Functionality is not working");
			System.out.println("make a copy is not working");
		}	
		
		
	}
	public void insert(String item,String quantity2, String amount2, ExtentTest test) throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='item_splits']//td[contains(text(),'"+item+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(5000);
		parentTr.click();
		Thread.sleep(5000);
		insert_item.click();
	 	jsx.executeScript("window.scrollBy(0,150)", "");
	 	Thread.sleep(2000);
		WebElement lineItem2 = driver.findElement(By.xpath("//table[@id='item_splits']//td[contains(text(),'"+item+"')]"));
		WebElement parentTr1 = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem2);
		String rowId1 = parentTr1.getAttribute("id");
		driver.findElement(By.xpath("//tr[@id='"+rowId1+"']//preceding-sibling::tr[contains(@id,'item_row')]//td[2]")).click();
		Item_arrow.click();
		item_list.click();
		Item_searchbox.sendKeys(item);
		Item_search.click();
		Thread.sleep(10000);
		for(int k=0;k<items_list.size();k++)
		{
			if(items_list.get(k).getText().equals(item))
			{
				items_list.get(k).click();
				break;
			}
		}
		Thread.sleep(5000);
		action.doubleClick(Quantity).build().perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		Quantity.sendKeys("1");
		driver.findElement(By.xpath("//tr[@id='"+rowId1+"']//preceding-sibling::tr[contains(@id,'item_row')]//td[8]")).click();
		this.rate.sendKeys("100");
		driver.findElement(By.xpath("//tr[@id='"+rowId1+"']//preceding-sibling::tr[contains(@id,'item_row')]//td[9]")).click();
		Amount.clear();
		Amount.sendKeys("100");
		Thread.sleep(5000);
		add_item.click();
		Thread.sleep(2000);
		String item_name1=driver.findElement(By.xpath("//tr[@id='"+rowId+"' ]//td[contains(text(),'"+item+"')]")).getText();
		String item_name2=driver.findElement(By.xpath("//tr[@id='"+rowId1+"']//td[contains(text(),'"+item+"')]")).getText();
		if(item_name1.equals(item_name2))
		{
			if(item_name2.equals(item))
			{
				if(item.equals(item_name1))
				{
					test.pass("Insert Functionality is working");
				}
			}
		}
		else
		{
			test.fail("Insert functionality is not working");
		}

		
		
	}

	public void remove(String item, String quantity2, String amount2, ExtentTest test2) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement lineItem = driver.findElement(By.xpath("//table[@id='item_splits']//td[contains(text(),'"+item+"')]"));
		WebElement parentTr = (WebElement)js.executeScript("return arguments[0].parentNode;", lineItem);
		String rowId = parentTr.getAttribute("id");
		Thread.sleep(5000);
		parentTr.click();
		Thread.sleep(5000);
		remove_item.click();
		Thread.sleep(2000);
		try
		{
		String item_name1=driver.findElement(By.xpath("//tr[@id='"+rowId+"' ]//td[contains(text(),'"+item+"')]")).getText();
		test2.fail("Item is not removed ");
		}
		catch(Exception e)
		{
			test2.pass("Item is removed successfully");
		}
		
	}
	public void select_form(String form_name) throws InterruptedException
	{
		form_arrow.click();
		for(int i=0;i<form_list.size();i++)
		{
			if(form_list.get(i).getText().trim().equals(form_name))
			{
				form_list.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		
	}
	
	public void form_test(String field[], String mandatory[], String show[], String display_type[],ExtentTest test) throws InterruptedException
	{
		driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/custom/custform.nl?id=137&nl=F&ft=TRANSACTION&tt=SalesOrd&ol=F&e=T");
		String form_name=driver.findElement(By.xpath("//input[@id='formname']")).getAttribute("value").trim();
		screen_fields_tab.click();
		String class_text=null;
		Thread.sleep(2000);
		jsx.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		
		for(int i=0;i<show.length;i++)
		{
			String row=driver.findElement(By.xpath("//table[@id='mainflds_splits']//input[contains(@value,'"+field[i]+"')]//parent::span//parent::td//parent::tr")).getAttribute("id").trim();
			String show_class_text=driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).getAttribute("class").trim();
			String mandatory_clas_text=driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).getAttribute("class").trim();
		if(show[i].equals("No"))
		{
			if(show_class_text.trim().equals("checkbox_ck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).click();
			}
			
		}
		else
		{
			if(show_class_text.trim().equals("checkbox_unck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Mandatory']//preceding-sibling::td)]//span")).click();
			}
			
		}
		if(mandatory[i].equals("No"))
		{
			if(mandatory_clas_text.trim().equals("checkbox_ck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).click();
			}
			
		}
		else
		{
			if(mandatory_clas_text.trim().equals("checkbox_unck"))
			{
				driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Display Type']//preceding-sibling::td)]//span")).click();
			}
			
		}
		if(display_type[i].equals("Disabled"))
		{
			//jsx.executeScript("arguments[0].scrollIntoView(true);",row);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tr[@id='"+row+"']//td[count(//table[@id='mainflds_splits']//td[@data-label='Check Box Default']//preceding-sibling::td)]//input")).click();
			for(int j=0;j<disabled_dropdown.size();j++)
			{
				if(disabled_dropdown.get(j).getText().equals("Disabled"))
				{
					disabled_dropdown.get(j).click();
					break;
				}
			}
			
		}	
		
		
		}
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		Thread.sleep(4000);
	    jsx.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[@id='spn_secondarymultibutton_submitter']")).click();
	    if(isAlertPresent_()==true)
	    {
	    	Alert alert=driver.switchTo().alert();
	    	alert.accept();
	    }
	    Thread.sleep(8000);
	    navigateToSO("Customized  SO form for testing");
	    Thread.sleep(5000);
	   if (!memo.isDisplayed())
	   {
		   test.pass("Memo is not displaying in custom form");
	   }
	   else
	   {
		   test.fail("Memo is displaying in custom form");
	   }
	   if(!sales_rep.isEnabled())
	   {
		   test.pass("Sales rep is disabled");
	   }
	   else
	   {
		   test.fail("Sales rep is not disabled");
	   }
	   if(department_mandatory.getText().equals("*"))
	   {
		   test.pass("Department is displayed as mandatory field");
	   }
	   else
	   {
		   test.fail("Department is not displayed as mandatory field");
	   }
	   if(location_mandatory.getText().trim().equals("*"))
	   {
		   test.pass("Location is displayed as mandatory field");
	   }
	   else
	   {
		   test.fail("Location is not displayed as mandatory field");
	   }
	   if(class_mandatory.getText().equals("*"))
	   {
		   test.pass("Class is displayed as mandatory field");
	   }
	   else
	   {
		   test.fail("Class is not displayed as mandatory field");
	   }
		
	}
	
	
	

}
	