package ir.sk.monitoring_learning.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class MetricsService {
    private final Counter helloCounter;

    public MetricsService(MeterRegistry meterRegistry) {
        this.helloCounter = Counter.builder("api.hello.requests")
                .description("Number of times /hello endpoint was called")
                .register(meterRegistry);
    }

    public void countHelloRequest() {
        helloCounter.increment();
    }
}
