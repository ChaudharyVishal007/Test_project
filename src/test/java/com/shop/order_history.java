package com.shop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class order_history extends BaseClass{
@Test(priority = 1 )
public void action() throws InterruptedException {
   
        driver.navigate().to("https://mcstg-shop.larsonjuhl.com/en-US/orderhistory/");
        WebElement search = driver.findElement(By.xpath("(//*[contains(text(), 'Search')])[6]"));
        search.click();
        Thread.sleep(5000);
        String search_tab = search.getText();
        System.out.println(" order_view_detail element name: " + search_tab);
        Thread.sleep(3000);
     // Wait for order_view_detail element to be visible
        WebElement orderViewDetail  = driver.findElement(By.xpath("//a[contains(@class, 'order_view_detail') and contains(@href, 'orderhistory/index/view') and contains(@href, '/?itemDetails=')]"));
        orderViewDetail.click();
        Thread.sleep(5000);
        String orderViewDetailText = orderViewDetail.getText();
        System.out.println(" order_view_detail element name: " + orderViewDetailText);
        
        
}
    }
    

        
        
        
	
	


