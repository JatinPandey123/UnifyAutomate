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

// Database connection parameters
String url = 'jdbc:mysql://172.24.2.216:51759/UnifiedDB'
String user = 'jatin.pandey'
String password = ''
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-unify.etpgroup.sg/')

WebUI.setText(findTestObject('Object Repository/input_English_txtusername'), 'jatin.pandey@etpgroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_English_password'), 'VuadyrRfVheR9YeqDQOHY9D6p51Y6Rq3')

WebUI.sendKeys(findTestObject('Object Repository/input_English_password'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_English_txtusername'), 'jatin.pandey1@mailinator.com')

WebUI.click(findTestObject('Object Repository/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/p_Sylphy Test'))

WebUI.click(findTestObject('Object Repository/a_PRODUCT MANAGEMENT PRODUCT MANAGEMENTProd_ec13a1'))

WebUI.click(findTestObject('Object Repository/a_Product Master'))

WebUI.click(findTestObject('Object Repository/span_TestTagsCommon,test2common10,testtestt_1776e8'))

WebUI.click(findTestObject('Object Repository/button_SINGLE PRODUCT'))

WebUI.setText(findTestObject('Object Repository/input__text-field form-control ng-untouched_6e11e0'), 'ca')

WebUI.click(findTestObject('Object Repository/input__text-field form-control ng-untouched_6e11e0'))

WebUI.click(findTestObject('Object Repository/span_Casio G-Shock Watches 3 (8963432)'))

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
			// Concatenate cell value with current day and assign to productcode
			int i=0;
			String productcode = cell[i]
			String productname=cell[i+1]
			String productdescription=cell[i+2]
			
			
			// Print the concatenated value
			println(productcode)
	

WebUI.setText(findTestObject('Object Repository/input__productCode'), productcode)

WebUI.setText(findTestObject('Object Repository/textarea__text-field form-control textarea-_f7e447'), productname)

WebUI.click(findTestObject('Object Repository/div_--Select Product Type--'))

WebUI.click(findTestObject('Object Repository/span_Finished Goods'))

WebUI.click(findTestObject('Object Repository/div_--Select Brand--'))

WebUI.click(findTestObject('Object Repository/span_ADIDAS'))

WebUI.click(findTestObject('Object Repository/span_--Select Product Category--'))

WebUI.click(findTestObject('Object Repository/span_BATACAT'))

WebUI.click(findTestObject('Object Repository/div_--Select Product Sub Category--'))

WebUI.click(findTestObject('Object Repository/span_BATA SUB CATEGORY'))

WebUI.click(findTestObject('Object Repository/span_--Select Product Class--'))

WebUI.click(findTestObject('Object Repository/span_BATACLS'))

WebUI.click(findTestObject('Object Repository/div_--Select Season--'))

WebUI.click(findTestObject('Object Repository/span_All Seasons'))

WebUI.click(findTestObject('Object Repository/mat-select_--Select Department--'))

WebUI.click(findTestObject('Object Repository/span_--Select Department--'))

WebUI.click(findTestObject('Object Repository/span_BATADEPARTMENT'))

WebUI.click(findTestObject('Object Repository/div_--Select Pricepoint--'))

WebUI.click(findTestObject('Object Repository/span_Addidas PricePoint'))

WebUI.click(findTestObject('Object Repository/span_--Select Procruement Group--'))

WebUI.click(findTestObject('Object Repository/span_BATAPROCUREMENTGROUP'))

WebUI.click(findTestObject('Object Repository/span_--Select Product Subclass--'))

WebUI.click(findTestObject('Object Repository/span_AntiAging'))

WebUI.click(findTestObject('Object Repository/div_--Select Product Segment--'))

WebUI.click(findTestObject('Object Repository/span_BATASEGMENT'))

WebUI.click(findTestObject('Object Repository/div_--Select UOM--'))

WebUI.click(findTestObject('Object Repository/span_Bowl'))

WebUI.setText(findTestObject('Object Repository/input__floatTextBox'), '1000')

WebUI.setText(findTestObject('Object Repository/input__floatTextBox_1'), '1000')

WebUI.click(findTestObject('Object Repository/mat-select_--Select HSN Code--'))

WebUI.click(findTestObject('Object Repository/span_61051010'))

WebUI.setText(findTestObject('Object Repository/input_Sales Price_salesPrice'), '1000')

WebUI.setText(findTestObject('Object Repository/input_Offer Price_offerPrice'), '1000')

WebUI.setText(findTestObject('Object Repository/input_Cost Price_costPrice'), '1000')

WebUI.setText(findTestObject('Object Repository/input_Default Buffer Stock_uintTextBox'), '1000')

WebUI.setText(findTestObject('Object Repository/input_Sales Price Quantity_salesPriceQuantity'), '1000')

WebUI.setText(findTestObject('Object Repository/input_Sales Price AUOM_altsalespriceuom'), '1000')

WebUI.setText(findTestObject('Object Repository/div_Character Count  1_angular-editor-textarea'), productdescription)

WebUI.click(findTestObject('Object Repository/button_SAVE'))

WebUI.click(findTestObject('Object Repository/button_No'))

WebUI.click(findTestObject('Object Repository/button_No'))

		}
	}
