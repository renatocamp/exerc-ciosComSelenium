package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    
    //Método para clicar no link para fazer login
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    
    //Método para interação com Menus DropDown
    public DropdownPage clickDropDown(){
        clickLink("dropdown");
        return new DropdownPage(driver);
    }
    
    //Método para clicar no link "Hover" da Página em questão
    public HoversPage clickHoverPage(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    
    //Método que irá retornar o link do WebElement Desejado
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
