package tiket

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



class loginTiket {

	@Given("go to url login tiket")
	def go_to_url_login_tiket() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		'Delete all cookies after browser is opened'
		WebUI.deleteAllCookies()
		WebUI.refresh()
		WebUI.navigateToUrl('https://www.tiket.com/login')
	}

	@When("user klik login with facebook")
	def user_klik_login_with_facebook() {
		WebUI.click(findTestObject('Object Repository/pageLoginTiket/selectLoginWithFB'))
		WebUI.delay(5)
		'Switch to url login fb'
		WebUI.switchToWindowTitle('Facebook')
	}

	@Then("user input email")
	def user_input_email() {
		WebUI.setText(findTestObject('Object Repository/pageLoginTiket/inputEmailFB'), 'ariefrahmanhakim0104@gmail.com')
		WebUI.delay(2)
	}

	@And("user input password")
	def user_input_password() {
		WebUI.setText(findTestObject('Object Repository/pageLoginTiket/inputPassFB'), 'Salsa@21')
		WebUI.delay(2)
	}

	@And("user klik login")
	def user_klik_login() {
		WebUI.click(findTestObject('Object Repository/pageLoginTiket/loginButton'))
		WebUI.delay(3)
		WebUI.switchToWindowIndex(0)
	}

	@And("verify landing page login")
	def verify_landing_page_login() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/pageLoginTiket/verifyPageLoginTiket'))
		WebUI.delay(1)
	}
}