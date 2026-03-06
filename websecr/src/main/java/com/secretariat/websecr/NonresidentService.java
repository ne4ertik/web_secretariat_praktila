package com.secretariat.websecr;

import java.util.List;
import java.util.Optional;

public interface NonresidentService {
    List<Nonresident> findAll();
    Optional<Nonresident> findById(Integer id);
    Nonresident save(Nonresident nonresident);
    void deleteById(Integer id);
    List<Nonresident> findByOrganizationId(Integer organizationId);
    List<Nonresident> findByCityCodeId(Integer cityCodeId);
    List<Nonresident> findByLastName(String lastName);
}