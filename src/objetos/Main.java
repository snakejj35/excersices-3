package objetos;

import java.util.Scanner;

public class Main {
	static Cuadrado cuadrado;
	static Cubo cubo;

	public static void main(String[] args) throws Exception{
		exec();
	}
	public static void exec() throws Exception
	{
		printf("OBJETOS...");
		double valor;
			printf("\nDIGITA UNA MEDIDA: ");
			valor = new Scanner(System.in).nextFloat();
			calcular(valor);
	}
	public static void calcular(double dimen) throws Exception
	{
		int opcion;
		boolean salir=false;
		while(!salir)
		{
			printf("MENÚ PRINCIPAL");
			printf("MEDIDA PARCIAL = " +dimen);
			printf("1. CALCULO DE AREA");
			printf("2. CALCULO DE PERIMETRO");
			printf("3. CALCULO DE VOLUMEN");
			printf("4. CALCULO DE PERIMETRO");
			printf("5. CANCELAR");
			printf("6. SALIR");
			printf("Selecciona tu opcion");

			opcion = new Scanner(System.in).nextInt();
			switch(opcion){
			case 1:
				cuadrado = new Cuadrado(dimen);
				printf("\nEL AREA ES: " + cuadrado.calcularArea());
				ejecucion(dimen);
				break;
			case 2:
				cuadrado = new Cuadrado(dimen);
				printf("\nEL PERIMETRO ES: "
						+ cuadrado.calcularPerimetro());
				ejecucion(dimen);
				break;
			case 3:
				cubo = new Cubo(dimen);
				printf("\nEL VOLUMEN ES: " + cubo.calcularVolumen());
				ejecucion(dimen);
				break;
			case 4:
				cubo = new Cubo(dimen);
				printf("\nEL PERIMETRO DEL CUBO ES: "
						+ cubo.calcularPerimetro());
				ejecucion(dimen);
				break;
			case 5:
				exec();
				break;
			case 6:
				printf("\nBye...");
				System.exit(0);				
            break;
            default:
				printf("Ingresa una opcion correcta!\n");
				calcular(dimen);
		}
	  }
	}
	public static void ejecucion(double dimen) throws Exception
	{
		int opcion;
		boolean salir=false;
		while(!salir)
		{
		printf("MEDIDA PARCIAL = " +dimen+ "\n" 
		+ "1.- MENU PRINCIPAL\n"
		+ "2.- NUEVA MEDIDA\n" 
		+ "Selecciona tu opcion: ");
		opcion = new Scanner(System.in).nextInt();
		switch(opcion){
		case 1:
			calcular(dimen);
			break;
		case 2:
			exec();
			break;
		default:
				printf("Ingresa una opcion correcta!\n");
				ejecucion(dimen);
			}
		}
	}
	public static String printf(String cadena) 
	{
		System.out.println(cadena);
		return cadena;
	}
}