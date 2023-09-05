package EjerciciosJava;
import java.util.List;
import java.util.ArrayList;
import  java.util.Scanner;
public class ListaPorFor {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<List<String>> usuarios = new ArrayList<>();
        ArrayList<String> usuario1= new ArrayList<>();

        for (int i = 0; i< 3; i++){
            System.out.println("Ingrese el dato que desea agregar a usuario");
            String dato= sc.nextLine();
            usuario1.add(dato);
        }
        for (String x: usuario1){
            System.out.println("x = " + x);
        }

    }
}
