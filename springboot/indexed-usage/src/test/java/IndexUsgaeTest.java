import cn.springcloud.controller.AController;
import cn.springcloud.controller.BController;
import cn.springcloud.book.MyIndexedConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IndexUsgaeTest {

    @Test
    public void testIndexed(){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyIndexedConfig.class);

        System.out.println("获取DemoA Jar中【cn.springcloud.controller.AController】");
        AController demoAController = context.getBean(AController.class);
        System.out.println("DemoAController = " + demoAController.getClass());

        System.out.println("获取DemoB Jar中【cn.springcloud.controller.BController】");
        BController demoBController = context.getBean(BController.class);
        System.out.println("DemoBController = " + demoBController.getClass());

    }

}
