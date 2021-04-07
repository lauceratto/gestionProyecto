package isi.died.lab.domain;

import java.util.List;

import isi.died.lab.domain.exception.HorasNoDisponiblesException;

public abstract class Empleado {
	protected String nombre;
	protected Integer seniority;
	protected Long cuit; 
	protected Integer horasMaxDevDia;
	protected Integer horasMaxOtrasDia;
	protected List<Agendable> tareasAsignadas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getSeniority() {
		return seniority;
	}
	public void setSeniority(Integer seniority) {
		this.seniority = seniority;
	}
	public Long getCuit() {
		return cuit;
	}
	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
	public Integer getHorasMaxDevDia() {
		return horasMaxDevDia;
	}
	public void setHorasMaxDevDia(Integer horasMaxDevDia) {
		this.horasMaxDevDia = horasMaxDevDia;
	}
	public Integer getHorasMaxOtrasDia() {
		return horasMaxOtrasDia;
	}
	public void setHorasMaxOtrasDia(Integer horasMaxOtrasDia) {
		this.horasMaxOtrasDia = horasMaxOtrasDia;
	}
	public abstract Double costo(Tarea t);
	
	public abstract void agregar(Agendable a) throws HorasNoDisponiblesException;
}
