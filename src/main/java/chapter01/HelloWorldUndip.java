/*
 * These lines of code is intellectual property of Danomalik Technology
 * No copy part or whole without permission
 * copyright @ Danomalik Technology 2016
 */
package chapter01;

/**
 * This object is concrete implementation of HelloWorld and IHelloWorld
 * 
 * @author leevy
 */
public class HelloWorldUndip extends HelloWorld implements IHelloWorld {
    
    /*Attribute*/
    private LanguageType languageType;
    private String helloString;

    /*Constructor*/
    public HelloWorldUndip(LanguageType languageType) {
        this.languageType = languageType;
    }

    /*attribute Setter and Getter*/
    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }
    
    /*function*/
    @Override
    public void sayHello(String arg0) {
        helloString = arg0;
    }

    /*function*/
    @Override
    public String info() {
        return String.format("This %s comes from %s with type %s",helloString,univName,languageType);
    }
    
}
