import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");

        boolean comparison1 = bean == bean2;
        boolean comparison2 = beanCat == beanCat2;

        System.out.println(comparison1);
        System.out.println(comparison2);
    }
}