package imademethink_cucumber.StepImplimentations;

import java.util.List;

import cucumber.api.DataTable;

public class StepImplementation_CucumberProject {

	public StepImplementation_CucumberProject() {}

	public void StartRequiredWebApplication(){
		System.out.println("Log::  Started Demo WebApplication");
	}
	
	public void StartSecureLoginServiceWithCaptcha(){
		System.out.println("Log:: Started Secure Login Service With Captcha");
	}
	
	public void LaunchDesktopBrowserWithHomePageAndLoginButtonAndCaptcha(){
		System.out.println("Log:: Launched Desktop Browser With Home Page and Login Button and Captcha");
	}
	
	public void ClickOnLoginButtonAndCheckForUsernameAndPasswordCheckbox(){
		System.out.println("Log:: Clicked on Login Button and Check for Username and Password Checkbox");
	}
	
	public void EnterValidUsernameAndPasswordAndCaptcha(){
		System.out.println("Log:: Entered Valid Username and Password and Captcha");
	}
	
	public void ClickOnLoginButton(){
		System.out.println("Log:: Clicked on Login Button");
	}
	
	public void ValidateUserLoginIsSuccessful(){
		System.out.println("Log:: User Login Is Successful");
	}
	
	public void ValidateUserLoginTaskIsSuccessful(){
		System.out.println("Log:: User Login task Is Successful\n\n");
	}
	
	public void ValidateUsernameIsShownAtCorrectPlace(){
		System.out.println("Log:: Username is shown at Correct Place i.e. at Top Right");
	}
	
	public void RegisterOptionShouldNotBeAvailable(){
		for(int kk=0; kk<8; kk++){
			System.out.println("Log:: Delay for 1 sec added case simple");
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
		System.out.println("Log:: Register option is not available which is correct \n\n");
	}
	

	
	
	
	
	
	public void InstallRequiredAppVersionOnRequiredDevicetype(String deviceType, String appVersion){
		System.out.println("Log:: On following device type " + deviceType + " installed app version " + appVersion);
	}
	
    public void LaunchHomescreenOfAppAndConfirmLoginButtonWithCaptcha(){
		System.out.println("Log:: Launched Home screen of App and confirmed Login Button With Captcha");
    }
    
    public void ValidateFollowingOptionsUsernamePasswordCaptcha(){
		System.out.println("Log:: Validated options Username Password and Captcha");
    }
    
	public void ExampleForDataTable(DataTable dataTableParams){
		System.out.println("Log:: Validated data table options ");
		List<List<String>> dataTableAsList = dataTableParams.raw();
		for (int row = 0; row < dataTableAsList.size() ; row ++){
			System.out.print("Log:: Row " + row + " elements : ");
			for (int col = 0; col < dataTableAsList.get(row).size() ; col ++){
				System.out.print("  " + dataTableAsList.get(row).get(col).toString().trim());
			}
			System.out.println("\n\n");
		}
	}
	
}


// 		System.out.println("");
