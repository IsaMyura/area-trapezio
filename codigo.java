import java.util.Scanner;

//Declare as variaveis: BaseMaior, BaseMenor, altura e area
//Peça ao usuario para inserir a base maior, a base menor e a altura desejada
//Leia as informaçoes dadas: base maior, base menor e altura
//Calcule a area: somando a base maior e a base menor, dividindo por dois e multiplicando pela altura
//Printe ao usuario a area do trapezio


 class CalculoTrapezio {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    	  Double BaseMaior, BaseMenor, altura, area;
		  
		    System.out.print("Insira a maior base do trapezio");
		    BaseMaior = teclado.nextDouble();
			
			System.out.print("Insira a menor base do trapezio");
		    BaseMenor = teclado.nextDouble();
			
			System.out.print("Insira a altura do trapezio");
		    altura = teclado.nextDouble();
			
			area = ((BaseMaior + BaseMenor) / 2) * altura ;
    
    		System.out.printf("A area do seu trapezio eh de " + area + "cm"); 

    		System.exit(0);
		
	}

}
