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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/div_Password_divLoginHelpLink'))

WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_Password_Submit'))

WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/a_Users'))

WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'Dominic Chase')

WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseruserName'), 'Eastwood')

WebUI.setEncryptedText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserpassword'), '+yAbjTIM4Ryl3xNd1JPOUA==')

WebUI.setEncryptedText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserconfirmPassword'), '+yAbjTIM4Ryl3xNd1JPOUA==')

WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__btnSave'))

WebUI.closeBrowser()
