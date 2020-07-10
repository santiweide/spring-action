package local.dev.springaction.knightdemo;



import local.dev.springaction.knightdemo.knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {


    public static void main(String args[]) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
