import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("graph.xml");

//        context.getBean("myPoint", Point.class).draw();
//        context.getBean("myCircle", Circle.class).draw();
        context.getBean(Scene.class).drow();


    }
}