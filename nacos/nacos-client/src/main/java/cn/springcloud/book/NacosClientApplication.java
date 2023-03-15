package cn.springcloud.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@RestController
public class NacosClientApplication
		implements ApplicationListener<RefreshScopeRefreshedEvent> {

	@Value("${mconfig.mmap.mvalue}")
	private String mvalue;

	public static void main(String[] args) {
		SpringApplication.run(NacosClientApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return String.format("Hello~ config value is %s", mvalue);
	}

	@Override
	public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
		System.out.println(String.format("Received refreshedEvent: %s", event));
	}

}
