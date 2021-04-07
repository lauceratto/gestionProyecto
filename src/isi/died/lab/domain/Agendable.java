package isi.died.lab.domain;

import isi.died.lab.domain.exception.SeniorityNoAlcanzadaException;

public interface Agendable {
	//retorna la duracion en horas
	public Integer duracion();
	public abstract void asignarEmpleado(Empleado e)  throws SeniorityNoAlcanzadaException  ;
	public Boolean esDesarrollo();
}
