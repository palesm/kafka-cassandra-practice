package eu.pontsystems.adsconsumer.service;

import eu.pontsystems.adsconsumer.dto.AdDto;

public interface KafkaConsumerService {

    void consume(final AdDto dto);
}
