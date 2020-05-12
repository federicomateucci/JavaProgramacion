package ejerestacionamiento;

public class Automovil {

	private TipoAutomovil TipoAutomovil;

	public Automovil(TipoAutomovil tipoAutomovil) {
		TipoAutomovil = tipoAutomovil;
	}

	public TipoAutomovil getTipoAutomovil() {
		return TipoAutomovil;
	}

	public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
		TipoAutomovil = tipoAutomovil;
	}

	@Override
	public String toString() {
		return "Automovil [TipoAutomovil=" + TipoAutomovil + "]";
	}

}