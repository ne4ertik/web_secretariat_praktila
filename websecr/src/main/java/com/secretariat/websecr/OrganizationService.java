package com.secretariat.websecr;

import java.util.List;
import java.util.Optional;

public interface OrganizationService {
    List<Organization> findAll();
    Optional<Organization> findById(Integer id);
    Organization save(Organization organization);
    void deleteById(Integer id);
    List<Organization> findByName(String name);
}