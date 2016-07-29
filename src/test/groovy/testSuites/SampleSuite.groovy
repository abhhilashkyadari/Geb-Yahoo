package testSuites

/**
 * Created by abhilashk on 7/29/2016.
 */
import geb.spock.GebReportingSpec
import yahooPages.YahooLoginPage

class SampleSuite extends GebReportingSpec
{
    def "Navigate to YahooLoginPage and Enter Credentials"()
    {
        given: "Navigate to Login Page"
        to YahooLoginPage

        when: "User enters credenatials and clicks on Signin"
        print "When Condition"
        enterLoginCredentials("gebtestsample@yahoo.com", "Test@123")

        then: "Landed on correct page"

    }

}
