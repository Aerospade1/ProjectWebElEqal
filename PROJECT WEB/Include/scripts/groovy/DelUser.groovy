import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class DelUser {
	/*
	@Given("User is on login page")
	public void atlogin() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')
	}

	@When("User fills details with (.*) and (.*)")
	public void EnteredCredentials(String Username, String Password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Username)
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Username_txtPassword'), Password)
	}

	@When("User is sent flying to Users page")
	public void flytoUsers() {
		WebUI.mouseOver(findTestObject('Search User/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('Search User/Page_OrangeHRM/a_User Management'))
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/a_Users'))
	}

	@And("User uses Login Button")
	public void	Clicksonlogin() {
		WebUI.click(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("User is sent flying to home page")
	public void flytohome() {
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')
	}

	@Then("User Ticks Checkboxes")
	public void TickCheckBoxes() {
		WebUI.check(findTestObject(By.xpath('ohrmList_chkSelectRecord_50')))
		WebUI.check(findTestObject(By.xpath('ohrmList_chkSelectRecord_51')))
		WebUI.click(findTestObject('Object Repository/DelUser/Page_OrangeHRM/input_Status_btnDelete'))
	}*/
}