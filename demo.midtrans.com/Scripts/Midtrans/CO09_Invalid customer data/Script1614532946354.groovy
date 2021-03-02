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

WebUI.deleteAllCookies()

def NegativeData = findTestData('Data Files/Midtrans/Database Negative')

for (def baris = 1; baris <= 3; baris++) {
    WebUI.click(findTestObject('Midtrans/Main/btn_buy'))

    WebUI.setText(findTestObject('Object Repository/Midtrans/Shopping Cart/txt_email'), NegativeData.getValue('Email', baris))

    WebUI.setText(findTestObject('Object Repository/Midtrans/Shopping Cart/txt_phone_number'), NegativeData.getValue('Phone No', 
            baris))

    WebUI.click(findTestObject('Object Repository/Midtrans/Shopping Cart/btn_checkout'))

    def actualError = WebUI.getText(findTestObject('Object Repository/Midtrans/Main/error_warning'))

    WebUI.verifyMatch(actualError, NegativeData.getValue('Expected Error', baris), false)
}

WebUI.closeBrowser()

