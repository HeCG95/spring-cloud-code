package pkg2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pkg.WebConfig;

@Configuration
@Import(WebConfig.class)
public class WebAutoConfig {
}
