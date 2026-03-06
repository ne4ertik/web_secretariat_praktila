package com.secretariat.websecr;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "receptions")
public class reception {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "organization", referencedColumnName = "id")
    private Organization organization;

    @Column(name = "phone_main", length = 20)
    private String phoneMain;

    @Column(name = "phone_additional", length = 20)
    private String phoneAdditional;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Конструкторы, геттеры, сеттеры
    public reception() {}


    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Organization getOrganization() { return organization; }
    public void setOrganization(Organization organization) { this.organization = organization; }
    public String getPhoneMain() { return phoneMain; }
    public void setPhoneMain(String phoneMain) { this.phoneMain = phoneMain; }
    public String getPhoneAdditional() { return phoneAdditional; }
    public void setPhoneAdditional(String phoneAdditional) { this.phoneAdditional = phoneAdditional; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
