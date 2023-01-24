package exercises.exercise_07;

public class Pessoa {
    String nome;
    String telefone;
    String email;

    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados da pessoa\n" + "-Nome: " + this.nome + "\n" + "-Telefone: " + this.telefone + "\n" + "-Email: " +this.email + "\n";
    }
}
