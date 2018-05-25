package com.codingdojo.cable.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.cable.models.MyPackage;

public interface MyPackageRepository extends CrudRepository<MyPackage, Long> {

}
