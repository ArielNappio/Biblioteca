package ar.edu.unlam.pb2;

public class Historia extends Libro implements Fotocopiado {

	public Historia(String nombre, String autor) {
		super(nombre, autor);
	}

	@Override
	public String fotocopiables() {
		return "Este libro es historia y esta fotocopiado";
	}

}
