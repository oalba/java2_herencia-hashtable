public class Parking extends EspacioPublico {
	public int plazas;
	
	/*public Parking(String nombre, int extension, String direccion, int plazas) {
		super(nombre, extension, direccion);
		this.plazas = plazas;
	}*/

	public void setPlazas(int plaz){
		plazas = plaz;
	}
	public int getPlazas(){
		return plazas;
	}
}