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

WebUI.navigateToUrl('https://katalon-2e-dev-ed.develop.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fkatalon-2e-dev-ed.develop.lightning.force.com%252Flightning%252F')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'vaibhav-jain@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), 'icP23tTPdjsOed6Z/XwIKg==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Verify Your Identity  Salesforce/input_Verification Code_smc'), '219859')

WebUI.click(findTestObject('Object Repository/Page_Verify Your Identity  Salesforce/input_Verification Code_save'))

WebUI.click(findTestObject('Object Repository/Page_Home  Salesforce/span_Leads'))

WebUI.click(findTestObject('Object Repository/Page_Recently Viewed  Leads  Salesforce/div_New'))

WebUI.closeBrowser()

