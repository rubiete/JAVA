public class Mascota {

	int edad;
	String nombre;
	String especie;
	char sexo;
	int 
	public Mascota(int edad, String nombre, String especie, char sexo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.especie = especie;
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnoAntes(int anoActual){
		int AnoAntes;
		AnoAntes=anoActual-edad;
		return (AnoAntes);
	}
	public int getAnoAntes(){
		int AnoAntes;
		int AnoAhora=2018;
		AnoAntes=AnoAhora-edad;
		}
	}
}
