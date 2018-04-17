
public class Colegio extends Edificio{
	
	private int aulas;
	private boolean pabellon;
	public Colegio(String direccion, int cp, boolean calefaccion, float altura, int aulas, boolean pabellon) {
		super(direccion, cp, calefaccion, altura);	
		 
	}
	public int getAulas() {
		return aulas;
	}
	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	public boolean isPabellon() {
		return pabellon;
	}
	public void setPabellon(boolean pabellon) {
		this.pabellon = pabellon;
	}
	public int getCapacidadColegio(){
		int capacidadColegio;
		capacidadColegio=aulas*0;
		return (capacidadColegio);
				
	}
}
