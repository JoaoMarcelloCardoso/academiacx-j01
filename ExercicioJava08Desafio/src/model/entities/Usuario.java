package model.entities;

public class Usuario {
    private String nome;
    private String user = "admin";
    private String pass = "8080";

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean verificarCredenciais(String entradaUser, String entradaPass) {
        if (entradaUser.equals(getUser()) && entradaPass.equals(getPass())) {
            return true;
        }
        return false;
    }
}
