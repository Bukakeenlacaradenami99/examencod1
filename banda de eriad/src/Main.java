import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

          edwin ed=new edwin();
          System.out.println("Establece la edad de edwin: ");
          Scanner sc=new Scanner(System.in);
          ed.setEdad(sc.nextInt());
           System.out.println("Establece el tamaño de sus huevos: ");
           ed.setHuevos(sc.nextInt());
           System.out.println("Indica cuantos muertos se hizo: ");
           ed.setNummr(sc.nextInt());

    }
}