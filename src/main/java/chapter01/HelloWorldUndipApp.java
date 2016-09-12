/*
 * These lines of code is intellectual property of Danomalik Technology
 * No copy part or whole without permission
 * copyright @ Danomalik Technology 2016
 */
package chapter01;

/**
 * This the main application that loads and runs all of you entire code
 * 
 * @author leevy
 */
public class HelloWorldUndipApp {

    /*Main application execution functions*/
    public static void main(String[] args) {
        HelloWorldUndip hwu = new HelloWorldUndip(LanguageType.JAVA);
        hwu.setUnivName(Constants.UNDIP);
        hwu.sayHello(Constants.HELLO_WORLD_UNDIP);
        System.out.println(hwu.info());
    }
}
