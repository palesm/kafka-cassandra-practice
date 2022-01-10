package eu.pontsystems.adsconsumer.controller;

import eu.pontsystems.adsconsumer.dto.AdDto;
import eu.pontsystems.adsconsumer.mapper.AdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdController {

    @Autowired
    AdMapper adMapper;

    @GetMapping("/ads")
    public List<AdDto> getAds() {
        return adMapper.findAllAds();
    }

}
