package com.secretariat.websecr;
import com.secretariat.websecr.City_codes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityCodesRepository extends JpaRepository<City_codes, Integer>{


}
