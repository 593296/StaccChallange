package com.example.StaccChallange.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

//http://localhost:8080/v2/api-docs
//http://localhost:8080/swagger-ui/index.html


@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.StaccChallange"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "KYC API",
                "API testing",
                "1.0",
                "free to use",
                new springfox.documentation.service.Contact("Ørjan Skårnes", "https://example.com/", "orjan.skaarnes@gmail.com"),
                "API LICENSE",
                "https://example.com/",
                Collections.emptyList());
    }


}
