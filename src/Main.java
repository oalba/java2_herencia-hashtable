public class Main {
	public static void main(String[] args) {
		Parking parking = new Parking();
		Parque parque = new Parque();
		Plaza plaza = new Plaza();

		//Declarar datos de parking
		parking.setNombre("Txofre");
		parking.setExtension(1000);
		parking.setDireccion("Gros");
		parking.setPlazas(2400);

		//Declarar datos de parque
		parque.setNombre("Cristina Enea");
		parque.setExtension(2000);
		parque.setDireccion("Egia");
		parque.setTipo("Botánico");

		//Declarar datos de plaza
		plaza.setNombre("Constitución");
		plaza.setExtension(150);
		plaza.setDireccion("Parte Vieja");
		plaza.setNumBares(15);

		//Imprimir en pantalla
		System.out.println("Parking:");
		System.out.println(parking.getNombre());
		System.out.println(parking.getExtension());
		System.out.println(parking.getDireccion());
		System.out.println(parking.getPlazas());
		System.out.println();
		System.out.println("Parque:");
		System.out.println(parque.getNombre());
		System.out.println(parque.getExtension());
		System.out.println(parque.getDireccion());
		System.out.println(parque.getTipo());
		System.out.println();
		System.out.println("Plaza:");
		System.out.println(plaza.getNombre());
		System.out.println(plaza.getExtension());
		System.out.println(plaza.getDireccion());
		System.out.println(plaza.getNumBares());
		System.out.println();
	}
}