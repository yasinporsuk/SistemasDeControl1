package sistemasdeControl;

import java.util.Scanner;

public class ejercicioCompartido {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//el area del triangulo
		System.out.println("Introduce la altura del triangulo: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce la base del triangulo : ");
		int base = entrada.nextInt();
		System.out.println("el area del triangulo es : "+calcularArea(base,altura));
		
    }public static double calcularArea(int base, int altura) {
	return base * altura / 2;
    }
    public static double calaACirc(int radio) {
	double area = 3.14*(radio^2);
	return area;
}public static double perimetroACirc(int radio) {
	double perimetro=2*(3.14*radio);
	return perimetro;
	
	//metodo para calcular el área de un cilindro
}
}
