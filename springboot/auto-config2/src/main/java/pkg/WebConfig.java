package pkg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

//@SpringBootApplication
@EnableAutoConfiguration
//@Configuration 不行启动报错
//@Import(Web2Config.class)
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> helloworld(){
        return route(GET("/helloworld"),
                request -> ok().body(Mono.just("Hello,World~"), String.class));
    }

    @Bean
    public ApplicationRunner runner(BeanFactory beanFactory){
        return args -> {
            System.out.println("当前 helloworld Bean 实现类为："+beanFactory.getBean("helloworld").getClass().getName());
            System.out.println("当前 runner Bean 实现类为："+beanFactory.getBean("runner").getClass().getName());
            System.out.println("当前 WebConfig Bean 实现类为："+beanFactory.getBean(WebConfig.class).getClass().getName());
        };
    }

}
