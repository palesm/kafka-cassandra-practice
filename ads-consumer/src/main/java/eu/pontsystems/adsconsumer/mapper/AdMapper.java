package eu.pontsystems.adsconsumer.mapper;

import eu.pontsystems.adsconsumer.dto.AdDto;
import eu.pontsystems.adsconsumer.model.Ad;
import eu.pontsystems.adsconsumer.service.AdService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class AdMapper {

    private MapperFacade mapper = new MapperFactoryConfig();

    @Autowired
    private AdService adService;

    public List<AdDto> findAllAds() {
        return adService.findAllAds().stream().map(x -> mapper.map(x, AdDto.class)).collect(Collectors.toList());
    }
}
