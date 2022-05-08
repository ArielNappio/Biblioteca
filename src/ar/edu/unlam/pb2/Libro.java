package ar.edu.unlam.pb2;

public class Libro {
	private Integer id = 0;
	private String nombre;
	private String autor;
	private static Integer idActual = 1;
	private Alumno alumnoo;

	public Libro(String nombre, String autor) {
		this.id = idActual++;
		this.nombre = nombre;
		this.autor = autor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", autor=" + autor + "]";
	}

}
