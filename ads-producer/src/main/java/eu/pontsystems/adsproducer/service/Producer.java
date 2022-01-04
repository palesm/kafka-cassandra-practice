package eu.pontsystems.adsproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {

    // reading the property from the application.yml file
    // if value is not specified it will pick up the default value as "ads"
    @Value("${kafka.topic.name:ads}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(final String message) {
        log.info("Sending message to kafka = {}", message);
        kafkaTemplate.send(topic, message);
    }
}