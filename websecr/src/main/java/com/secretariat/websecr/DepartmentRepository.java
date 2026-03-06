package com.secretariat.websecr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Departament, Integer> {
    // Поиск отделов по организации
    List<Departament> findByOrganizationId(Integer organizationId);

    // Поиск подразделений по родительскому отделу
    List<Departament> findByParentDepartmentId(Integer parentId);
}