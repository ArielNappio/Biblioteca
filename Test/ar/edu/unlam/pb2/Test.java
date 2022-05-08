package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSeCreeUnaBibloteca() {

		Bibloteca nuevaBiblo = new Bibloteca();

		assertNotNull(nuevaBiblo);
	}

	@org.junit.Test
	public void queSePuedanAgregarLibrosALaBiloteca() {

		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido;

		Bibloteca nuevaBiblo = new Bibloteca();

		Libro nuevoLibro = new Libro("dr stranger", "Stanlee");
		Libro nuevoLibro2 = new Libro("lala", "ff");

		nuevaBiblo.agregarLibro(nuevoLibro);
		nuevaBiblo.agregarLibro(nuevoLibro2);

		assertEquals((Integer) 2, nuevaBiblo.librosTotales());
		System.out.println(nuevoLibro.getId());
		System.out.println(nuevoLibro2.getId());
	}

	@org.junit.Test
	public void queSePuedanAgregarLosTresTiposDeLibros() {
		Integer resultadoEsperado = 3;
		Integer resultadoObtenido;

		Bibloteca nuevaBiblo = new Bibloteca();

		Libro libroDeHistoria = new Historia(1, "San Martin", "edu");
		Libro libroDeGeografia = new Geografia(2, "Paises", "planetario");
		Libro libroDeMatematicas = new Matematicas(3, "Geometria", "matematicado");

		nuevaBiblo.agregarLibro(libroDeMatematicas);
		nuevaBiblo.agregarLibro(libroDeGeografia);
		nuevaBiblo.agregarLibro(libroDeHistoria);

		resultadoObtenido = nuevaBiblo.librosTotales();

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@org.junit.Test
	public void queSePuedanEstudiantes() {
		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido;

		Bibloteca nuevaBiblo = new Bibloteca();
		Alumno Kevin = new Alumno(43236669, "Kevin", "Arias");

		resultadoObtenido = nuevaBiblo.AgregarAlumno(Kevin);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@org.junit.Test
	public void queSePuedaPrestarUnLibro() {
		Bibloteca nuevaBiblo = new Bibloteca();
		Alumno Kevin = new Alumno(43236669, "Kevin", "Arias");
		Libro libroDeHistoria = new Historia("San Martin", "edu");

		nuevaBiblo.AgregarAlumno(Kevin);
		nuevaBiblo.agregarLibro(libroDeHistoria);

		Kevin.alquilarLibro(libroDeHistoria);
	}
}
