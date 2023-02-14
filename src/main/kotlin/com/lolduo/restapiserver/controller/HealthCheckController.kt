package com.lolduo.restapiserver.controller

import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = ["Health Check"], description = "Health Check api list")
@RestController
@RequestMapping("/api/v1")
class HealthCheckController {
    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK"
    }
}