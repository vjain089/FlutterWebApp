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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://2023071308.cypress-asp-gke-rba-pos.dev.aidencloud.eu/#/')

WebUI.setText(findTestObject('Object Repository/Page_Aiden Cloud User Portal/input_Retail Flutter Pos Client_Input.Organization'), 
    'C01')

WebUI.setText(findTestObject('Object Repository/Page_Aiden Cloud User Portal/input_Organization_Input.Username'), 'katalon')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aiden Cloud User Portal/input_Username_Input.Password'), 'xSEXy/5U3tx8KW40H+YXew==')

WebUI.click(findTestObject('Object Repository/Page_Aiden Cloud User Portal/button_Login'))

WebUI.delay(50)

WebUI.waitForElementVisible(findTestObject('Page_Retail by Aiden/input-searchitem'), 10)

WebUI.sendKeys(findTestObject('Object Repository/Page_Retail by Aiden/input-searchitem'), Keys.chord('K167978', Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Page_Retail by Aiden/input-searchitem'), 10)

WebUI.sendKeys(findTestObject('Object Repository/Page_Retail by Aiden/input-searchitem'), Keys.chord('130.456PCE', Keys.ENTER))

WebUI.delay(20)

WebUI.doubleClick(findTestObject('Page_Retail by Aiden/Btn-AddQuantity'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Retail by Aiden/btn-Finish'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Retail by Aiden/flt-semantics_Test item 130 aantal bepaald _d0519c'))

