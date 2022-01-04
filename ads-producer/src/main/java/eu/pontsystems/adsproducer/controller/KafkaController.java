package eu.pontsystems.adsproducer.controller;

import eu.pontsystems.adsproducer.model.Ad;
import eu.pontsystems.adsproducer.service.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/kafka")
@Slf4j
public class KafkaController {

    @Autowired
    private Producer producer;

    // URL - http://localhost:9000/api/kafka/send
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @PostMapping(value = "/send")
    public void send(@RequestBody final Ad ad) {
        log.info("Sending message to kafka topic");
        producer.sendMessageToTopic(ad.toString());
    }
}