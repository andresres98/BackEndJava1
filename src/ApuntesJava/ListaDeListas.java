package ApuntesJava;
import javax.management.ObjectInstance;
import java.util.ArrayList;
import java.util.List;
public class ListaDeListas {
    public static void main(String[] args) {
        List<List<String>> usuarios = new ArrayList<>();
        ArrayList<String> usuario1 = new ArrayList<>();
        ArrayList<String> usuario2 = new ArrayList<>();

        usuario1.add("Maria");
        usuario1.add("14");
        usuario1.add("maria@mail.com");

        usuario2.add("Pepito");
        usuario2.add("30");
        usuario2.add("pepito@mail.com");
        for (String x: usuario1){
            System.out.println(x);
        }
        System.out.println(usuario1.indexOf("14"));
        System.out.println(usuarios.getClass());
        int resp = usuario1.lastIndexOf("maria@mail.com");
        if(resp != 0){
            System.out.println("Usuario encontrado");
            System.out.println("La posicion es " + usuario1.indexOf("maria@mail.com"));

        } else {
            System.out.println("Usuario no encontrado");
        }

        //Para adicionar los array a la ListofList
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        int positionlist = usuarios.indexOf(usuario2);
        System.out.println("positionlist = " + positionlist);
        for (List<String> usuario: usuarios){
            for(String dato: usuario){
                System.out.println(dato + " ");
            }
            System.out.println();
        }

    }

}
