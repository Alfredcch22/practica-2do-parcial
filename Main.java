import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double p,e,imc;
        
        System.out.println("Cual es su peso ");
        p= teclado.nextDouble();
        System.out.println("Cual es tu estatura");
        e= teclado.nextDouble();
        
        imc= p/(e*e);
        System.out.println("SU IMC ES: "+imc);
           
        if (imc<=17) {
            System.out.println("BAJO PESO");
        } else if (imc >= 18 && imc <= 25) {
            System.out.println("SALUDABLE");
        } else if (imc >= 26 ) {
            System.out.println("SOBREPESO");
        } 
    }
 
}
