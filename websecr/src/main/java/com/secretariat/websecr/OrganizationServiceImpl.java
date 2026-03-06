package com.secretariat.websecr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository repository;

    public OrganizationServiceImpl(OrganizationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Organization> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Organization> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Organization save(Organization organization) {
        return repository.save(organization);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Organization> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}