package ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExchangePage extends BasePage {
    public ExchangePage(WebDriver driver) {
        super(driver);
    }

    private String wareBuyValue;
    private String wareSaleValue;

    @FindBy(xpath = "//div[@class=\"root__qLrNeW4jK\"][1]/div[@class=\"rate_kx9iSqCXBH\"][2]")
    protected WebElement costSaleEur;
    @FindBy(xpath = "//div[@class=\"root__qLrNeW4jK\"][1]/div[@class=\"rate_kx9iSqCXBH\"][1]")
    protected WebElement costBuyEur;

    public ExchangePage getCostBuyEur() {
        wareBuyValue = costBuyEur.getText();
        return this;
    }

    public ExchangePage getCostSaleEur() {
        wareSaleValue = costSaleEur.getText();
        return this;

    }
    public String getWareSaleValue() {
        return wareSaleValue;
    }

}
