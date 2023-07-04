package com.test.Paramesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
    	WebDriver driver=new ChromeDriver();
    	Thread.sleep(5000);
    	driver.quit();
    	
    	System.out.println( "Hello Paramesh reddy Welcome to New World!" );
    	System.out.println( "Hello World!" );
    	System.out.println( "Hi Paramesh" );
    }
}
