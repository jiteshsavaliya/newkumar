package com.newkumar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class BillDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	private BillMaster billMaster;
	
	private double re_dv_sph;
	private double re_dv_cyl;
	private double re_dv_axi;
	private double re_dv_vision;
	
	private double re_nv_sph;
	private double re_nv_cyl;
	private double re_nv_axi;
	private double re_nv_vision;
	
	private double re_add_sph;
	private double re_add_cyl;
	private double re_add_axi;
	private double re_add_vision;
	
	private double le_dv_sph;
	private double le_dv_cyl;
	private double le_dv_axi;
	private double le_dv_vision;
	
	private double le_nv_sph;
	private double le_nv_cyl;
	private double le_nv_axi;
	private double le_nv_vision;
	
	private double le_add_sph;
	private double le_add_cyl;
	private double le_add_axi;
	private double le_add_vision;
	
	private String frameName;
	private String frameCode;
	
	//some fields are remain due to issue
}
