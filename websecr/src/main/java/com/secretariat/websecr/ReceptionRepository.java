package com.secretariat.websecr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceptionRepository extends JpaRepository<reception, Integer> {
    // Поиск приёмных по организации
    List<reception> findByOrganizationId(Integer organizationId);
    // Поиск по названию
    List<reception> findByNameContainingIgnoreCase(String name);
}