package imademethink_cucumber.StepDefinitions;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imademethink_cucumber.StepImplimentations.StepImplementation_CucumberProject;

public class StepDefinitions_CucumberProject {

	StepImplementation_CucumberProject handle =  new StepImplementation_CucumberProject();
	
	@Given("^Web application is running$")
	public void web_application_is_running() {
		System.out.println("Log:: ==Background steps===");
		handle.StartRequiredWebApplication();
	}

	@Given("^Secure login with captcha functionality is implemented$")
	public void secure_login_with_captcha_functionality_is_implemented() {
		handle.StartSecureLoginServiceWithCaptcha();
	}

	@Given("^On desktop browser on home page login button with captcha is available$")
	public void on_desktop_browser_on_home_page_login_button_with_captcha_is_available() {
		System.out.println("Log:: ==Scenario steps===");
		handle.LaunchDesktopBrowserWithHomePageAndLoginButtonAndCaptcha();
	}

	@Given("^After clicking on login button username password text box and captcha should be shown$")
	public void after_clicking_on_login_button_username_password_text_box_and_captcha_should_be_shown() {
		handle.ClickOnLoginButtonAndCheckForUsernameAndPasswordCheckbox();
	}

	@When("^User enters valid username password captcha$")
	public void user_enters_valid_username_password_captcha() {
		handle.EnterValidUsernameAndPasswordAndCaptcha();
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		handle.ClickOnLoginButton();
	}

	@Then("^User login should be successful$")
	public void user_login_should_be_successful() {
		handle.ValidateUserLoginIsSuccessful();
	}

	@Then("^User login task should be successful$")
	public void user_login_task_should_be_successful() {
		handle.ValidateUserLoginTaskIsSuccessful();
	}
	
	@Then("^User name should be shown on top right side$")
	public void user_name_should_be_shown_on_top_right_side() {
		handle.ValidateUsernameIsShownAtCorrectPlace();
	}

	@Then("^Register option should not be shown$")
	public void register_option_should_not_be_shown() {
		handle.RegisterOptionShouldNotBeAvailable();
	}

	@Given("^On following devices \"(.*?)\" required app version \"(.*?)\" is installed$")
	public void on_following_devices_required_app_version_is_installed(String deviceType , String appVersion) {
		System.out.println("Log:: ==Scenario steps===");
		handle.InstallRequiredAppVersionOnRequiredDevicetype(deviceType, appVersion);
	}

	@Given("^On home screen of app login button with captcha is available$")
	public void on_home_screen_of_app_login_button_with_captcha_is_available() {
	    handle.LaunchHomescreenOfAppAndConfirmLoginButtonWithCaptcha();
	}

	@Then("^Following items should be available username password text box and captcha$")
	public void following_items_should_be_available_username_password_text_box_and_captcha() {
	    handle.ValidateFollowingOptionsUsernamePasswordCaptcha();
	}

	@Given("^Passing integer with value (\\d+) to check$")
//	@Given("^Passing integer with value (.+) to check$")                              // (.+) ==> Capture any item int, float, double, string, boolean
	public void passing_integer_with_value_to_check(int valueInteger) {
		System.out.println("Log:: ==Scenario steps===");
		System.out.println("Log:: captured valueInteger:           " + valueInteger);
	}

	@Given("^Passing string with value \"(.*?)\" to test$")
// @Given("^Passing string with value (.+) to test$")                              // (.+) ==> Capture any item int, float, double, string, boolean
	public void passing_string_with_value_to_test(String valueString) {
		System.out.println("Log:: captured valueString:            " + valueString);
	}

	@Given("^Passing boolean with value (true|false) to test$")
	public void passing_boolean_with_value_to_test(boolean valueBoolean) {
		System.out.println("Log:: captured valueBoolean:           " + valueBoolean);
	}

//	@Given("^Passing float with value (\\d+)\\.(\\d+) to check$")
//	public void passing_float_with_value_to_check(int floatIntegerPart, int floatRealPart) {
//		System.out.println("Log:: captured valueFloat:             " + (floatIntegerPart + (float) floatRealPart/10));
//	}

	@Given("^Passing float with value (\\d+.\\d+) to check$")
//	@Given("^Passing float with value (.+) to check$")                                  // (.+) ==> Capture any item int, float, double, string, boolean
	public void passing_float_with_value_to_check(float  floatRealPart) {
		System.out.println("Log:: captured valueFloat:              " + floatRealPart);
	}
	
	@Given("^Passing multiple parameter in single step as data table$")
	public void passing_multiple_parameter_in_single_step_as_data_table(DataTable dataTableParams) {
		handle.ExampleForDataTable(dataTableParams);
	}

	
	
	

	@Given("^Step with tag1$")
	public void step_with_tag1(){
		System.out.println("Log:: Step with tag 1");
	}

	@Given("^Step with tag2$")
	public void step_with_tag2(){
		System.out.println("Log:: Step with tag 2");
	}

	@Given("^Step with tag3$")
	public void step_with_tag3(){
		System.out.println("Log:: Step with tag 3");
	}

	@Given("^Step with tag4$")
	public void step_with_tag4(){
		System.out.println("Log:: Step with tag 4");
	}
	
	@Given("^Step with tag11 tag22$")
	public void step_with_tag11_tag22(){
		System.out.println("Log:: Step with multiple tag    tag 11 tag 22");
	}
	
	@Given("^Step without tag$")
	public void step_without_tag(){
		for(int kk=0; kk<8; kk++){
			System.out.println("Log:: Delay for 1 sec added case 2");
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
		System.out.println("Log:: Step without tag");
	}

	@Given("^Step which failed$")
	public void step_which_failed(){
		Assert.fail("Log:: Step which failed");
	}
	
	
	
	
}
