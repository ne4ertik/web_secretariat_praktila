package com.secretariat.websecr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    // Поиск по названию (частичное, без учета регистра)
    List<Organization> findByNameContainingIgnoreCase(String name);
}
