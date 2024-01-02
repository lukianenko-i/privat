package tests;

import api.pojo.ExchangeApi;
import api.tools.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.page.ExchangePage;

import java.util.List;

import static api.points.ExchangePoints.getExchangeEur;



public class IntegrationTests extends BaseTests {


    private final static String URL = "https://api.privatbank.ua";
    @Test(groups = {"Currency"})

    public void testExchangeEurTrue() {
        Specification.installSpecification(
                Specification.responseSpecification200(), Specification.requestSpecification(URL));

        ExchangePage exchangePage = new ExchangePage(driver);


        exchangePage
                .getCostSaleEur();

        String wareBuyValue = exchangePage.getWareSaleValue();
        List<ExchangeApi> eurExchangeList = getExchangeEur();
        String saleValue = eurExchangeList.get(0).getSale();
        saleValue = saleValue.substring(0,6);
        wareBuyValue = wareBuyValue.substring(0,6);

        Assert.assertEquals(wareBuyValue, saleValue);
    }

}
