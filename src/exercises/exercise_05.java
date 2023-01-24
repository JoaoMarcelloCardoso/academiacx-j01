package exercises;
import java.util.HashMap;

public class exercise_05 {

    public static void main(String[] args) {

        HashMap conjunto = new HashMap();
        conjunto = gerar_conjunto();
        calcular_media_altura_homens(conjunto);
        contar_mulheres(conjunto);
        retornar_alturas_extremas(conjunto);
    }

    public static HashMap gerar_conjunto( ){
        HashMap<String, HashMap<String, String>> conjunto = new HashMap<String, HashMap<String, String>>();
        for (int i = 1; i <= 10; i++) {
            HashMap<String, String> pessoa = new HashMap<String, String>();
            String sexo = gerar_sexo();
            String altura = gerar_altura();
            pessoa.put("sexo", sexo);
            pessoa.put("altura", altura);
            conjunto.put("pessoa" + i, pessoa);
        }
        System.out.println(conjunto);
        return conjunto;
    }
        public static String gerar_sexo(){
            double numero_aleatorio = Math.random();
            if (numero_aleatorio < 0.5) {
                return "F";
            } else {
                return "M";
            }
        }

        public static String gerar_altura(){
            double numero_aleatorio = Math.random() * (2.00 - 1.20) + 1.20;
            return String.format("%.2f", numero_aleatorio);
        }


        public static void calcular_media_altura_homens(HashMap<String, HashMap<String, String>> conjunto){
            double soma_alturas = 0;
            int quantidade_homens = 0;
            for (String pessoa : conjunto.keySet()) {
                if (conjunto.get(pessoa).get("sexo").equals("M")) {
                    soma_alturas += Double.parseDouble(conjunto.get(pessoa).get("altura"));
                    quantidade_homens++;
                }
            }
            double media_alturas = soma_alturas / quantidade_homens;
            System.out.println("A média das alturas dos homens é: " + media_alturas);
        }

        public static void contar_mulheres(HashMap<String, HashMap<String, String>> conjunto){
            int quantidade_mulheres = 0;
            for (String pessoa : conjunto.keySet()) {
                if (conjunto.get(pessoa).get("sexo").equals("F")) {
                    quantidade_mulheres++;
                }
            }
            System.out.println("A quantidade de mulheres é: " + quantidade_mulheres);
        }

        public static void retornar_alturas_extremas(HashMap<String, HashMap<String, String>> conjunto){
            double maior_altura = 0;
            double menor_altura = 2.00;
            for (String pessoa : conjunto.keySet()) {
                if (Double.parseDouble(conjunto.get(pessoa).get("altura")) > maior_altura) {
                    maior_altura = Double.parseDouble(conjunto.get(pessoa).get("altura"));
                }
                if (Double.parseDouble(conjunto.get(pessoa).get("altura")) < menor_altura) {
                    menor_altura = Double.parseDouble(conjunto.get(pessoa).get("altura"));
                }
            }
            System.out.println("A maior altura é: " + maior_altura);
            System.out.println("A menor altura é: " + menor_altura);
        }
    }

    