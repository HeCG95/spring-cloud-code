package pkg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class WebConfig {

    @RestController
    @Indexed
    static class DemoCtrl {
        @GetMapping("hello")
        @Bean
        public String hello(){
            return "{hello}";
        }
    }

    @Bean
    public ApplicationRunner runner(BeanFactory beanFactory){
        return args -> {
            System.out.println("当前 hello Bean 实现类为："+beanFactory.getBean("hello").getClass().getName());
            System.out.println("当前 runner Bean 实现类为："+beanFactory.getBean("runner").getClass().getName());

            System.out.println("当前 WebConfig Bean 实现类为："+beanFactory.getBean(WebConfig.class).getClass().getName());
        };
    }

}
