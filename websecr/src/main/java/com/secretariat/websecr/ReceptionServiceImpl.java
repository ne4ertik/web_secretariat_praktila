package com.secretariat.websecr;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReceptionServiceImpl implements ReceptionService {

    private final ReceptionRepository repository;

    public ReceptionServiceImpl(ReceptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<reception> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<reception> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public reception save(reception reception) {
        return repository.save(reception);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<reception> findByOrganizationId(Integer organizationId) {
        return repository.findByOrganizationId(organizationId);
    }

    @Override
    public List<reception> findByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}