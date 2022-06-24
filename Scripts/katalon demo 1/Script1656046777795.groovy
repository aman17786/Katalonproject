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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Gmail/span_Create account'))

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Gmail/span_For myself'))

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_to continue to Gmail_firstName'), 
    'aman')

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_to continue to Gmail_lastName'), 
    'sdf')

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_to continue to Gmail_Username'), 
    'adfdgszdg')

WebUI.setEncryptedText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_You can use letters, numbers  periods_Passwd'), 
    'mXG5oXrXSyLji1sGE4gK+Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_You can use letters, numbers  periods_173447'), 
    'mXG5oXrXSyLji1sGE4gK+Q==')

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_Use 8 or more characters with a mix o_b60f5c'))

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/span_Next'))

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_Phone number_phoneNumberId'), 
    '6472197427')

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/span_Next'))

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_G-_code'), '418124')

not_run: WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/span_Verify'))

WebUI.selectOptionByValue(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_Month_day'), 
    '4')

WebUI.setText(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/input_Month_year'), 
    '1993')

WebUI.selectOptionByValue(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/select_FemaleMaleRather not sayCustom'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/span_Next'))

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/span_Skip'))

WebUI.click(findTestObject('Object Repository/gmail create account/Page_Create your Google Account/div_Send me occasional reminders about thes_0c9643'))

