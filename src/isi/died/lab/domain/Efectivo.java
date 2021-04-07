package isi.died.lab.domain;

import isi.died.lab.domain.exception.HorasNoDisponiblesException;
import isi.died.lab.domain.exception.SeniorityNoAlcanzadaException;

public class Efectivo extends Empleado{
	private double sueldoBase;
	private Integer antig;
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public Integer getAntig() {
		return antig;
	}
	public void setAntig(Integer antig) {
		this.antig = antig;
	}
	
	
	@Override
	public Double costo(Tarea t) {
		Double precioHora = this.sueldoBase / 20 /(this.horasMaxDevDia + this.horasMaxOtrasDia);
		return (t.duracion()*precioHora)*(t.incremento());
	}
	@Override
	public void agregar(Agendable a) throws HorasNoDisponiblesException, SeniorityNoAlcanzadaException {
		// TODO Auto-generated method stub
		
	}
	
	
}
