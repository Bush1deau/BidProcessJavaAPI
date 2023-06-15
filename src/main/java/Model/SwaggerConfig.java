package Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import java.util.Set;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    private static final Set<String> JSON_MEDIA_TYPE = Collections.singleton(MediaType.APPLICATION_JSON_VALUE);
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .consumes(JSON_MEDIA_TYPE)
                .produces(JSON_MEDIA_TYPE)
                .apiInfo(apiInfo()).select()
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Valarep REST APIs")
                .description("MyApp APIs")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html")
                        .version("1.0.0")
                        .build();
    }
}