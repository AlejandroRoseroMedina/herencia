package com.clearminds.model;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PersonaManager p = new PersonaManager("com.clearminds.model.ServicioPersonaBDD");
			System.out.println("pasa");
			p.insertarPersona(new Persona("ALejandro", "Rosero", 24));
		} catch (InstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	throw new InstanceException("Error al obtener una instancia de Servicio Persona");
		}
		
	//	ServicioPersonaBDD sbd;
	//	System.out.println("nombre: "+ServicioPersonaBDD.class.getName());
	//	System.out.println("nombre: "+ServicioPersonaArchivos.class.getName());
//		ServicioPersonaArchivos spa;
	//	Object o = sbd.getClass();
		

	}

}
