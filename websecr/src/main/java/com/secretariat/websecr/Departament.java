package com.secretariat.websecr;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "departments")
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 65)
    private String name;

    @ManyToOne
    @JoinColumn(name = "organization", referencedColumnName = "id")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "parent_department", referencedColumnName = "id")
    private Departament parentDepartment;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Конструкторы, геттеры, сеттеры
    public Departament() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Organization getOrganization() { return organization; }
    public void setOrganization(Organization organization) { this.organization = organization; }
    public Departament getParentDepartment() { return parentDepartment; }
    public void setParentDepartment(Departament parentDepartment) { this.parentDepartment = parentDepartment; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public static interface CityCodesService {
        List<City_codes> findAll();
        Optional<City_codes> findById(Integer id);
        City_codes save(City_codes cityCodes);
        void deleteById(Integer id);
    }
}
