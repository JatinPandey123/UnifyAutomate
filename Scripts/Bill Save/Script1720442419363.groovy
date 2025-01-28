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

WebUI.openBrowser('')

//WebUI.navigateToUrl('https://test-unify.etpgroup.sg/pos/sell_c')
WebUI.delay(5)

//
WebUI.navigateToUrl('https://test-unify.etpgroup.sg/')

WebUI.maximizeWindow()

//
WebUI.setText(findTestObject('Object Repository/input_English_txtusername'), 'egs.enterprise@etpgroup.com')

//
WebUI.setText(findTestObject('Object Repository/input_English_password'), 'Egs@1612')

//
WebUI.click(findTestObject('Object Repository/button_LOGIN'))

//
//WebUI.click(findTestObject('Object Repository/p_Sylphy Test'))
//
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/img_Digitial Receipt Setup_15img'))

//
WebUI.click(findTestObject('Object Repository/div_Character Count  1_angular-editor-textarea'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/input__text-field form-control ng-untouched_6e11e0'), 'mumbai')

WebUI.click(findTestObject('Object Repository/div_Mumbai Store 1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/div_counter2977  C2977'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/button_Begin Shift'))

WebUI.click(findTestObject('Object Repository/button_Yes'))

//WebUI.click(findTestObject('Object Repository/button_OK'))
WebUI.delay(10)

WebUI.click(findTestObject('clickcustomer'))

WebUI.click(findTestObject('clickapply'))

WebUI.delay(10)

WebUI.doubleClick(findTestObject('clickonkar'))

WebUI.click(findTestObject('Object Repository/input_Select Units of Measurement_Length'))

WebUI.click(findTestObject('select salesperson'))

WebUI.click(findTestObject('Object Repository/path_Product Qty_Path_6168'))

WebUI.setText(findTestObject('Object Repository/td_1000'), 'FA1101')

WebUI.click(findTestObject('clickproduct'))

WebUI.click(findTestObject('Object Repository/div_CHECKOUT'))

WebUI.click(findTestObject('clickaipopupproduct'))

TestObject myElement = findTestObject('Object Repository/netamount')

String extractedText = WebUI.getText(myElement)

println(extractedText)

GlobalVariable.extractedText = extractedText

WebUI.click(findTestObject('clickcash'))

WebUI.click(findTestObject('Object Repository/button_ACCEPT'))

WebUI.click(findTestObject('Object Repository/div_SUBMIT'))

WebUI.click(findTestObject('Object Repository/div_SAVE'))

