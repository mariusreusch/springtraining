package ch.zuehlke.springtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
//Maybe create one bean with help of Application Context.
// Maybe Show error message what happens if no component is found.