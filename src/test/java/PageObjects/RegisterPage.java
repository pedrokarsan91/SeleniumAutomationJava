package PageObjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.google.common.collect.Table;

import Helpers.SeleniumHelper;
import cucumber.api.DataTable;

public class RegisterPage extends BaseClass {

	@FindBy(how = How.ID, using = "bbcid_email")
	private WebElement TxtBoxUsername;
	
	@FindBy(how = How.ID, using = "bbcid_createpassword")
	private WebElement TxtBoxPassword;
	
	@FindBy(how = How.ID, using = "bbcid_confirmpassword")
	private WebElement TxtBoxConfirmPassword;
	
	@FindBy(how = How.CLASS_NAME, using = "submit")
	private WebElement BtnRegister;
	
	@FindBy(how = How.CSS, using = ".bbcid-container h2")
	private WebElement RegistrationCompleteText;
	
	@FindBy(how = How.CSS, using = ".bbcid-label-hint strong")
	private WebElement ErrorMessage;
	
	private String expectedRegistrationCompleteMessage = "Your registration is complete";
	
	public RegisterPage() 
	{
		
	}
	
	public void EnterRegistrationDetails(DataTable registerDetails) throws InterruptedException
	{
		List<List<String>> registerData = registerDetails.raw();
		
		Random rand = new Random();
		int randNum = rand.nextInt((100 - 1) +1) + 1;
		
		String username = registerData.get(1).get(0);
		if(username.contains("@"))
		{
		String[] splitUsername = username.split("@");
		SeleniumHelper.SendKeys(TxtBoxUsername, splitUsername[0] + randNum + "@" + splitUsername[1]);
		}
		else
		{
			SeleniumHelper.SendKeys(TxtBoxUsername, registerData.get(1).get(0));
		}
		SeleniumHelper.SendKeys(TxtBoxPassword, registerData.get(1).get(1));
		SeleniumHelper.SendKeys(TxtBoxConfirmPassword, registerData.get(1).get(1));
		Thread.sleep(3000);
		SeleniumHelper.Click(BtnRegister);
	}
	
	public boolean IsRegistrationComplete()
	{
		if(SeleniumHelper.GetText(RegistrationCompleteText).equals(expectedRegistrationCompleteMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void DoesErrorMessageExist(String errorMessage)
	{
		Assert.assertEquals(SeleniumHelper.GetText(ErrorMessage), errorMessage);
	}
}
