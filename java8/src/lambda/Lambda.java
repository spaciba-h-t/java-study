package lambda;

import javax.xml.namespace.QName;
import java.sql.Struct;

/**
 * ラムダ式
 */
public class Lambda {
    public String getLambdaMessage(String message){
        // ラムダ式ではない書き方
        // LambdaTest lambda = new LambdaTest() {
        //      @Override
        //      public String getMessage(String message) {
        //          if(message.isEmpty()){
        //              return "no message";
        //          } else {
        //              return "Message is " + message;
        //          }
        //      }
        // };
        // ラムダ式
        LambdaTest lambda = message2 -> {
            if(message2.isEmpty()){
                return "no message";
            } else {
                return "Message is " + message2;
            }
        };
        return lambda.getMessage(message);
    }
}