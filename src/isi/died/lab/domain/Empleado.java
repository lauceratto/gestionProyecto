package isi.died.lab.domain;

public abstract class Empleado {
	protected String nombre;
	protected byte seniority;
	protected Long cuit; 
	protected Integer horasMaxDevDia;
	protected Integer horasMaxOtrasDia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getSeniority() {
		return seniority;
	}
	public void setSeniority(byte seniority) {
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
	
	
}
