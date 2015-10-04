package core;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_SignUp {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

// TC-01.01(Loading the application "Sign Up")
		String test_case_id_0101 = "TC-01.01";
		String title_expected = "Welcome to Sign Up v1";
		String title_actual = driver.getTitle();
		if (title_expected.equals(title_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0101 + " - Passed");
			System.out.println("Title Expected/Actual: " + title_expected + "/"
					+ title_actual);
		} else {
			System.out.println(test_case_id_0101 + " - Failed");
			System.out.println("Title Expected/Actual: " + title_expected + "/"
					+ title_actual);
		}

// TC-01.01.01(if html element title app "Sign Up" exists, check its title)
		String test_case_id_010101 = "TC-01.01.01";
		WebElement element1 = driver.findElement(By.id("id_f_title"));
		if (element1 != null) {
			String etitle1 = driver.findElement(By.id("id_f_title")).getText();
			String etitle1_req = "Sign Up";
			if (etitle1.equals(etitle1_req)) {
				System.out.println("");
				System.out.println(test_case_id_010101 + " - Passed ");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ etitle1 + "/" + etitle1_req);
			} else {
				System.out.println(test_case_id_010101 + " - Failed");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ etitle1 + "/" + etitle1_req);
			}
		} else {
			System.out.print(test_case_id_010101 + " - Failed");
			System.out.println("Element1 does not exist");
		}

// TC-01.01.02(if html element button "Submit" exists, check its title)
		String test_case_id_010102 = "TC-01.01.02";
		WebElement element30 = driver.findElement(By.id("id_submit_button"));
		if (element30 != null) {
			String etitle30 = driver.findElement(By.id("id_submit_button"))
					.getAttribute("value");
			String etitle30_req = "Submit";
			if (etitle30.equals(etitle30_req)) {
				System.out.println("");
				System.out.println(test_case_id_010102 + " - Passed ");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ etitle30 + "/" + etitle30_req);
			} else {
				System.out.println(test_case_id_010102 + " - Failed");
				System.out
						.println("Element1 exists: Actual title/Requir title: "
								+ etitle30 + "/" + etitle30_req);
			}
		} else {
			System.out.print(test_case_id_010102 + " - Failed");
			System.out.println("Element1 does not exist");
		}

// TC-01.02(get guote)
		String test_case_id_0102 = "TC-01.02";
		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("");
			System.out.println(test_case_id_0102 + " - Passed");
			System.out.println("Quote length: " + quote.length());
		} else {
			System.out.println("");
			System.out.println(test_case_id_0102 + " - Failed");
			System.out.println("Quote length: " + quote.length());
		}

// TC-01.03(new quote)
		String test_case_id_0103 = "TC-01.03";
		driver.findElement(By.id("id_quotes")).getText();
		driver.navigate().refresh();
		String quote2 = driver.findElement(By.id("id_quotes")).getText();
		if (quote.equals(quote2)) {
			System.out.println("");
			System.out.println(test_case_id_0103 + " - Failed");
			System.out.println("Quote/Quote2" + quote + "/" + quote2);
		} else {
			System.out.println(test_case_id_0103 + " - Passed");
			System.out.println("Quote/Quote2" + quote + "/" + quote2);
		}

// TC-01.04 (Confirmation page)
		String test_case_id_0104 = "TC-01.04";
		String fname_min = "iva";
		String lname_min = "joh";
		String email_min = "ij@g.ru";
		String phone = "7071234567";
		driver.findElement(By.id("id_fname")).sendKeys(fname_min);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		String url_conf = "http://learn2test.net/qa/apps/sign_up/v1/conformation.php";
		String url_conf_actual = driver.getCurrentUrl();
		if (url_conf.equals(url_conf_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0104 + " - Passed");
			System.out.println("CONFIRMATION page URL Expected/Actual: "
					+ url_conf + " / " + url_conf_actual);
		} else {
			System.out.println(test_case_id_0104 + " - Failed");
			System.out.println("CONFIRMATION page URL Expected/Actual: "
					+ url_conf + " / " + url_conf_actual);
		}

// TC-01.04.01(Confirmation page dose not contain dynamic icon "Client's current weather")
		String test_case_id_010401 = "TC-01.04.01";
		driver.get("http://learn2test.net/qa/apps/sign_up/v1/conformation.php");
		if (driver.findElements(By.id("id_temperature")).isEmpty()) {
			System.out.println("");
			System.out.println(test_case_id_010401 + " - Passed ");
			System.out.println("Element31 dose not exist");
		} else {
			System.out.println(test_case_id_010401 + " - Failed");
			System.out.println("Element31  exists");
		}
		driver.get(url);

// TC-01.05 (Confirmation page with min requirements) or
// TC-01.06(Confirmation page with max requirements)
		String test_case_id_0105 = "TC-01.05";
		// String fname_min = "iva";
		// String lname_min = "joh";
		// String email_min = "ij@g.ru";
		// String phone = "7071234567";
		driver.findElement(By.id("id_fname")).sendKeys(fname_min);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		String fname_conf_actual_min = driver.findElement(
				By.id("id_fname_conf")).getText();
		String lname_conf_actual_min = driver.findElement(
				By.id("id_lname_conf")).getText();
		String email_conf_actual_min = driver.findElement(
				By.id("id_email_conf")).getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();

		if (fname_min.equals(fname_conf_actual_min)
				&& lname_min.equals(lname_conf_actual_min)
				&& email_min.equals(email_conf_actual_min)
				&& phone.equals(phone_conf_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0105 + " - Passed");
			System.out.println("First Expected/Actual: " + fname_min + "/"
					+ fname_conf_actual_min);
			System.out.println("Last Expected/Actual: " + lname_min + "/"
					+ lname_conf_actual_min);
			System.out.println("Email Expected/Actual: \t" + email_min + "/"
					+ email_conf_actual_min);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
		} else {
			System.out.println(test_case_id_0105 + " - Failed");
			System.out.println("First Expected/Actual: " + fname_min + "/"
					+ fname_conf_actual_min);
			System.out.println("Last Expected/Actual: " + lname_min + "/"
					+ lname_conf_actual_min);
			System.out.println("Email Expected/Actual: " + email_min + "/"
					+ email_conf_actual_min);
			System.out.println("Phone Expected/Actual: " + phone + "/"
					+ phone_conf_actual);
		}driver.get(url);

// TC-01.07(Confirmation page with optional fields (Gender, State, Agreement))
		String test_case_id_0107 = "TC-01.07";
		// String fname_min = "iva";
		// String lname_min = "joh";
		// String email_min = "ij@g.ru";
		// String phone = "7071234567";
		String terms_conf_exp = "Agreed";
		String gender_conf_exp = "Male";
		String state_conf_exp = "California";
		driver.findElement(By.id("id_fname")).sendKeys(fname_min);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_g_radio_01")).click();
		new Select(driver.findElement(By.id("id_state")))
				.selectByVisibleText("California");
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("id_submit_button")).click();
		String fname_conf_actual_min_opt = driver.findElement(
				By.id("id_fname_conf")).getText();
		String lname_conf_actual_min_opt = driver.findElement(
				By.id("id_lname_conf")).getText();
		String email_conf_actual_min_opt = driver.findElement(
				By.id("id_email_conf")).getText();
		String phone_conf_actual_opt = driver.findElement(
				By.id("id_phone_conf")).getText();
		String gender_conf_actual_opt = driver.findElement(
				By.id("id_gender_conf")).getText();
		String terms_conf_actual_opt = driver.findElement(
				By.id("id_terms_conf")).getText();
		String state_conf_actual_opt = driver.findElement(
				By.id("id_state_conf")).getText();

		if (fname_min.equals(fname_conf_actual_min_opt)
				&& lname_min.equals(lname_conf_actual_min_opt)
				&& email_min.equals(email_conf_actual_min_opt)
				&& phone.equals(phone_conf_actual_opt)
				&& gender_conf_exp.equals(gender_conf_actual_opt)
				&& state_conf_exp.equals(state_conf_actual_opt)
				&& terms_conf_exp.equals(terms_conf_actual_opt)) {
			System.out.println("");
			System.out.println(test_case_id_0107 + " - Passed");
			System.out.println("First Expected/Actual: " + fname_min + "/"
					+ fname_conf_actual_min_opt);
			System.out.println("Last Expected/Actual: " + lname_min + "/"
					+ lname_conf_actual_min_opt);
			System.out.println("Email Expected/Actual: " + email_min + "/"
					+ email_conf_actual_min_opt);
			System.out.println("Phone Expected/Actual: " + phone + "/"
					+ phone_conf_actual_opt);
			System.out.println("Gender Expected/Actual: " + gender_conf_exp
					+ "/" + gender_conf_actual_opt);
			System.out.println("State Expected/Actual: " + state_conf_exp + "/"
					+ state_conf_actual_opt);
			System.out.println("Terms Expected/Actual: " + terms_conf_exp + "/"
					+ terms_conf_actual_opt);

		} else {
			System.out.println(test_case_id_0107 + " - Failed");
			System.out.println("First Expected/Actual: " + fname_min + "/"
					+ fname_conf_actual_min_opt);
			System.out.println("Last Expected/Actual: " + lname_min + "/"
					+ lname_conf_actual_min_opt);
			System.out.println("Email Expected/Actual: " + email_min + "/"
					+ email_conf_actual_min_opt);
			System.out.println("Phone Expected/Actual: " + phone + "/"
					+ phone_conf_actual_opt);
			System.out.println("Gender Expected/Actual: " + gender_conf_exp
					+ "/" + gender_conf_actual_opt);
			System.out.println("State Expected/Actual: " + state_conf_exp + "/"
					+ state_conf_actual_opt);
			System.out.println("Terms Expected/Actual: " + terms_conf_exp + "/"
					+ terms_conf_actual_opt);
		}driver.get(url);

// TC-01.08(reset sign up page) or TC-01.08.01(reset sign up page with optional fields)
		String test_case_id_0108 = "TC-01.08";
		// String fname_min = "iva";
		// String lname_min = "joh";
		// String email_min = "ij@g.ru";
		// String phone = "7071234567";
		driver.findElement(By.id("id_fname")).sendKeys(fname_min);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_reset_button")).click();
		String fname_reset = driver.findElement(By.id("id_fname")).getText();
		String lname_reset = driver.findElement(By.id("id_lname")).getText();
		String email_reset = driver.findElement(By.id("id_email")).getText();
		String phone_reset = driver.findElement(By.id("id_phone")).getText();
		if (fname_reset == null && lname_reset == null && email_reset == null
				&& phone_reset ==null) {
			System.out.println("");
			System.out.println(test_case_id_0108 + " - Passed");
			System.out.println(fname_reset + "/" + lname_reset + "/"
					+ email_reset + "/" + phone_reset);
		} else {
			System.out.println("");
			System.out.println(test_case_id_0108 + " - Failed");
			System.out.println(fname_reset + "/" + lname_reset + "/"
					+ email_reset + "/" + phone_reset);
		}

// TC-01.09(redirecting to main page from confirmation page - using Back button))
		String test_case_id_0109 = "TC-01.09";
		// String fname_min = "iva";
		// String lname_min = "joh";
		// String email_min = "ij@g.ru";
		// String phone = "7071234567";
		String url_back_exp = "http://learn2test.net/qa/apps/sign_up/v1/index.php";
		driver.findElement(By.id("id_fname")).sendKeys(fname_min);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		driver.findElement(By.id("id_back_button")).click();
		String url_back_actual = driver.getCurrentUrl();
		if (url_back_exp.equals(url_back_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0109 + " - Passed");
			System.out.println("URL_Back/URL_Main: " + url_back_exp + " / "
					+ url);
		} else {
			System.out.println(test_case_id_0109 + " - Failed");
			System.out.println("URL_Back/URL_Man: " + url_back_exp + " / "
					+ url);
		}

// TC-01.10(loading new tab (Facebook page)) or TC-01.11, TC-01.12, TC-01.13

		// String test_case_id_0110 = "TC-01.10";
		// String test_case_id_0111 = "TC-01.11";
		// String test_case_id_0112 = "TC-01.12";
		String test_case_id_0113 = "TC-01.13";

		// String title_facebook = "Facebook - Log In or Sign Up";
		// String title_twitter = "Twitter";
		// String title_flickr =
		// "Flickr, a Yahoo company | Flickr - Photo Sharing!";
		String title_youtube = "YouTube";

		// driver.findElement(By.id("id_img_facebook")).click();
		// driver.findElement(By.id("id_img_twitter")).click();
		// driver.findElement(By.id("id_img_flickr")).click();
		driver.findElement(By.id("id_img_youtube")).click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));

		// String title_facebook_actual = driver.getTitle();
		// String title_twitter_actual = driver.getTitle();
		// String title_flickr_actual = driver.getTitle();
		String title_youtube_actual = driver.getTitle();

		// if (title_facebook.equals(title_facebook_actual)) {
		// if (title_twitter.equals(title_twitter_actual)) {
		// if (title_flickr.equals(title_flickr_actual)) {
		if (title_youtube.equals(title_youtube_actual)) {

			// System.out.println(test_case_id_0110+" - Passed");
			// System.out.println(test_case_id_0111+" - Passed");
			// System.out.println(test_case_id_0112+" - Passed");
			System.out.println(test_case_id_0113 + " - Passed");

			// System.out.println("Title Expected/Actual: "+title_facebook+"/"+title_facebook_actual);
			// System.out.println("Title Expected/Actual: "+title_twitter+"/"+title_twitter_actual);
			// System.out.println("Title Expected/Actual: "+title_flickr+"/"+title_flickr_actual);
			System.out.println("Title Expected/Actual: " + title_youtube + "/"
					+ title_youtube_actual);

		} else {
			// System.out.println("Test Case ID: "+test_case_id_0110+" - Failed");
			// System.out.println(test_case_id_0111+" - Failed");
			// System.out.println(test_case_id_0112+" - Failed");
			System.out.println(test_case_id_0113 + " - Failed");

			// System.out.println("Title Expected/Actual: "+title_facebook+"/"+title_facebook_actual);
			// System.out.println("Title Expected/Actual: "+title_twitter+"/"+title_twitter_actual);
			// System.out.println("Title Expected/Actual: "+title_flickr+"/"+title_flickr_actual);
			System.out.println("Title Expected/Actual: " + title_youtube + "/"
					+ title_youtube_actual);
		}
		driver.close();
		driver.switchTo().window(allTabs.get(0));

// TC-02.01 (empty First Name field)
		String test_case_id_0201 = "TC-02.01";
		String error_fname_empty_expected = "Please enter First Name";
		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();
		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0201 + " - Passed");
			System.out.println("ErrorExpected/Actual: "
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
		} else {
			System.out.println(test_case_id_0201 + " - Failed");
			System.out.println("ErrorExpected/Actual:"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
		}

		// TC-02.02 (empty Second Name field)
		String test_case_id_0202 = "TC-02.02";
		String fname = "Ivan";
		String error_lname_empty_expected = "Please enter Last Name";
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();
		if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0202 + " - Passed");
			System.out.println("ErrorExpected/Actual: "
					+ error_lname_empty_expected + "/"
					+ error_lname_empty_actual);
		} else {
			System.out.println(test_case_id_0202 + " - Failed");
			System.out.println("ErrorExpected/Actual: "
					+ error_lname_empty_expected + "/"
					+ error_lname_empty_actual);
		}

// TC-02.05(Field First Name Validation)

		String test_case_id_0205 = "TC-02.05";
		String fname_2 = "iv";
		String error_fname_expected = "Invalid First Name: [a-zA-Z,.'-]{3,30}";
		driver.findElement(By.id("id_fname")).sendKeys(fname_2);
		driver.findElement(By.id("id_lname")).sendKeys(lname_min);
		driver.findElement(By.id("id_email")).sendKeys(email_min);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_actual = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_fname_expected.equals(error_fname_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0205 + " - Passed");
			System.out.println("ErrorExpected/Actual: t"
					+ error_fname_expected + "/" + error_fname_actual);
		} else {
			System.out.println(test_case_id_0205 + " - Failed");
			System.out.println("ErrorExpected/Actual: "
					+ error_fname_expected + "/" + error_fname_actual);
		}

// TC-02.14(Field Phone Number Validation)
		String test_case_id_0214 = "TC-02.14";
		// String fname = "Ivan";
		String lname = "Johnson";
		String email = "ij@g.ru";
		String phone_9 = "707123456";
		String error_phone_expected = "Invalid Phone Number: should be 10 digits";
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone_9);
		driver.findElement(By.id("id_submit_button")).click();
		String error_phone_actual = driver.findElement(By.id("ErrorLine"))
				.getText();
		if (error_phone_expected.equals(error_phone_actual)) {
			System.out.println("");
			System.out.println(test_case_id_0214 + " - Passed");
			System.out.println("ErrorExpected/Actual: " + error_phone_expected
					+ "/" + error_phone_actual);
		} else {
			System.out.println(test_case_id_0214 + " - Failed");
			System.out.println("ErrorExpected/Actual: " + error_phone_expected
					+ "/" + error_phone_actual);
		}

		driver.quit();
	}
}
