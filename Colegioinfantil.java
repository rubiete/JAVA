
public class Colegioinfantil extends Colegio{
	private boolean patio;
	public Colegioinfantil(String direccion, int cp, boolean calefaccion,
			float altura, int aulas, boolean pabellon) {
		super(direccion, cp, calefaccion, altura, aulas, pabellon);
		
	}
	public boolean isPatio() {
		return patio;
	}
	public void setPatio(boolean patio) {
		this.patio = patio;
	}
	

}
