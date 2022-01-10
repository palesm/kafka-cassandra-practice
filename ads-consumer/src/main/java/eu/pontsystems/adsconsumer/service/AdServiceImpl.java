package eu.pontsystems.adsconsumer.service;

import eu.pontsystems.adsconsumer.model.Ad;
import eu.pontsystems.adsconsumer.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdServiceImpl implements AdService{

    @Autowired
    private AdRepository adRepository;

    @Override
    public List<Ad> findAllAds() {
        return adRepository.findAll();
    }
}
