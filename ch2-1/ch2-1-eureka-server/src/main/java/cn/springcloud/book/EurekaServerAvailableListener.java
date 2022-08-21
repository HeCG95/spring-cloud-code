package cn.springcloud.book;

import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author HeCG
 * @date 2022/8/21 9:56
 * @since 1.0
 */
public class EurekaServerAvailableListener implements ApplicationListener<EurekaRegistryAvailableEvent> {

    @Override
    public void onApplicationEvent(EurekaRegistryAvailableEvent event) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(event);
        System.out.println(event.getSource());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
