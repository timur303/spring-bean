package peaksoft;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("helloworld")
public class HelloWorld {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
