package eu.pontsystems.adsconsumer.service;

import eu.pontsystems.adsconsumer.model.Ad;

import java.util.List;

public interface AdService {

    List<Ad> findAllAds();
}
