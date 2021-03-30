package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        1) Cat деген POJO класс тузунуз
//        2) AppConfig класстын ичинде cat деген класска бин тузунуз
//        3) Ал бинди ар бир чакырганда жаны объект тузуло тургандай кылып настройка кылыныз
//        4) App классында HelloWorldду дагы бир жолу жана Catти эки жолу чакырыныз. Аларды ссылкасы менен
//        салыштырып коруп жообун консольго чыгарыныз.
//        5) Тестти комментарийден чыгарып иштетип корунуз

        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =(HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =(HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean1.getMessage() == bean2.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat1==cat2);


    }
}
