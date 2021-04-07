package isi.died.lab.domain;

public class Desarrollo extends Tarea {

	private Double riesgo;
	private Double presupuestoMax;
	
	public Double getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(Double riesgo) {
		this.riesgo = riesgo;
	}

	public Double getPresupuestoMax() {
		return presupuestoMax;
	}

	public void setPresupuestoMax(Double presupuestoMax) {
		this.presupuestoMax = presupuestoMax;
	}


	@Override
	public Double incremento() {

		return 1 + (this.riesgo/2.0);
	}
	@Override
	public void asignarEmpleado(Empleado e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean esDesarrollo() {
		// TODO Auto-generated method stub
		return true;
	}

}
