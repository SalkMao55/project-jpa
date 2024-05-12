/**
 * 
 */
package com.devpredator.projectjpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author salo_
 *	Clase que representa el entity que mapea a la tabla de 'disquera' con JPA
 */
@Entity // Relacionar la clase actual con la base de datos
@Table(name = "disquera") // Tabla a relacionar
public class Disquera {

	// Cada uno de los campos de la tabla relacionada se representa como un propiedad de Java
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Esta notación para los campos que son autoincrementables en una BD nos permitira JPA agregarlo de forma autoincrementable y no tengamos que insertarlo de forma manual
	// strategy = GenerationType.IDENTITY ==> Genera una entidad o valor que sera unico para este dato de id
	@Column(name = "idDisquera")// Esta notacion es opcional siempre y cuando el nombre del campo sea el mismo al campo de la base de datos
	private Long idDisquera;
	
	@Column(name = "descripcion", length = 100)// Tambien podemos delimitar la longitud del campo
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus")
	private boolean estatus;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return idDisquera;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.idDisquera = id;
	}
	
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}
	
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
