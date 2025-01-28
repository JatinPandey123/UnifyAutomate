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
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.text.SimpleDateFormat as SimpleDateFormat
import java.sql.Connection as Connection
import java.sql.DriverManager as DriverManager
import java.sql.ResultSet as ResultSet
import java.sql.Statement as Statement


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-unify.etpgroup.sg/')

WebUI.waitForPageLoad(100)

WebUI.setText(findTestObject('Object Repository/input_English_txtusername'), 'jatin.pandey1@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_English_password'), 'VuadyrRfVheR9YeqDQOHY9D6p51Y6Rq3')

WebUI.click(findTestObject('Object Repository/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/div_Sylphy Test'))

WebUI.click(findTestObject('Object Repository/img_Stock Take_4img'))

WebUI.click(findTestObject('Object Repository/a_UOM Conversion'))

WebUI.click(findTestObject('Object Repository/button_ALTERNATE UOM VALUE_hb-add-icon-btn'))

// Path to the Excel file
//String filePath = 'C:/Users/Lenovo/Desktop/UOM.xlsx'

// Create a FileInputStream object
//FileInputStream fileInputStream = new FileInputStream(new File(filePath))

// Create a Workbook object
//Workbook workbook = new XSSFWorkbook(fileInputStream)

// Get the first sheet
//Sheet sheet = workbook.getSheetAt(0)

// Iterate through the rows (starting from the second row if the first row contains headers)
//for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//    Row row = sheet.getRow(i)

    // Extract the required values from the row
  //  String Uomset = row.getCell(0).toString()
	
//	System.out.println(Uomset)
//
//    String baseUomValue = row.getCell(1).toString()
//	
//	System.out.println(baseUomValue)
//	
//    String alternateUomValue = row.getCell(2).toString()
//
//	System.out.println(alternateUomValue)
	
// Path to the CSV file
String filePath = "C:/Users/Lenovo/Desktop/UOM.csv"

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
			String UOMset = cell[i]
			String baseuom=cell[i+1]
			String baseuomset=cell[i+2]
			
			
			// Print the concatenated value
		//	println(productcode)



    // Set the text in the web element
    WebUI.setText(findTestObject('Object Repository/input_UOM Set Name_uomset'), UOMset)

    WebUI.setText(findTestObject('Object Repository/input_ALTERNATE UOM_baseuomvalu'), baseuom)

    WebUI.click(findTestObject('Object Repository/span_Select Base UOM Value'))

    WebUI.click(findTestObject('Object Repository/span_BX - Box1'))

    WebUI.setText(findTestObject('Object Repository/input__alternateuomvalue'), baseuomset)

    WebUI.click(findTestObject('Object Repository/span_Select Alternate UOM Value'))

    WebUI.click(findTestObject('Object Repository/span_BND - Bundle'))

    WebUI.click(findTestObject('Object Repository/button_ADD'))

    WebUI.click(findTestObject('Object Repository/button_SAVE'))
	
	//WebUI.click(findTestObject('Object Repository/Page_Unify/simple-snack-bar_Unit Of Measure Updated Su_c01e59'))
	
	//WebUI.click(findTestObject('Object Repository/Page_Unify/span_Unit Of Measure Updated Successfully'))

  //  workbook.close()

  //  fileInputStream.close()
}
	}
