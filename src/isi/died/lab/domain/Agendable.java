package isi.died.lab.domain;

public interface Agendable {
	//retorna la duracion en horas
	public Integer duracion();
	public abstract void asignarEmpleado(Empleado e) ;
}
