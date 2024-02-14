package hoszypackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class hoszytestngfile {
	public String baseUrl = "https://wolfiz.org/hoszy/";
	  String driverPath = "C:\\Users\\hp\\Downloads\\selenium\\chromedriver.exe";
	  public WebDriver driver;
 //@SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      //WebDriverWait wait = new WebDriverWait(driver, 10); // 10-second explicit wait
      // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      //driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-c26755f elementor-vertical-align-top elementor-widget elementor-widget-icon-box']//p[@class='elementor-icon-box-description']")).click();
      driver.findElement(By.xpath("//a[@href='https://wolfiz.org/hoszy/wordpress-hosting/']//span[@class='elementor-button-content-wrapper']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.manage().timeouts().getImplicitWaitTimeout() ;
      //driver.findElement(By.xpath("//a[normalize-space()='Wordpress Hosting']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//span[contains(text(),'Order-Now')]")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//a[@href='https://wolfiz.org/hoszy/vps-hosting/']//span[@class='elementor-button-content-wrapper']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//a[@href='https://wolfiz.org/hoszy/dedicated-hosting/']//span[@class='elementor-button-content-wrapper']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97035f7 elementor-vertical-align-top elementor-widget elementor-widget-icon-box']//p[@class='elementor-icon-box-description']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-c26755f elementor-vertical-align-top elementor-widget elementor-widget-icon-box']//p[@class='elementor-icon-box-description']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//span[normalize-space()='Reseller Hosting']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-6431f09 elementor-vertical-align-top elementor-widget elementor-widget-icon-box']//p[@class='elementor-icon-box-description']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/");
      driver.findElement(By.xpath("//ul[@id='menu-1-0dd4235']//a[@class='elementor-item menu-link'][normalize-space()='About Us']")).click();
      driver.findElement(By.xpath("//span[@class='elementor-button-text'][normalize-space()='Contact Us']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/about-us/");
      driver.findElement(By.xpath("(//h3[@class='elementor-icon-box-title'])[4]")).click();
      
      driver.navigate().to("https://wolfiz.org/hoszy/wordpress-hosting/");
      driver.findElement(By.xpath("//a[normalize-space()='Does WordPress include cPanel?']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/cloud-hosting/");
      driver.findElement(By.xpath("//a[contains(text(),'What is the difference between Cloud Hosting and S')]")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/vps-hosting/");
      driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-25 elementor-inner-column elementor-element elementor-element-23f587a5']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.findElement(By.xpath("//div[@id='elementor-tab-title-1192']")).click();
      driver.findElement(By.xpath("//span[normalize-space()='IPv4 and IPv6 Addresses']")).click();
      driver.findElement(By.xpath("//a[normalize-space()='Which VPS hosting plan is right for me?']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/dedicated-hosting/");
      driver.findElement(By.xpath("//div[@id='elementor-tab-title-2441']//a[@class='elementor-toggle-title'][normalize-space()='Which VPS hosting plan is right for me?']")).click();
      driver.findElement(By.xpath("//ul[@id='menu-1-0dd4235']//a[@class='elementor-item menu-link'][normalize-space()='Domains']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/domains/");
      driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-25 elementor-inner-column elementor-element elementor-element-2d3a9b38']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/whois-privacy/");
      driver.findElement(By.cssSelector("div[class='elementor-widget-container'] p span"));
      driver.navigate().to("https://wolfiz.org/hoszy/ssl-certificate/");
      driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-75e18f2 elementor-align-center elementor-widget elementor-widget-button']//span[@class='elementor-button-text'][normalize-space()='Order Now']")).click();
      driver.findElement(By.xpath("//a[contains(text(),'Are Hoszy control panel licenses compatible with b')]")).click();
      driver.navigate().to("https://wolfiz.org/hoszy/payment-options/");
      driver.navigate().to("https://wolfiz.org/hoszy/client-area/");
      
      
      //webhosting webhosting= driver.findElement(By.xpath("//ul[@id='sm-17079031604921843-2']//a[@class='elementor-sub-item elementor-item-active menu-link'][normalize-space()='WordPress Hosting']")).click();
      //driver.findElement(By.cssSelector("ul[id='menu-1-0dd4235'] li[class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children menu-item-6980']")).click();
     // driver.findElement(By.xpath("(//a[@id='sm-17078958784876443-1'])[1]")).click();
      //driver.findElement(By.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children menu-item-6980'])[1]")).click();
      //driver.findElement(By.xpath("//ul[@id='sm-17078958784876443-2']//a[@class='elementor-sub-item menu-link'][normalize-space()='WordPress Hosting']")).click();
      
      //driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-101c057 elementor-align-center elementor-mobile-align-center elementor-widget elementor-widget-button animated zoomIn']//span[@class='elementor-button-text'][normalize-space()='Get Started']")).click();
      //driver.findElement(By.id("id attribute is not available for this element"));
     // driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-c32ffda elementor-absolute elementor-widget elementor-widget-image']//div[@class='elementor-widget-container']"));
     // driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-bb11fbb elementor-view-default elementor-position-top elementor-mobile-position-top elementor-widget elementor-widget-icon-box']//span[contains(text(),'Domains')]"));
     // driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-0457579 elementor-view-default elementor-position-top elementor-mobile-position-top elementor-widget elementor-widget-icon-box']//span[contains(text(),'SSL Certificates')]"));
      
      
     
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

}
