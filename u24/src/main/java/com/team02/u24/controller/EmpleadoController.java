/**
 * u24 - com.team02.u24.controller - EmpleadoController
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 18/05/2022
 */
package com.team02.u24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u24.dto.Empleado;
import com.team02.u24.dto.Empleado.Trabajos;
import com.team02.u24.service.EmpleadoServiceImpl;

/**
 * EmpleadoController.java
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		
		return empleadoServiceImpl.listarEmpleados();
		
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarClienteNombre(@PathVariable(name="nombre") String nombre) {
	    
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
		
	}
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		
		Trabajos trabajos[] = Empleado.Trabajos.values();
		boolean existeTrabajo = false;
		
		if (empleado.getTrabajo() != null) {
			
			for (Trabajos trabajo : trabajos) {
				 
				 if (empleado.getTrabajo().equalsIgnoreCase(trabajo.getTrabajo())) {
					
					 empleado.setSalario(trabajo.getSalario());
					 existeTrabajo = true;	
					 
				}
				 
			}
			
		} 
		
		if (!existeTrabajo || (empleado.getTrabajo() == null)) {
			
			empleado.setSalario(0);
			empleado.setTrabajo(null);
			
		}
			
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name = "id") Long id) {
		
		Empleado empleado_xid = new Empleado();
		
		empleado_xid = empleadoServiceImpl.empleadoXID(id);
		
		return empleado_xid;
	}

	@PutMapping("/empleado/{id}")
	public void actualizarEmpleado(@PathVariable(name = "id") Long id) {
		
		empleadoServiceImpl.eliminarEmpleado(id);
		
	}
	
	
}
