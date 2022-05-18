/**
 * u24 - com.team02.u24.service - IEmpleadoService
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 18/05/2022
 */
package com.team02.u24.service;

import java.util.List;

import com.team02.u24.dto.Empleado;

/**
 * IEmpleadoService.java
 *
 */
public interface IEmpleadoService {
	
		//Metodos del CRUD
		public List<Empleado> listarEmpleados(); //Listar All 
		
		public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
		
		public Empleado empleadoXID(Long id); //Leer datos de un empleado READ
		
		public List<Empleado> listarEmpleadoNombre(String nombre);//Listar empleados por campo nombre
		
		public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
		
		public void eliminarEmpleado(Long id);// Elimina el empleado DELETE

}
