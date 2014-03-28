package taxi;



public class Taxiobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi p1=new Taxi("5623FRT","DF",0);
		System.out.println("Los datos mi taxi son: " );
		System.out.println("La ciudad es "+p1.getCiudad());
		System.out.println("El distrito es " +p1.getDistrito());
		System.out.println("La matricula es "+p1.getMatricula());
		System.out.println("El tipo motor es " +p1.getTipoMotor());
	}

}
