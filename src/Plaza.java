public class Plaza extends EspacioPublico {
	public int numBares;

	/*public Plaza(String nombre, int extension, String direccion, int numBares) {
		super(nombre, extension, direccion);
		this.numBares = numBares;
	}*/

	public void setNumBares(int nbar){
		numBares = nbar;
	}
	public int getNumBares(){
		return numBares;
	}
}