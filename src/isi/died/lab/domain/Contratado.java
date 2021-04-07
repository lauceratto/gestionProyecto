package isi.died.lab.domain;

import isi.died.lab.domain.exception.HorasNoDisponiblesException;
import isi.died.lab.domain.exception.SeniorityNoAlcanzadaException;

public class Contratado extends Empleado{
	private double costoHora;

	@Override
	public Double costo(Tarea t) {
		
		Double costoTmp = t.duracion()*this.costoHora;
		//TODO si la tarea es de desarrollo se recarga la mitad del riesgo
		//TODO si la tarea es de mantenimiento NO rutinario se recarga 20%
		return costoTmp * t.incremento();
	}

	@Override
	public void agregar(Agendable a) throws HorasNoDisponiblesException, SeniorityNoAlcanzadaException {
		//TODO calcular cuantas horas en este dia ya tengo agendadas
		if(a.esDesarrollo() && a.duracion() > this.horasMaxDevDia) {
			throw new HorasNoDisponiblesException();
		}
		a.asignarEmpleado(this);
	}
	
}
