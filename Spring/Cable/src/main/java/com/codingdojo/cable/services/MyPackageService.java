package com.codingdojo.cable.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.cable.models.MyPackage;
import com.codingdojo.cable.repositories.MyPackageRepository;

@Service
public class MyPackageService {

	private MyPackageRepository packagerepo;
	
	public MyPackageService(MyPackageRepository packagerepo) {
		this.packagerepo = packagerepo;
	}
	
	public MyPackage create(MyPackage mypackage) {
		return packagerepo.save(mypackage);
	}
	
	public MyPackage update(MyPackage mypackage) {
		return packagerepo.save(mypackage);
	}
	
	public ArrayList<MyPackage> findAll() {
		return (ArrayList<MyPackage>) packagerepo.findAll();
	}
	
	public MyPackage findOne(Long id) {
		return packagerepo.findOne(id);
	}
}
