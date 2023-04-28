package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VtigerCreateProduct {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("hello");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("bye");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	}

	@When("click on product module product page should display")
	public void click_on_product_module_product_page_should_display() {
	}

	@When("click on new product add all the details")
	public void click_on_new_product_add_all_the_details() {
	}

	@Then("validate product is created or not")
	public void validate_product_is_created_or_not() {
	}


}
