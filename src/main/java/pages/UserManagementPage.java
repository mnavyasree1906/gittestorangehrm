package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserManagementPage {
    private WebDriver driver;

    // Locators (Updated to relative XPath as per your example)
    private By adminTab = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][contains(.,'Admin')]");
   // private By userManagementTab = By.xpath("//span[normalize-space()='User Management']");  // Example XPath
   // private By usersTab = By.xpath("//a[@href='#/admin/viewSystemUsers']//span[1]"); // Example XPath
    private By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"); // Example XPath for Add button
    private By selectDropdown = By.xpath("//div[contains(@class, 'oxd-select-text') and contains(@class, 'oxd-select-text--active') and contains(@class, 'oxd-select-text--error')]//div[contains(@class, 'oxd-select-text-input')]//a");
    private By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']"); // Relative XPath for employee name
    private By usernameField = By.xpath("//input[@class='oxd-input oxd-input--active' and @autocomplete='off']"); // Relative XPath for username field
    private By statusDropdown = By.xpath("//label[text()='Status']/following::div[@class='oxd-select-text-input']"); // Relative XPath for status dropdown
    private By passwordField = By.xpath("//input[@type='password' and @autocomplete='off'][1]"); // Relative XPath for password field
    private By confirmPasswordField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"); // Relative XPath for confirm password field
    private By saveButton = By.xpath("//button[normalize-space()='Save']"); // Relative XPath for save button
    //private By successMessage = By.xpath("//div[contains(@class, 'message success')]"); // Relative XPath for success message
    private By userList = By.xpath("//table[@id='resultTable']"); // Relative XPath for user list table

    // Constructor
    public UserManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigateToUsersPage() {
        driver.findElement(adminTab).click();
      //  (userManagementTab).click();
       // driver.findElement(usersTab).click();
    }

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }

    public void selectUserRole(String UserRole) {
        WebElement statusElement = driver.findElement(selectDropdown);
        statusElement.sendKeys(UserRole);
    }

    public void enterEmployeeName(String employeeName) {
        driver.findElement(employeeNameField).sendKeys(employeeName);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void selectStatus(String status) {
        WebElement statusElement = driver.findElement(statusDropdown);
        statusElement.sendKeys(status);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void confirmPassword(String password) {
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

    //public boolean isSuccessMessageDisplayed() {
      //  return driver.findElement(successMessage).isDisplayed();
   // }

   // public boolean isUserInUserList(String username) {
       // return driver.findElement(userList).getText().contains(username);
   // }
}
