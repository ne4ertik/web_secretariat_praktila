package com.secretariat.websecr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NonresidentRepository extends JpaRepository<Nonresident, Integer> {
    // Поиск по организации
    List<Nonresident> findByOrganizationId(Integer organizationId);
    // Поиск по городу (cityCode)
    List<Nonresident> findByCityCodeId(Integer cityCodeId);
    // Поиск по фамилии
    List<Nonresident> findByLastNameContainingIgnoreCase(String lastName);
}