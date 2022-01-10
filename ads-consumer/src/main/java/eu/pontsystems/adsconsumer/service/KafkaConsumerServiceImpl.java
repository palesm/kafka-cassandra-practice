package eu.pontsystems.adsconsumer.service;

import eu.pontsystems.adsconsumer.dto.AdDto;
import eu.pontsystems.adsconsumer.model.Ad;
import eu.pontsystems.adsconsumer.repository.AdRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private final AdRepository adRepository;

    @Override
    @KafkaListener(topics = "#{'${kafka.topic.name:ads}'}", groupId = "group_id")
    public void consume(final AdDto dto) {
        log.info("Consuming message.");

        Ad ad = new Ad();
        ad.setId(UUID.randomUUID());
        ad.setMessage(dto.getMessage());
        ad.setName(dto.getName());

        adRepository.save(ad);
    }
}