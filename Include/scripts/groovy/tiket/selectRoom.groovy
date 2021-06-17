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



class selectRoom {

	@Given("verify landing page select hotel")
	def verify_landing_page_select_hotel() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Hotel/Select Hotel And Room/verifyLandingPageSelectHotel'))
		WebUI.delay(1)
	}

	@When("user klik lihat kamar")
	def user_klik_lihat_kamar() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/buttonLihatKamar'))
		WebUI.delay(2)
	}

	@Then("user klik pilih kamar")
	def user_klik_pilih_kamar() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/buttonPilihKamar'))
		WebUI.delay(2)
	}
	
	@And("user klik pesan kamar")
	def user_klik_pesan_kamar() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/buttonPesanKamar'))
		WebUI.delay(2)
	}

	@And("user klik title detail pemesanan")
	def user_klik_title_detail_pemesanan() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/selectTitleDetailPemesanan'))
		WebUI.delay(2)
	}

	@And("user select title detail pemesanan")
	def user_select_title_detail_pemesanan() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/selectTuanDetailPemesanan'))
		WebUI.delay(1)
	}
	
	@And("user klik title detail tamu")
	def user_klik_title_detail_tamu() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/selectTitleDetailTamu'))
		WebUI.delay(2)
	}

	@And("user select title detail tamu")
	def user_select_title_detail_tamu() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/selectTuanDetailTamu'))
		WebUI.delay(1)
	}
	
	@And("user klik bebas asap rokok")
	def user_klik_bebas_asap_rokok() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/labelBebasAsapRokok'))
		WebUI.delay(1)
	}
	
	@And("user klik lanjut ke pembayaran")
	def user_klik_lanjut_ke_pembayaran() {
		WebUI.click(findTestObject('Object Repository/Hotel/Select Hotel And Room/buttonLanjutKePembayaran'))
		WebUI.delay(1)
	}
	
	@And("user verify landing page after pembayaran")
	def user_verify_landing_page_after_pembayaran() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Hotel/Select Hotel And Room/verifyLandingPageAfterLanjutPembayaran'))
		WebUI.delay(1)
	}
	
}