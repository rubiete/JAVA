public class ManejaMascotas {

	public static void main(String[] args) {
		Mascota mauri; 
		mauri= new Mascota(3,"mauri","polladeagua",'h');
		System.out.println("Mi mascota se llama "+mauri.getNombre());
		System.out.println("y tiene "+mauri.getEdad()+" años");
		//pasa un año
		mauri.setEdad(4);
		System.out.println("Ahora tiene "+mauri.getEdad());
		System.out.println("por lo tanto nació en el año" +mauri.getAnoAntes(anoActual))
	}

}
