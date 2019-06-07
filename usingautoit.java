package Autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usingautoit {

	public static void main(String[] args)throws Exception
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
		Runtime.getRuntime().exec(" D:\\java practice\\myAutoitFile.exe");
		

	}

}
