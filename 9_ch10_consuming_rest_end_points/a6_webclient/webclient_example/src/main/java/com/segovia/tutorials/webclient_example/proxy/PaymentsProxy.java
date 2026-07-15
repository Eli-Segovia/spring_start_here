package com.segovia.tutorials.webclient_example.proxy;

import com.segovia.tutorials.webclient_example.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PaymentsProxy {
    private final WebClient webClient;

    @Value("${name.service.url}")
    private String url;

    public PaymentsProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Payment> createPayment(
            String requestId,
            Payment payment
    ) {
        return webClient.post()          // a really roundabout looking way... This concept of Mono
                .uri(url + "/payment") // is kind of a separate topic. I don't really care about reactive apps
                .header("requestId", requestId)// at this moment. But I will one day.
                .body(Mono.just(payment), Payment.class)
                .retrieve()
                .bodyToMono(Payment.class);

    }
}
