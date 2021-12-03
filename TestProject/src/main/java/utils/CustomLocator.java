//package utils;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.WebElement;
//import pages.BasePage;
//
//import java.util.List;
//
//public class CustomLocator extends BasePage {
//
//    private final String nameByString;
//    public CustomLocator(String nameByString)
//    {
//        this.nameByString = nameByString;
//    }
//
//    @Override
//    public List<WebElement> findElements(SearchContext context)
//    {
//        List<WebElement> mockElements = context.findElements(By.xpath("//img[@src='" + nameByString + "']"));
//        return mockElements;
//    }
//}
