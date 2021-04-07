package isi.died.lab.domain.App;

import isi.died.lab.domain.Contratado;
import isi.died.lab.domain.Empleado;
import isi.died.lab.domain.Mantenimiento;
import isi.died.lab.domain.Tarea;
import isi.died.lab.domain.exception.HorasNoDisponiblesException;
import isi.died.lab.domain.exception.SeniorityNoAlcanzadaException;

public class App {

	public static void main(String[] args) {
		Empleado e1 = new Contratado();
		Tarea t1 = new Mantenimiento();
		
		try {
			e1.agregar(t1);
		} catch (HorasNoDisponiblesException | SeniorityNoAlcanzadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	