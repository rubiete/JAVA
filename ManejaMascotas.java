public class ManejaMascotas {

	public static void main(String[] args) {
		Mascota mauri; 
		mauri= new Mascota(3,"mauri","polladeagua",'h');
		System.out.println("Mi mascota se llama "+mauri.getNombre());
		System.out.println("y tiene "+mauri.getEdad()+" a�os");
		//pasa un a�o
		mauri.setEdad(4);
		System.out.println("Ahora tiene "+mauri.getEdad());
		System.out.println("por lo tanto naci� en el a�o" +mauri.getAnoAntes(anoActual))
	}

}
