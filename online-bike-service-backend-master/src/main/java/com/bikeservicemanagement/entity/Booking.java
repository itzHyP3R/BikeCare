package com.bikeservicemanagement.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int userId;
	
	private int bikeId;
	
	private String bookDate;
	
	private String bookingDate; 

	private String status;     // booking status
	
	private String bookingId;
	
	private String serviceStatus;
	
	private String paymentStatus;
	
	private String paymentMode;
	
	private BigDecimal serviceFee;
	
}
