package com.secretariat.websecr;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Departament> findAll();
    Optional<Departament> findById(Integer id);
    Departament save(Departament department);
    void deleteById(Integer id);
    List<Departament> findByOrganizationId(Integer organizationId);
    List<Departament> findByParentDepartmentId(Integer parentId);
}