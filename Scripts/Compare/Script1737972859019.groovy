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
import com.opencsv.CSVWriter
import java.io.FileWriter
import groovy.json.JsonSlurper


//TestData testData = findTestData('testdata') 
//ArrayList<Float> b = new ArrayList<Float>() 
//for (int i = 1; i <= testData.getRowNumbers(); i++) {
//	String a = testData.getValue(1, i)
//
//	try {
//		Float floatValue = a.toFloat() 
//		b.add(floatValue) 
//		println("${floatValue}") 
//	} catch (NumberFormatException e) {
//		println("'$a'") 
//	}
//}



TestData testData = findTestData('testdata')
String a=testData.allData;
println(a)

File file = new File("C:\\Users\\Lenovo\\Katalon Studio\\Unified Testing\\CSVproductscanresult.csv")
file.createNewFile()
file.append(a)











//
//ArrayList b=new Arraylist();
//
//for(int i:a)
//{
//b.add(i)
//Float intValue = i.toFloat() // Convert string to Integer
//println(intValue) // Print the integer value
//println(b)
//}
//def inputData = new JsonSlurper().parseText(a)
//
//println(a)


//a = a.replace('null', 'null') // Ensure proper null handling
//def parsedResult = Eval.me(a)
//
//a = a.replace(", ,", ", null,") // Handle empty values
//a = a.replace("null", "null") // Ensure 'null' is valid
//a = a.replace("'", "\"") // Replace single quotes with double quotes if needed
//
//println(parsedResult) // This will be a nested list
//def firstRow = parsedResult[0]
//def column0 = firstRow[0]
//def column2 = firstRow[2]

//
//print(firstRow)
//print(column0)
//print(column2)




//String a=testData.getValue("LineNetAmt", 1)
//print(a)
//def resultset=statement.executeQuery(query)
//String expectedData = GlobalVariable.extractedText






