package testSuites

/**
 * Created by abhilashk on 7/29/2016.
 */
import geb.spock.GebReportingSpec
import yahooPages.YahooInboxPage
import yahooPages.YahooLoginPage

class SampleSuite extends GebReportingSpec
{
    def "Yahoo Login"()
    {
        given: "Navigate to Login Page"
        to YahooLoginPage

        when: "User enters credenatials and clicks on Signin"
        enterLoginCredentials("gebtestsample@yahoo.com", "Test@123")

        then: "Landed on correct page"
        verifyLogin()

    }

    def "Compose email"(){
        given: "Navigate to Login Page"
        to YahooLoginPage

        and: "Enter Login Credentails"
        enterLoginCredentials("gebtestsample@yahoo.com", "Test@123")
        verifyLogin()
        at YahooInboxPage

        when: "Enter mail deatils and send"
        ComposeEmail("gebtestsample@yahoo.com", "Automation Test", "Hello")

        then: "Email sent"
    }

}
