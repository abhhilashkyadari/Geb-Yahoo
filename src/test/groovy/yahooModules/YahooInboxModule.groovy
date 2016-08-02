package yahooModules

import geb.Module

/**
 * Created by abhilashk on 8/2/2016.
 */
class YahooInboxModule extends  Module {
    static content ={
        compose{$("span.icon-text",text:"Compose")}
        toAddress{$("input#to-field")}
        subject{$("input#subject-field")}
        message{$("#rtetext>div:nth-child(2)")}
        sendButton{$("span.btn.default>a")}
    }
}
