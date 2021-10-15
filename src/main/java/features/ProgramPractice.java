package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramPractice {
	public static void main (String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\Desktop\\lavanya\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
        
        //Using get() method to open a webpage
        driver.get("https://www.amazon.in/");
		int  row = 6;
		int i;
		int j;
		
		for (i= row ; i>row; i--) {
			
			for (j=row ; j<=i;j--) {
				
				System.out.print(+j);
				
			}
			System.out.println();
		}
		
	}

}
