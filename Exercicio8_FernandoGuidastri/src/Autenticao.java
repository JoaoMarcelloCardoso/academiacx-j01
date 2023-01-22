import java.util.Objects;

public class Autenticao {

    public boolean Autenticar(String usuario, String senha){

        return Objects.equals(usuario, "admin") && Objects.equals(senha, "8080");


    }

}
