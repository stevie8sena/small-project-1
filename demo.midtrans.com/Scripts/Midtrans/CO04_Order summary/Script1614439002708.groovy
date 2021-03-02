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

WebUI.switchToFrame(findTestObject('Midtrans/Order Summary/order_summary_frame'), 0)

WebUI.delay(2)

actualResult = WebUI.getText(findTestObject('Midtrans/Order Summary/name_product'))

expectedResult = 'Midtrans Pillow'

WebUI.verifyMatch(actualResult, expectedResult, false)

actualAmount = WebUI.getText(findTestObject('Midtrans/Order Summary/table_amount'))

expectedAmount = '30,000'

WebUI.verifyMatch(actualAmount, expectedAmount, false)

WebUI.click(findTestObject('Midtrans/Order Summary/shipping_detail_tab'))

actualAmount = WebUI.getText(findTestObject('Midtrans/Order Summary/name_detail'))

expectedAmount = 'Budi Utomo'

WebUI.verifyMatch(actualAmount, expectedAmount, false)

actualAmount = WebUI.getText(findTestObject('Midtrans/Order Summary/address_detail'))

expectedAmount = 'Jl. Kenangan No 5 Bandung 55166'

WebUI.verifyMatch(actualAmount, expectedAmount, false)

actualAmount = WebUI.getText(findTestObject('Midtrans/Order Summary/phone_number_detail'))

expectedAmount = '+62887654321'

WebUI.verifyMatch(actualAmount, expectedAmount, false)

actualAmount = WebUI.getText(findTestObject('Midtrans/Order Summary/email_detail'))

expectedAmount = 'budi@utomo.com'

WebUI.verifyMatch(actualAmount, expectedAmount, false)

WebUI.click(findTestObject('Midtrans/Order Summary/btn_continue'))

