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



class ALLinONE {

	@Given("User Navigate to login page")
	public void gotologin() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/auth/login')
	}

	@When("User fill in the details for (.*) and (.*)")
	public void I_check_for_the_value_in_step(String Username, String Password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Username)
		WebUI.setText(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Username_txtPassword'), Password)
	}

	@When("User Clicks Forgot Password Text")
	public void GotoForgotPassword() {
		WebUI.click(findTestObject('Object Repository/Reset Password/Page_OrangeHRM/a_Forgot your password'))
	}

	@When("User MouseOver Admin")
	public void MoAdmin() {
		WebUI.mouseOver(findTestObject('Search User/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/a_User Management'))
		WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/a_Users'))
	}
	@When("User MouseOver JobTitle")
	public void MoJobTitle() {
		WebUI.mouseOver(findTestObject('Search User/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Job'))
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Job Titles'))
	}

	@When("User enters new user details (.*), (.*), (.*) and (.*)")
	public void newuserdetails(String STAFF, String USRNAME, String PWD, String PWD2 ) {
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseremployeeNameempName'), STAFF)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseruserName'), USRNAME)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserpassword'), PWD)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserconfirmPassword'), PWD2)
	}

	@When("User Upload File")
	public void Uploadfile() {
		WebUI.uploadFile(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Specification_jobTitlejobSpec'), 'C:\\Users\\Aero\\OneDrive\\Desktop\\HEHE.JPG')
	}

	@When("User add PicMoreThan1MB")
	public void ErrorUploadfile() {
		WebUI.uploadFile(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Specification_jobTitlejobSpec'), 'C:\\Users\\Aero\\OneDrive\\Desktop\\Teh.JPG')
	}

	@When("User MoveOverES")
	public void MOES() {
		WebUI.mouseOver(findTestObject('Search User/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Job'))
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/a_Employment Status'))
	}

	@And("User Clicks Login Button")
	public void	Clicklogin() {
		WebUI.click(findTestObject('Object Repository/Login/Page_OrangeHRM/input_Password_Submit'))
	}


	@And("User Enters (.*)")
	public void FillsUsername(String FUsername) {
		WebUI.setText(findTestObject('Object Repository/Reset Password/Page_OrangeHRM/input_OrangeHRM Username_securityAuthenticationuserName'), FUsername )
	}

	@Then("Alert User Invalid Account")
	public void Show() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/LoginError/Page_OrangeHRM/span_Invalid credentials'))
	}

	@Then("User Clicks on Reset Password Button")
	public void Resetnow() {
		WebUI.click(findTestObject('Object Repository/Reset Password/Page_OrangeHRM/input_OrangeHRM Username_button'))
	}

	@Then("User Input Details with (.*) and (.*)")
	public void EnterDetails(String UsrNm, String EmployeeName) {
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Username_searchSystemUseruserName'), UsrNm)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllAdminESS'), '2', true)
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Employee Name_searchSystemUseremploye_55f714'),EmployeeName)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllEnabledDisabled'), '1',true)
	}

	@Then("User Input False Details with (.*) and (.*)")
	public void FalseDetails(String EUsrNm, String EEmployeeName) {
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Username_searchSystemUseruserName'), EUsrNm)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllAdminESS'), '2', true)
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Employee Name_searchSystemUseremploye_55f714'),EEmployeeName)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllEnabledDisabled'), '1',true)
	}
	@Then("User Clicks Search Button")
	public void goSearch() {
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Status__search'))
		WebUI.delay(4)
		WebUI.closeBrowser()
	}
	@Then("User Clicks Add Button")
	public void AddButton() {
		WebUI.click(findTestObject('Object Repository/AddUser/Page_OrangeHRM/input_Status_btnAdd'))
	}
	@Then("User Clicks Save")
	public void SaveNow() {
		WebUI.click(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__btnSave'))
		WebUI.delay(2)
	}
	@Then("User Tries to Skip the details")
	public void Tried1() {
		WebUI.delay(2)
	}

	@Then("User tried again (.*), (.*), (.*) AND (.*)")
	public void Tried2(String STAFF, String USRNAME, String PASS, String PASS2) {
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseremployeeNameempName'), STAFF)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseruserName'), USRNAME)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserpassword'), PASS)
		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUserconfirmPassword'), PASS2)
	}
	@Then("User tried to use Used (.*)")
	public void Tried3(String USR2) {

		WebUI.setText(findTestObject('Object Repository/TESTEST/Page_OrangeHRM/input__systemUseruserName'), USR2)
	}
	@Then("Close Browser")
	public void KillBrowser() {
		WebUI.closeBrowser()
	}
	@Then("User Clicks Add Job")
	public void AddJob() {
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnAdd'))
	}

	@Then ("User Entered Job Details for (.*), (.*) and (.*)")
	public void AddJobDetails(String JobTitle,String JobDesc, String Note) {
		WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), JobTitle)
		WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), JobDesc)
		WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Note_jobTitlenote'), Note)
	}
	@Then ("User Clicks Save Job Title")
	public void ClickSaveJobTitle() {
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))
		WebUI.delay(4)
	}
	@Then("User Revise Job Details")
	public void ReEnterJobDetails() {
		WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'Tester')
	}
	@Then("User Delete Account")
	public void DelAcc() {
		WebUI.click(findTestObject('Object Repository/DelUser/Page_OrangeHRM/a_EQALJ'))
		//WebUI.click(findTestObject('Object Repository/DelUser/Page_OrangeHRM/a_HarryKane'))
		WebUI.click(findTestObject('Object Repository/DelUser/Page_OrangeHRM/input_Status_btnDelete'))
		WebUI.click(findTestObject('Object Repository/DelUser/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogDeleteBtn'))
	}
	@Then("User Picks Jobs to delete")
	public void TickJobstoDelete() {
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Finance Manager'))
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Financial Analyst'))
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnDelete'))
		WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogDeleteBtn'))
	}
	@Then("User Adds New Employment Status with (.*)")
	public void AddnewES(String ES) {
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/input_Employment Status_btnAdd'))
		WebUI.setText(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/input__empStatusname'), ES)
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/input__btnSave'))
	}

	@Then("User Adds Again with (.*)")
	public void AddStatusAgain(String ES) {
		AddnewES(ES)
	}
	@Then("User DeleteES")
	public void DeleteES() {
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/a_Example'))
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/a_Test'))
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/input_Employment Status_btnDelete'))
		WebUI.click(findTestObject('Object Repository/Employment Status/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogDeleteBtn'))
	}
}