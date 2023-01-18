import java.util.*;

public class maiorDoGrupo {
    public static void main(String[] args){
        System.out.println("O programa gera uma lista aleatória de homens e mulheres com altura entre 1m e 2m\n" +
                "Homens serão identificados como 0 e mulheres como 1\n" +
                "Com quantas pessoas deseja trabalhar? ");

        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();
        int entradas = ler.nextInt();
        ArrayList<List<Double>> dados = new ArrayList<List<Double>>();

        for (int i = 1; i <= entradas; i = i + 1 ){
            ArrayList<Double> temp = new ArrayList<Double>();
            double a, b;
            a = gerador.nextInt(2);
            b = Math.round((gerador.nextDouble() + 1) * 100);
            b = b / 100;

            temp.add(a);
            temp.add(b);
            dados.add(temp);

        }
        Integer count = 0;
        Double alturaH = (double) 0;
        List<Double> altura = new ArrayList<>();
        for (List<Double> dado : dados) {
            Double sexo = dado.get(0);
            Double alt = dado.get(1);

            if (sexo == 0){
                altura.add(alt);
                alturaH = alturaH + alt;
                count = count + 1;
            } else {
                altura.add(alt);
            }
        }
        Collections.sort(altura);
        Double maiorA = altura.get(altura.size()-1);
        Double menorA = altura.get(0);
        Double mediaH = (double) Math.round((alturaH / count)*100);
        mediaH = mediaH/100;
        Integer mulheres = altura.size() - count;

        System.out.println("A maior pessoa do grupo mede " + maiorA +"m, enquanto a menor\n" +
                "mede " + menorA + "m. O grupo conta com " + mulheres + " mulheres. A média da altura\n" +
                "dos homens é de " + mediaH + "m.\n Os dados utilizados para testes foram:\n" + dados);
    }
}
