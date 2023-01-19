package model;

import data.ListaDePessoas;

public class AnalisadoraDeDados {
    private ListaDePessoas data = new ListaDePessoas();
    private Pessoa[] listaDePessoas = data.getListaDePessoas();
    private Double maiorAlturaDoGrupo = Double.MIN_VALUE;
    private Double menorAlturaDoGrupo = Double.MAX_VALUE;

    private int numeroDeHomens = 0;

    private int numeroDeMulheres = 0;

    private Double somaAlturaHomens = 0D;

    private Double somaAlturaMulheres = 0D;


    private Double mediaDaAlturaDosHomens = 0D;

    private Double mediaDaAlturaDasMulheres = 0D;




    public void calcularMaiorAltura(){
        for(Pessoa pessoa: listaDePessoas){
            if (pessoa.getAltura() > maiorAlturaDoGrupo){
                this.maiorAlturaDoGrupo = pessoa.getAltura();
            }

        }
        System.out.println("A maior altura do grupo é: " + maiorAlturaDoGrupo);
    }

    public void calcularMenorAltura(){
        for(Pessoa pessoa: listaDePessoas){
            if (pessoa.getAltura() < menorAlturaDoGrupo){
                this.menorAlturaDoGrupo = pessoa.getAltura();
            }

        }
        System.out.println("A menor altura do grupo é: " + menorAlturaDoGrupo);
    }

    public void calcularNumeroDeHomens(){
        for (Pessoa pessoa: listaDePessoas){
            if (pessoa.getSexo() == 'M'){
                this.somaAlturaHomens += pessoa.getAltura();
                this.numeroDeHomens++;

            }
        }
//        System.out.println("O Numero de Homens é: " + numeroDeHomens);
    }

    public void calcularNumeroDeMulheres(){
        for (Pessoa pessoa: listaDePessoas){
            if (pessoa.getSexo() == 'F'){
                this.somaAlturaMulheres += pessoa.getAltura();
                this.numeroDeMulheres++;

            }
        }
        System.out.println("O Numero de Mulheres é: " + numeroDeMulheres);
    }

    public void calcularMediaAlturaHomens(){
        this.mediaDaAlturaDosHomens = somaAlturaHomens / numeroDeHomens;
        System.out.println("A Média da altura dos homens é " + mediaDaAlturaDosHomens);
    }

    public void calcularMediaAlturaMulheres(){
        this.mediaDaAlturaDasMulheres = somaAlturaMulheres / numeroDeMulheres;
        System.out.println("A Média da altura das mulheres é " + mediaDaAlturaDasMulheres);
    }

    public void analisarDadosDoExercicio(){
        System.out.println("A) A maior altura e a menor altura do grupo");
        calcularMaiorAltura();
        calcularMenorAltura();
        System.out.println("\nB) média de altura dos homens");
        calcularNumeroDeHomens();
        calcularMediaAlturaHomens();
        System.out.println("\nC) O número de mulheres");
        calcularNumeroDeMulheres();
    }


}
