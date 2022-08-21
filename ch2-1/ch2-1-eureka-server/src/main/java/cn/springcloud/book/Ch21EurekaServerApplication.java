package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch21EurekaServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Ch21EurekaServerApplication.class, args);
		SpringApplication  app = new SpringApplication(Ch21EurekaServerApplication.class);
		app.addListeners(new EurekaServerAvailableListener(), new EurekaServerStartedListener());
		app.run(args);
	}
}
