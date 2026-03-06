package com.secretariat.websecr;

import jakarta.persistence.*;

import java.time.LocalDateTime;
    @Entity
    @Table(name = "organizations")
    public class Organization {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name", nullable = false, length = 500)
        private String name;

        @Column(name = "created_at", updatable = false)
        private LocalDateTime createdAt;

        // Конструкторы, геттеры, сеттеры
        public Organization() {}

        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    }

