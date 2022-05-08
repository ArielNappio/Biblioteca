package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Bibloteca {

	private HashSet<Libro> libros;
	private HashSet<Alumno> alumnos;
	private HashSet<Libro> librosPrestados;

	public Bibloteca() {
		this.libros = new HashSet<Libro>();
		this.alumnos = new HashSet<Alumno>();
		this.librosPrestados = new HashSet<>();
	}

	public Boolean agregarLibro(Libro nuevoLibro) {
		Boolean retorno = false;
		if (!this.libros.contains(nuevoLibro)) {
			this.libros.add(nuevoLibro);
			retorno = true;
		}
		return retorno;
	}

	public Boolean AgregarAlumno(Alumno nuevoAlumno) {
		boolean retorno = false;

		for (Alumno I : alumnos) {
			if (!alumnos.contains(nuevoAlumno)) {
				alumnos.add(nuevoAlumno);
				retorno = true;
			}
		}
		return retorno;

	}

	public Integer librosTotales() {
		return this.libros.size();
	}

	public void prestarLibro(Libro libroPrestado) {

	}

}
