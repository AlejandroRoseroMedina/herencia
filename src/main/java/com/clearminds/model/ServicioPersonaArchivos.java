package com.clearminds.model;

public class ServicioPersonaArchivos implements ServicioPersona{

	public boolean insertar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Insertando persona en un archivo"+p);
		return true;
	}

	public boolean actualizar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando persona en un archivo"+p);
		return true;
	}

	public boolean eliminar(Persona p) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando persona en un archivo"+p);
		return true;
	}
	

}
