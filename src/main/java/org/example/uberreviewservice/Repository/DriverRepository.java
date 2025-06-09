package org.example.uberreviewservice.Repository;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.CustomDriver;
import org.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByIdAndLicenseNo(Long id, String licenseNo);

    //raw mysql query error is thrwn in runtime
//    @Query(nativeQuery = true, value = "SELECT * FROM driver WHERE id = :id AND license_no = :license_number")
//    Optional<Driver> rawFindIdAndLicenceNumber(Long id, String license_number);

    //Hibernate Query - error is thrown at compile time only
    //recommended highly
//    @Query("SELECT d FROM Driver as d WHERE d.id = :id AND d.licenseNo = :name")
//    Optional<Driver> hqlFindByIdAndLicence(Long id, String name);
    @Query("SELECT new org.example.uberreviewservice.models.CustomDriver(d.id,d.name) FROM Driver as d WHERE d.id = :id AND d.licenseNo = :name")
    Optional<CustomDriver> hqlFindByIdAndLicence(Long id, String name);


}
