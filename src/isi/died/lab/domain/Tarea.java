package isi.died.lab.domain;

import java.time.Duration;
import java.time.Instant;

import javax.management.RuntimeErrorException;

import isi.died.lab.domain.exception.SeniorityNoAlcanzadaException;

public abstract class Tarea implements Agendable{
	protected String descripcion;
	protected Integer nivelRequerido;
	protected Integer horasPresupuestadas;
	
	protected Instant fechaInicio;
	protected Instant fechaFin;
	protected Empleado responsable;
	
	//sobrecarga el metodo iniciar para poder ejecutarlo con argumento o sin
	public final void iniciar() {
		this.fechaInicio = Instant.now();
	}
	public final void iniciar(Instant fechaIni) {
	//	if(this.fechaInicio!=null) throw new RuntimeException("No puede cambiar la fecha");
		this.fechaInicio = fechaIni;
	}
	public final void finalizar() {
		this.fechaFin = Instant.now();
	}
	
	public abstract Double incremento();
	
	@Override
	public abstract void asignarEmpleado(Empleado e) throws SeniorityNoAlcanzadaException;
	
	@Override
	public Integer duracion() {
		return horasPresupuestadas;
		
	}
	
	public Long dias() {
		return Duration.between(fechaInicio, fechaFin).toDays();
	}
}
