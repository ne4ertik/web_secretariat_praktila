package com.secretariat.websecr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NonresidentServiceImpl implements NonresidentService {

    private final NonresidentRepository repository;

    public NonresidentServiceImpl(NonresidentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Nonresident> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Nonresident> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Nonresident save(Nonresident nonresident) {
        return repository.save(nonresident);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Nonresident> findByOrganizationId(Integer organizationId) {
        return repository.findByOrganizationId(organizationId);
    }

    @Override
    public List<Nonresident> findByCityCodeId(Integer cityCodeId) {
        return repository.findByCityCodeId(cityCodeId);
    }

    @Override
    public List<Nonresident> findByLastName(String lastName) {
        return repository.findByLastNameContainingIgnoreCase(lastName);
    }
}