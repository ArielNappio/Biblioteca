package ar.edu.unlam.pb2;

public class Geografia extends Libro implements Fotocopiado {

	public Geografia(String nombre, String autor) {
		super(nombre, autor);
	}

	@Override
	public String fotocopiables() {

		return "Este libro es Geografia y esta fotocopiado";
	}

}
