package PageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Helpers.SeleniumHelper;

public class SearchPage extends BaseClass {

	@FindBy(how = How.CSS, using = ".search-results li:first-of-type h1 a")
	private WebElement FirstArticle;
	
	public SearchPage() 
	{
		
	}
	
	public void DoesArticleTitleListContainKeyword(String keyword)
	{	
		List<WebElement> articleTitleList = SeleniumHelper.FindElements(By.cssSelector(".results li h1"));
		
		for(WebElement articleTitle : articleTitleList)
		{
			if(articleTitle.getText().contains(keyword))
			{
				Assert.assertTrue(true);
			}
			else 
			{
				Assert.assertTrue(false);
				break;
			}
		}
	}
	
	public void OpenArticle()
	{
		SeleniumHelper.Click(FirstArticle);
	}
	
	public void IsOnCorrectArticle()
	{
		
	}
}
