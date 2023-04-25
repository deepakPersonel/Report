package com.deepak.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CITIZEN_PLANS_INFO")

public class CitizenPlan {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private String planStartDate;
	private String planEndDate;
	private double benefitAmt;
	private String denialReason;
	private String terminationDate;
	private String terminationRsn;


}
