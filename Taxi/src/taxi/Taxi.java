package taxi;

public class Taxi {//El nombre de la clase
	String ciudad;//Cuidad de cada objeto taxi
	String matricula;//Matricula de cada objeto taxi
	String distrito;//Distrito asignado a cada objeto taxi
	int tipoMotor;//tipo de motor asignado a cada objeto taxi
	//constructor:cuando se cree un objeto taxi se ejecutara el codigo que incluyamos
	public Taxi(String valorMatricula,String valorDistrito, int valorTipoMotor){
		ciudad="Mexico D.F";
		matricula=valorMatricula;
		distrito=valorDistrito;
		tipoMotor=valorTipoMotor;
	}//cierre del constructor
	public String getCiudad() {
		return ciudad;
	}
	
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public void setTipoMotor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public String getDistrito() {
		return distrito;
	}
	
	public int getTipoMotor() {
		return tipoMotor;
	}



}
