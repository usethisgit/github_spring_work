package com.upen.AppConfig;

import com.upen.Desktop;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    public Desktop desktop() {
        return new Desktop();
    }
}

