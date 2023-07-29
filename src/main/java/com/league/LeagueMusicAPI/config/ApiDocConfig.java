package com.league.LeagueMusicAPI.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.util.Collections;

@Configuration
public class ApiDocConfig {
    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Movie Thing!").description("This is a movie thing!").version("54.99"));
    }
}
/*@Configuration
public class ApiDocConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "League Music API",
                "League of Amazing Programmers Music API",
                "1.0.0",
                null,
                new Contact("Mike Lukash", "www.jointheleague.org", "mikelukash7@gmail.com"),
                null, null, Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
 }
    }
*/