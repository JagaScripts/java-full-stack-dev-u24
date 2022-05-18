/**
 * u24 - com.team02.u24.service - EmpleadoServiceImpl
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 18/05/2022
 */
package com.team02.u24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u24.dao.IEmpleadoDAO;
import com.team02.u24.dto.Empleado;

/**
 * EmpleadoServiceImpl.java
 *
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		return iEmpleadoDAO.findByNombre(nombre);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		iEmpleadoDAO.deleteById(id);

	}

}
