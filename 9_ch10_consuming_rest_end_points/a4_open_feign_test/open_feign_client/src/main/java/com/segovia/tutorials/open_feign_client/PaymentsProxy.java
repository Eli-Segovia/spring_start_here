package com.segovia.tutorials.open_feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}") // @FeignClient annotation configures the REST client (this very own class...)
                                                             // A minimal configuration defines the name of the client and the endpoint it wants to consume...
public interface PaymentsProxy {  // I don't truly understand this "Proxy" vernacular, but this class kinda just represents a contract defining what a rest call looks like :)

    @PostMapping("/payment") // as if we are defining a controller, we use the postmapping to tell spring this is the endpoint
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    );
}
