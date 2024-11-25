import java.util.Scanner;

public class AreaPerimetroQuadrado{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado: ");
        float l = teclado.nextFloat();
        
        float area = l*l;
        float perimetro = l*4;
        
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        teclado.close();
    }
}