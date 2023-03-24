package pkg;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

//@SpringBootApplication
@EnableAutoConfiguration
//@Configuration 不行启动报错
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> helloworld(){
        return route(GET("/helloworld"),
                request -> ok().body(Mono.just("Hello,World~"), String.class));
    }

}
