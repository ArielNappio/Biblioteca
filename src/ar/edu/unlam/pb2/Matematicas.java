package ar.edu.unlam.pb2;

public class Matematicas extends Libro implements Fotocopiado {

	public Matematicas(String nombre, String autor) {
		super(nombre, autor);
	}

	@Override
	public String fotocopiables() {
		return "soy un libro de matematicas";
	}

}
