package cybersoft.javabackend.java16giraminhhoangnguyen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
		@Bean
		public Docket getDocket() {
			return new Docket(DocumentationType.SWAGGER_2)
								.select()
								.apis(RequestHandlerSelectors.basePackage("cybersoft.javabackend.java16giraminhhoangnguyen"))
								.build()
								.apiInfo(new ApiInfoBuilder().title("Gira App Của Mình lè")
										.version("1.0")
										.description("Chỉ dùng với mục đích uwu.")
										.contact(new Contact("Mina", "https://puginarug.com", "minhnguyenhoang9898@gmail.com"))
										.build())
					; 
		}
		
		
}
