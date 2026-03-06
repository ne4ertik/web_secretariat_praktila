package com.secretariat.websecr;

import java.util.List;
import java.util.Optional;

public interface ReceptionService {
    List<reception> findAll();
    Optional<reception> findById(Integer id);
    reception save(reception reception);
    void deleteById(Integer id);
    List<reception> findByOrganizationId(Integer organizationId);
    List<reception> findByName(String name);
}