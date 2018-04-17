public class Edificio {
	private String direccion;
	private int cp;
	private boolean calefaccion;
	private float altura;
	
	public Edificio(String direccion, int cp, boolean calefaccion, float altura) {
		this.direccion = direccion;
		this.cp = cp;
		this.calefaccion = calefaccion;
		this.altura = altura;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public boolean isCalefaccion() {
		return calefaccion;
	}

	public void setCalefaccion(boolean calefaccion) {
		this.calefaccion = calefaccion;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
