package house_stark_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.NedStark();
		Methods_Classes_Url_Title_Validations.RobbStark();
		
		Methods_Classes_Url_Title_Validations HouseStark = new Methods_Classes_Url_Title_Validations();
		HouseStark.JonSnow();
		HouseStark.SansaStark();
		
		Methods_Classes_Url_Title_Validations HouseStark1 = new Methods_Classes_Url_Title_Validations();
		HouseStark1.AryaStark();
	
		
			
	}
	public static void NedStark() {
		System.out.println("The Quiet Wolf");
	}
	public static void RobbStark() {
		System.out.println("The King in the North");
	}
	public static void JonSnow() {
		System.out.println("Lord Snow");
	}
	public static void SansaStark() {
		System.out.println("The Wolf Girl");
	}
	public static void AryaStark() {
		System.out.println("Faceless Assasin");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Stark");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Stark";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Stark - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
		
		
	
		

	}


