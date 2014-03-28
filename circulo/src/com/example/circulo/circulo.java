package com.example.circulo;

public class circulo {
	//atributos
	double radio;
	String color;
	
	//Metodos
	void asigRadio(){radio=5;}
	double verRadio(){
		return radio;
	}
	public  double area(){
		return radio*radio*Math.PI;
	//double area(){
		//double total=3.14*radio*radio;
		//return total;
	}
	

}
