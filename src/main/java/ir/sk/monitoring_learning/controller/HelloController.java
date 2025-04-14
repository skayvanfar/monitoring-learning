package ir.sk.monitoring_learning.controller;

import lombok.extern.slf4j.Slf4j;
import ir.sk.monitoring_learning.service.MetricsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    private final MetricsService metricsService;

    public HelloController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        log.info("Hello endpoint was called.");
        metricsService.countHelloRequest();
        return "Hello, World!";
    }
}
