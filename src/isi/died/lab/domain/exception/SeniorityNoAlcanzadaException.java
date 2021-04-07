package isi.died.lab.domain.exception;

public class SeniorityNoAlcanzadaException extends Exception {

	public SeniorityNoAlcanzadaException(Integer nivelReq, Integer nivelEmp) {
		super("Se requiere un nivel "+nivelReq+" pero selecciono un empleado de nivel "+nivelEmp);
	}
}
