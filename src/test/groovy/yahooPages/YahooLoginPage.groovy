package yahooPages

/**
 * Created by abhilashk on 7/29/2016.
 */
import geb.Page
import yahooModules.YahooLoginModule

class YahooLoginPage extends Page {

    //static at ={title == "Yahoo - login"}
    static at ={1==1}

    static content={
        YahooLoginModuleObjects {module YahooLoginModule}
    }


    def enterLoginCredentials(def username, def password) {
        print("in definition")
        YahooLoginModuleObjects.uname.firstElement().sendKeys(username)
        YahooLoginModuleObjects.next.click();
        waitFor (10){
            YahooLoginModuleObjects.password.isDisplayed()
        }
        YahooLoginModuleObjects.password.value(password)
       /* waitFor (10){
            YahooLoginModuleObjects.login.isDisplayed()
        }*/
        YahooLoginModuleObjects.login.click()

    }

}
