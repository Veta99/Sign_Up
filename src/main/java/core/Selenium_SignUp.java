package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_SignUp
{
    public static void main( String[] args ){
    	WebDriver driver = new FirefoxDriver();
    	String text_case_id_01 = "TC-001.01";
    	String url = "http://learn2test.net/qa/apps/sign_up/v1/";
    	String title_expected = "Welcome to Sign Up v1";
    	
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	String title_actual = driver.getTitle();
        System.out.println( "" );
        if  (title_expected.equals(title_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_expected + "/" + title_actual);
			System.out.println("=======================================");}
	    else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_expected + "/" + title_actual);
			System.out.println("=======================================");}
    	driver.quit();
    }}

