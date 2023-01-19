package model;

public class Pessoa  {
    private static int contador;
    private int id ;
    private String nome;


    public Pessoa(String nome) {
        this.id = contador++;
        this.nome = nome;

    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
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
