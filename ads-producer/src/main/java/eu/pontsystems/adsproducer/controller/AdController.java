package eu.pontsystems.adsproducer.controller;

import eu.pontsystems.adsproducer.model.Ad;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class AdController {

    @GetMapping(value = "/ads")
    public List<Ad> getAds() {
        final String uri = "http://localhost:8090/api/ads";
        RestTemplate restTemplate = new RestTemplate();
        List<Ad> result = restTemplate.getForObject(uri, List.class);
        return result;
    }
}