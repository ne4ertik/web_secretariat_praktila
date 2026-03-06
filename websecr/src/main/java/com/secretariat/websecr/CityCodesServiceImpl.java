package com.secretariat.websecr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CityCodesServiceImpl implements CityCodesService {

    private final CityCodesRepository repository;

    public CityCodesServiceImpl(CityCodesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<City_codes> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<City_codes> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public City_codes save(City_codes cityCodes) {
        return repository.save(cityCodes);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}