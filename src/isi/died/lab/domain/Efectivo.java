package isi.died.lab.domain;

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
	public void agregar(Agendable a) {
		// TODO Auto-generated method stub
		
	}
	
	
}
