package com.secretariat.websecr;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "city_codes")
public class City_codes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "region", nullable = false, length = 50)
    private String region;

    @Column(name = "city", nullable = false, length = 40)
    private String city;

    @Column(name = "city_code", nullable = false, length = 10, unique = true)
    private String cityCode;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Конструкторы, геттеры, сеттеры
    public City_codes() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getCityCode() { return cityCode; }
    public void setCityCode(String cityCode) { this.cityCode = cityCode; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

}
