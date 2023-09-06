package Gestor;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Resgistros registro = new Resgistros();
        registro.salary = 230;
        registro.dataRegister();
        registro.perfil = new Usuario();
        usuario.printData();
    }
}
