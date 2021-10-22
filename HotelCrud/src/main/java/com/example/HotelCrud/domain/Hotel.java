package com.example.HotelCrud.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Hotel {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String customername;
    private String room;
    private int fee;
public Hotel() {
 
}
public Hotel(Long id, String customername, String room, int fee) {
this.id = id;
this.customername = customername;
this.room = room;
this.fee = fee;
}

	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public String getcustomername() {
	return customername;
	}
	public void setcustomername(String customername) {
	this.customername = customername;
	}
	public String getroom() {
	return room;
	}
	public void setroom(String room) {
	this.room = room;
	}
	public int getFee() {
	return fee;
	}
	public void setFee(int fee) {
	this.fee = fee;
	}
 
}