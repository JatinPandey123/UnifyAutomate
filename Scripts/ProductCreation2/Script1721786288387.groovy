import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.text.SimpleDateFormat
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

// Database connection parameters
String url = 'jdbc:mysql://172.24.2.216:51759/UnifiedDB'
String user = ''
String password = ''

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-unify.etpgroup.sg/')

WebUI.setText(findTestObject('Object Repository/Page_Unify/input_English_txtusername (1)'), 'jatin.pandey1@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Unify/input_English_password (1)'), 'VuadyrRfVheR9YeqDQOHY9D6p51Y6Rq3')

WebUI.click(findTestObject('Object Repository/Page_Unify/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Unify/p_Sylphy Test'))

WebUI.click(findTestObject('Object Repository/Page_Unify/img_Stock Take_4img'))

WebUI.click(findTestObject('Object Repository/Page_Unify/a_Product Master'))

WebUI.click(findTestObject('Object Repository/Page_Unify/span__close'))

WebUI.click(findTestObject('Object Repository/Page_Unify/button_SINGLE PRODUCT'))

WebUI.setText(findTestObject('Object Repository/Page_Unify/input__text-field form-control ng-untouched_6e11e0'), 'casu')

WebUI.click(findTestObject('Object Repository/Page_Unify/span_Casual Watches  (3443322)'))

// Path to the CSV file
String filePath = "C:/Users/Lenovo/Desktop/ProductMaster.csv"

// Get the current date as a formatted string (day only)
String currentDate = new SimpleDateFormat("dd").format(new Date())

BufferedReader bufferedReader = null

	// Create a BufferedReader object
	bufferedReader = new BufferedReader(new FileReader(filePath))
	
	String line
	// Read each line from the CSV file
	while ((line = bufferedReader.readLine()) != null) {
		// Split the line into cells
		String[] cells = line.split(",")
		
		// Process each cell
		for (String cell : cells) {
			
			String productcode = cells[0]
			String productname=cells[1]
			//String productdescription=cell
			
			
			// Print the concatenated value
			println(productcode)



WebUI.setText(findTestObject('Object Repository/Page_Unify/input__productCode'), productcode)

WebUI.setText(findTestObject('Object Repository/Page_Unify/textarea__text-field form-control textarea-_f7e447'), productname)

WebUI.click(findTestObject('Object Repository/Page_Unify/span_--Select Season--'))

WebUI.click(findTestObject('Object Repository/Page_Unify/span_Autumn'))

WebUI.click(findTestObject('Object Repository/Page_Unify/mat-select_--Select Pricepoint--'))

WebUI.click(findTestObject('Object Repository/Page_Unify/span_Addidas PricePoint'))

WebUI.click(findTestObject('Object Repository/Page_Unify/div_--Select UOM--'))

WebUI.click(findTestObject('Object Repository/Page_Unify/span_Bag'))

WebUI.click(findTestObject('Object Repository/Page_Unify/mat-select_--Select HSN Code--'))

WebUI.click(findTestObject('Object Repository/Page_Unify/span_2435553'))

//input[@placeholder="Enter URL"]
WebUI.setText(findTestObject('Object Repository/Page_Unify/input[@placeholder="Enter URL"]'), 'https://images.pexels.com/photos/90946/pexels-photo-90946.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500')

WebUI.click(findTestObject('Object Repository/Page_Unify/span_SAVE'))

WebUI.click(findTestObject('Object Repository/Page_Unify/button_No'))

WebUI.click(findTestObject('Object Repository/Page_Unify/button_No'))

	
	// Load JDBC driver
	Class.forName('com.mysql.cj.jdbc.Driver')
	Connection connection = DriverManager.getConnection(url, user, password)
	
	// Execute a query
	String query = "SELECT * FROM tbl_Product WHERE ='" + productcode + "'"
	//	String query ="SELECT * FROM tbl_Product where id";
	Statement stmt = connection.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	
	while (rs.next()) {
	   String expectedData = "3254532";
	   String expectedData2="Casual Shirts for Men43";
	   String actualData = rs.getString("ProductCode");
	   String actualData2=rs.getString("ProductName");
		System.out.println(expectedData  + " " + actualData);
		
		 if (expectedData.equals(actualData))
		{
			System.out.println("Product data verification success for Product Code")
		}else
		{
			System.out.println("Product data verfication fail")
		}
		
		if(expectedData.equals(actualData2))
		{
		System.out.println("Product data verfication for Product Name success")
		}else {
		System.out.println("Product data verification fail for Product Name")
			}
		}
		}
	}