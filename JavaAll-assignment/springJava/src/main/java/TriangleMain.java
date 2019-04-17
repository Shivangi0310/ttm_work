import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(applicationContext.getBean("triangleConstructor1", Triangle.class));
       // System.out.println(applicationContext.getBean(Triangle.class));
    }
}
