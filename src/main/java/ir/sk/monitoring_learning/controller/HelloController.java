package ir.sk.monitoring_learning.controller;

import ir.sk.monitoring_learning.service.MetricsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final MetricsService metricsService;

    public HelloController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        metricsService.countHelloRequest();
        return "Hello, World!";
    }
}
