package basictestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();;
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		driver.findElement(By.cssSelector("input[name='accountname']")).sendKeys("sahil");
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		driver.findElement(By.name("assigned_group_id")).click();
		driver.findElement(By.xpath("//option[text()='Support Group']")).click();

	}

}
