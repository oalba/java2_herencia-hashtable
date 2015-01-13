public class Parque extends EspacioPublico {
	public String tipo;//juego o botanico

	/*public Parque(String nombre, int extension, String direccion, String tipo) {
		super(nombre, extension, direccion);
		this.tipo = tipo;
	}*/

	public void setTipo(String tip){
		tipo = tip;
	}
	public String getTipo(){
		return tipo;
	}
}