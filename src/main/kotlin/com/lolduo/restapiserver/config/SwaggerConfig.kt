package com.lolduo.restapiserver.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .groupName("LOL-DUO API V1")
            .apiInfo(this.apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.lolduo.restapiserver.controller"))
            .paths(PathSelectors.ant("/api/v1/**"))
            .build()
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("LOL-DUO API")
            .description("LOL-DUO REST API 입니다.")
            .version("1.0")
            .build()
    }
}