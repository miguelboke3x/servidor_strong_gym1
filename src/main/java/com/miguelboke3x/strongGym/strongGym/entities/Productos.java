package com.miguelboke3x.strongGym.strongGym.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	private String nombre;
	private String descripcion;
	private float pvp;
	private String sn;
	private String imagen;
	private Integer stock;
	private boolean rebajado;
	public Productos() {
	}
	public Productos(int identificador, String nombre, String descripcion, float pvp, String sn, String imagen,
			Integer stock, boolean rebajado) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.sn = sn;
		this.imagen = imagen;
		this.stock = stock;
		this.rebajado = rebajado;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public boolean isRebajado() {
		return rebajado;
	}
	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}
	
	
	 
	}
	