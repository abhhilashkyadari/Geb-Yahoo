/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
    timeout = 120
    retryInterval = 1
}

atCheckWaiting = true


environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = {
            def ch =new ChromeDriver()
            ch.manage().window().maximize()
            return ch
        }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
//    firefox {
//        driver = { new FirefoxDriver() }
//    }

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}
reportsDir = new File("target/runtime_reports_dir")

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "https://login.yahoo.com"