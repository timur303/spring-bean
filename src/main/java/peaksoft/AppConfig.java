package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean(name="helloworld")
//    @Scope("prototype")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getBeanCat(){
     Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
     return cat;
    }
}
