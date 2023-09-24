package com.aegis.image_shop.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ShopProperties {

    @Value("${upload.upload-path}")
    private String uploadPath;
}
