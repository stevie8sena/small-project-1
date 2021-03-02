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

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/select_cc'))

WebUI.setText(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/txt_cc'), '4811 1111 1111 1114')

WebUI.setText(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/txt_exp_cc'), '01 / 25')

WebUI.setText(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/txt_cvv'), '123')

WebUI.click(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/promo_10'))

WebUI.click(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/btn_PAYNOW'))

WebUI.delay(10)

WebUI.setEncryptedText(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/txt_password_otp'), '4tAN/DuJV7Y=')

WebUI.click(findTestObject('Object Repository/Record Midtrans/Page_Sample Store/btn_OK_otp'))

WebUI.delay(7)

WebUI.verifyTextPresent('Thank you for your purchase.', false)

WebUI.verifyTextPresent('Get a nice sleep.', false)

WebUI.closeBrowser()

