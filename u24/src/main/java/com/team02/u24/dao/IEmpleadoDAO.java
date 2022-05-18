/**
 * u24 - com.team02.u24.dao - IEmpleadoDAO
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 18/05/2022
 */
package com.team02.u24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team02.u24.dto.Empleado;

/**
 * IEmpleadoDAO.java
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	
	//Listar empleado or campo nombre
		public List<Empleado> findByNombre(String nombre);

}
