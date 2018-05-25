package com.codingdojo.javatest.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="shows")
public class Show {
	
	@Id
	@GeneratedValue
	private Long id;
	@Size(min=3, message="Show name must 3 characters or longer")
	private String showname;
	@Size(min=2, message="Network should be 2 characters or longer")
	private String network;
	private Double avgRating;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User creator;
	@OneToMany(mappedBy="show", fetch = FetchType.LAZY)
    private List<Rating> ratings;
	private Date createdAt;
	private Date updatedAt;
	
	public List<Rating> getRatings() {
		return ratings;
	}


	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}


	public void setCreator(User creator) {
		this.creator = creator;
	}
	
	public Show() {
		
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getShowname() {
		return showname;
	}


	public void setShowname(String showname) {
		this.showname = showname;
	}


	public String getNetwork() {
		return network;
	}


	public void setNetwork(String network) {
		this.network = network;
	}


	public Double getAvgRating() {
		return avgRating;
	}


	public void setAvgRating(Double avgRating) {
		this.avgRating = avgRating;
	}


	public User getCreator() {
		return creator;
	}


	public void setOp(User creator) {
		this.creator = creator;
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
