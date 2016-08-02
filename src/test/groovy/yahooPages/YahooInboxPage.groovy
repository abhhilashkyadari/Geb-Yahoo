package yahooPages

import Utils.Utility
import geb.Page
import yahooModules.YahooInboxModule


/**
 * Created by abhilashk on 8/2/2016.
 */
class YahooInboxPage extends Page {

    static at = { title == "gebtestsample - Yahoo Mail" }
    static content = {
        YahooInboxPageObjects  { module YahooInboxModule }

    }


    def ComposeEmail(def toAddress, def subject, def composeMessage) {
        /*safeClick(YahooInboxPageObjects.compose)
        safeType(YahooInboxPageObjects.toAddress, toAddress)
        safeType(YahooInboxPageObjects.subject, subject)
        safeType(YahooInboxPageObjects.message, composeMessage)
        safeClick(YahooInboxPageObjects.sendButton)*/
        waitFor(20)
                {
                    YahooInboxPageObjects.compose.isDisplayed()
                }
        YahooInboxPageObjects.compose.click()

        waitFor (10){
            YahooInboxPageObjects.toAddress.isDisplayed()
        }
        YahooInboxPageObjects.toAddress.value(toAddress)

        waitFor (10){
            YahooInboxPageObjects.subject.isDisplayed()
        }
        YahooInboxPageObjects.subject.value(subject)

        YahooInboxPageObjects.message.click()
        YahooInboxPageObjects.message.firstElement().sendKeys(composeMessage)
        sleep(2000)
        waitFor (10){
            YahooInboxPageObjects.sendButton.isDisplayed()
        }
        YahooInboxPageObjects.sendButton.click()


    }
}
