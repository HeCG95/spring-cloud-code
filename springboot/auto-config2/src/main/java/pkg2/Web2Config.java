package pkg2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
//@EnableAutoConfiguration // 直接扫不到了
public class Web2Config {

    @Bean
    public RouterFunction<ServerResponse> helloworld2(){
        return route(GET("/helloworld2"),
                request -> ok().body(Mono.just("Hello,World2~"), String.class));
    }

    @Bean
    public ApplicationRunner runner2(BeanFactory beanFactory){
        return args -> {
            System.out.println("当前 helloworld Bean 实现类为："+beanFactory.getBean("helloworld2").getClass().getName());
            System.out.println("当前 runner2 Bean 实现类为："+beanFactory.getBean("runner2").getClass().getName());

            // 当前 WebConfig Bean 实现类为：pkg2.Web2Config$$EnhancerBySpringCGLIB$$f135647
            System.out.println("当前 WebConfig Bean 实现类为："+beanFactory.getBean(Web2Config.class).getClass().getName());
        };
    }

}
