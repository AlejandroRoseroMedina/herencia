package com.clearminds.model;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona en la BD"+p);
		return true;
	}

	public boolean actualizar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando persona en la BD"+p);
		return true;
	}

	public boolean eliminar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando persona en la BD"+p);
		return true;
	}
	
	

}
