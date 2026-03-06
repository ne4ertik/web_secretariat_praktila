package com.secretariat.websecr;

import java.util.List;
import java.util.Optional;

public interface CityCodesService {
    List<City_codes> findAll();
    Optional<City_codes> findById(Integer id);
    City_codes save(City_codes cityCodes);
    void deleteById(Integer id);
}