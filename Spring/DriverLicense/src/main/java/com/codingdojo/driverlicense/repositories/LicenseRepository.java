package com.codingdojo.driverlicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.driverlicense.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}
