package model;

public class Livro {
    private static int contador;
    private int id ;
    private String nome;


    public Livro(String nome) {
        this.id = contador++;
        this.nome = nome;

    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Livro.contador = contador;
    }

    public void imprime(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
