package com.coding24.mybatisdemo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API文档标题")
                        .description("API文档描述")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("开发者姓名:陈烈烘")
                                .url("http://192.168.94.231:8082/")
                                .email("1754598483@qq.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(
                        new Server().url("http://localhost:8081").description("本地服务器"),
                        new Server().url("http://192.168.94.231:8082").description("生产服务器")))
                .externalDocs(new ExternalDocumentation()
                        .description("外部文档描述")
                        .url("https://example.com/docs"));
    }
}