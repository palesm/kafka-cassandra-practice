package eu.pontsystems.adsproducer.service;

import eu.pontsystems.adsproducer.model.Ad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducerService {

    // reading the property from the application.yml file
    // if value is not specified it will pick up the default value as "ads"
    @Value("${kafka.topic.name:ads}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessageToTopic(final Ad ad) {
        log.info("Sending message to kafka = {}", ad);
        kafkaTemplate.send(topic, ad);
    }
}