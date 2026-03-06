package com.secretariat.websecr;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "nonresident")
public class Nonresident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_number", nullable = false)
    private Integer orderNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "organization", referencedColumnName = "id")
    private Organization organization;

    @Column(name = "organization_address", length = 35)
    private String organizationAddress;

    @Column(name = "reception", length = 40)
    private String reception;

    @Column(name = "reception_city_phone", length = 10)
    private String receptionCityPhone;

    @Column(name = "duty_officer_city_phone", length = 10)
    private String dutyOfficerCityPhone;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 25)
    private String firstName;

    @Column(name = "middle_name", length = 25)
    private String middleName;

    @Column(name = "post", length = 40)
    private String post;

    @Column(name = "hf_phone", length = 10)
    private String hfPhone;

    @Column(name = "work_city_phone", length = 10)
    private String workCityPhone;

    @Column(name = "work_phone_additional", length = 10)
    private String workPhoneAdditional;

    @Column(name = "car_phone", length = 10)
    private String carPhone;

    @Column(name = "mobile_phone", length = 15)
    private String mobilePhone;

    @Column(name = "home_phone", length = 10)
    private String homePhone;

    @Column(name = "home_phone_additional", length = 10)
    private String homePhoneAdditional;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "fax_phone", length = 10)
    private String faxPhone;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "city_code", referencedColumnName = "id")
    private City_codes cityCode;



    public Nonresident() {}

    // Геттеры и сеттеры для всех полей

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public String getReceptionCityPhone() {
        return receptionCityPhone;
    }

    public void setReceptionCityPhone(String receptionCityPhone) {
        this.receptionCityPhone = receptionCityPhone;
    }

    public String getDutyOfficerCityPhone() {
        return dutyOfficerCityPhone;
    }

    public void setDutyOfficerCityPhone(String dutyOfficerCityPhone) {
        this.dutyOfficerCityPhone = dutyOfficerCityPhone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getHfPhone() {
        return hfPhone;
    }

    public void setHfPhone(String hfPhone) {
        this.hfPhone = hfPhone;
    }

    public String getWorkCityPhone() {
        return workCityPhone;
    }

    public void setWorkCityPhone(String workCityPhone) {
        this.workCityPhone = workCityPhone;
    }

    public String getWorkPhoneAdditional() {
        return workPhoneAdditional;
    }

    public void setWorkPhoneAdditional(String workPhoneAdditional) {
        this.workPhoneAdditional = workPhoneAdditional;
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getHomePhoneAdditional() {
        return homePhoneAdditional;
    }

    public void setHomePhoneAdditional(String homePhoneAdditional) {
        this.homePhoneAdditional = homePhoneAdditional;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    public void setFaxPhone(String faxPhone) {
        this.faxPhone = faxPhone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public City_codes getCityCode() {
        return cityCode;
    }

    public void setCityCode(City_codes cityCode) {
        this.cityCode = cityCode;
    }
}
