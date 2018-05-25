//package com.codingdojo.exam.models;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//
//
//
//@Entity
//@Table(name="likings")
//public class Like {
//	
//	@Id
//	@GeneratedValue
//	private Long id;
//	
//	private Integer likes;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="user_id")
//	private User user;
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="idea_id")
//	private Idea ideas;
//	private Date createdAt;
//	private Date updatedAt;
//	
//	public Like() {
//		
//	}
//
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public Integer getLikes() {
//		return likes;
//	}
//	public void setLikes(Integer likes) {
//		this.likes = likes;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Idea getIdeas() {
//		return ideas;
//	}
//
//	public void setIdeas(Idea ideas) {
//		this.ideas = ideas;
//	}
//
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//	@PrePersist
//	protected void onCreate(){
//		this.updatedAt = new Date();
//	    this.createdAt = new Date();
//	}
//	
//	@PreUpdate
//	protected void onUpdate(){
//	    this.updatedAt = new Date();
//	}
//}