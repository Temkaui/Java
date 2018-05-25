package com.codingdojo.cable.models;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;



@Entity
@Table(name="mypackages")
public class MyPackage {
	
	@Id
	@GeneratedValue
	private Long id;
	@Size(min=3, message="Package name must 3 characters or longer")
	private String packagename;
	
	@Min(value=1, message="No way")
	private Integer cost;
	private Boolean isavailable;
	
	@OneToMany(mappedBy="mypackages", fetch = FetchType.LAZY)
    private ArrayList<User> subscribers;
	
	private Date createdAt;
	private Date updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Boolean getIsavailable() {
		return isavailable;
	}
	public void setIsavailable(Boolean isavailable) {
		this.isavailable = isavailable;
	}
	public ArrayList<User> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(ArrayList<User> subscribers) {
		this.subscribers = subscribers;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	protected void onCreate(){
		this.updatedAt = new Date();
	    this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	
}
