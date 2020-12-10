package com.clearminds.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class TestManager {
	public static String leerPropiedad(String nombrePropiedad){
		Properties p = new Properties();
		File f=new File("config.properties");
	//	System.out.println("ruta:"+f.getAbsoluteFile());
		try {
			p.load(new FileReader("config.properties"));
			return p.getProperty(nombrePropiedad);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String captura = leerPropiedad("archivos"); //bdd para bdd o archivos para la de archivos
		System.out.println(" es ---- : "+captura);
		
		
		try {
			//PersonaManager p = new PersonaManager("com.clearminds.model.ServicioPersonaBDD");
			PersonaManager p = new PersonaManager(captura);
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
