package eu.pontsystems.adsconsumer.mapper;

import eu.pontsystems.adsconsumer.dto.AdDto;
import eu.pontsystems.adsconsumer.model.Ad;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class MapperFactoryConfig extends ConfigurableMapper {

    protected void configure(MapperFactory factory) {
        factory.classMap(Ad.class, AdDto.class).byDefault().register();
    }
}
