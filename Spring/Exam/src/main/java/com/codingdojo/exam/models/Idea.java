package com.codingdojo.exam.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ideas")
public class Idea {

	@Id
	@GeneratedValue
	private Long id;
	@Size(min=3, message="Idea must 3 characters or longer")
	private String ideaname;
	private int liking;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User op;
	private Date createdAt;
	private Date updatedAt;
	
	public Idea() {
		this.liking = 0;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdeaname() {
		return ideaname;
	}

	public void setIdeaname(String ideaname) {
		this.ideaname = ideaname;
	}

	public int getLiking() {
		return liking;
	}

	public void setLiking(int liking) {
		this.liking = liking;
	}

	public User getOp() {
		return op;
	}

	public void setOp(User op) {
		this.op = op;
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