package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apelido;
	private Integer id_alumno;
	private static Integer idActualAlumno = 1;
	private HashSet<Libro> librosTomadosPorElAlumno;

	public Alumno(Integer dni, String nombre, String apelido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apelido = apelido;
		this.id_alumno = idActualAlumno++;
		this.librosTomadosPorElAlumno = new HashSet<Libro>();
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public Boolean alquilarLibro(Libro libro) {
		if (librosTomadosPorElAlumno.size() <= 2) {
			librosTomadosPorElAlumno.add(libro);
			return true;
		}
		return false;
	}

	public HashSet<Libro> listaDeLibrosTomados() {
		return this.librosTomadosPorElAlumno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
