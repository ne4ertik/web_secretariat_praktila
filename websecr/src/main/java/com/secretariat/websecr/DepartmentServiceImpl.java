package com.secretariat.websecr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Departament> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Departament> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Departament save(Departament department) {
        return repository.save(department);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Departament> findByOrganizationId(Integer organizationId) {
        return repository.findByOrganizationId(organizationId);
    }

    @Override
    public List<Departament> findByParentDepartmentId(Integer parentId) {
        return repository.findByParentDepartmentId(parentId);
    }
}