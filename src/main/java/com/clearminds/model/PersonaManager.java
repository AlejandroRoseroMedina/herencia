package com.clearminds.model;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(){
		ServicioPersona servBDD = new ServicioPersonaArchivos();
		serv=servBDD;
	}
	
	public void insertarPersona(Persona p){
		serv.insertar(p);
	}

}
