package yahooModules

/**
 * Created by abhilashk on 7/29/2016.
 */
import geb.Module
class YahooLoginModule extends Module
{

    static content=
    {
        uname{$("input#login-username")}
        next{$("button#login-signin")}
        password{$("input#login-passwd")}
        login{$("input#login-signin")}

    }

}