public class EspacioPublico {
	protected String nombre;
	protected int extension;
	protected String direccion;

	/*public EspacioPublico(String nombre, int extension, String direccion){
		this.nombre = nombre;
		this.extension = extension;
		this.direccion = direccion;
	}*/

	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setExtension (int ex){
		extension = ex;
	}
	public int getExtension(){
		return extension;
	}

	public void setDireccion (String dir){
		direccion = dir;
	}
	public String getDireccion(){
		return direccion;
	}
}