package com.clearminds.model;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(String nombreClase) throws InstanceException{
	//	ServicioPersona servBDD = new ServicioPersonaArchivos();
	//	serv=servBDD;
		Class<?> clase;
		try {
			clase = Class.forName(nombreClase);
			serv=(ServicioPersona)clase.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		}
		
	}
	
	public void insertarPersona(Persona p){
		serv.insertar(p);
	}

}
