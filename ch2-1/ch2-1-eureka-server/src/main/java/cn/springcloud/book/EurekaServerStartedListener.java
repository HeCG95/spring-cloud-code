package cn.springcloud.book;

import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author HeCG
 * @date 2022/8/21 9:56
 * @since 1.0
 */
public class EurekaServerStartedListener implements ApplicationListener<EurekaServerStartedEvent> {

    @Override
    public void onApplicationEvent(EurekaServerStartedEvent event) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(event);
        System.out.println(event.getSource());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
