package com.clearminds.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException{
	//	ServicioPersona servBDD = new ServicioPersonaArchivos();
	//	serv=servBDD;
		String nombreClase = leerPropiedad("archivos");
		Class<?> clase;
		try {
			clase = Class.forName(nombreClase);
			serv=(ServicioPersona)clase.newInstance();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de Servicio Persona");
			
		}
		
	}
	
	public void insertarPersona(Persona p){
		serv.insertar(p);
	}
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
	

}
