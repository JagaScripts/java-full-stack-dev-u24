/**
 * u24 - com.team02.u24.dto - Empleado
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 12/05/2022
 */
package com.team02.u24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Empleado.java
 *
 */
@Entity
@Table(name="empleado")
public class Empleado {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "trabajo")//no hace falta si se llama igual
		private String trabajo;
		@Column(name = "salario")//no hace falta si se llama igual
		private int salario;
		
		/**
		 * 
		 */
		public Empleado() {
			
		}
		
		

		/**
		 * @param id
		 * @param nombre
		 * @param trabajo
		 * @param salario
		 */
		public Empleado(Long id, String nombre, String trabajo, int salario) {
			this.id = id;
			this.nombre = nombre;
			this.trabajo = trabajo;
			this.salario = salario;
		}



		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the trabajo
		 */
		public String getTrabajo() {
			return trabajo;
		}

		/**
		 * @param trabajo the trabajo to set
		 */
		public void setTrabajo(String trabajo) {
			this.trabajo = trabajo;
		}

		/**
		 * @return the salario
		 */
		public int getSalario() {
			return salario;
		}

		/**
		 * @param salario the salario to set
		 */
		public void setSalario(int salario) {
			this.salario = salario;
		}
		
		
		

}
