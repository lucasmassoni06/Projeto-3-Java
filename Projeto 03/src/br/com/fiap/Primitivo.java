package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        // declaração e inicialização de variaveis --> tipo nome = valor
        char sexo = 'F'; // 0 a 256
        byte idade = 27; // -127 a 128
        short codigo = 15650; // -32768 a 32767
        int alunos = 50, classes = 11;
        long brasileiros = 216635748L; // indicar que o n é um long
        float media = 8.7f; // indicar que o n é um float
        double dolar = 5.15;
        boolean alternativa = false;
        String nome = "Astrogildo Planetário Celeste";
        System.out.println("Sexo: " + sexo + " Idade: " + idade + " Código: " + codigo);
        System.out.println("Média: " + media + " Alunos: " + alunos + " Turmas: " + classes);
        System.out.println("Habitantes: " + brasileiros + " Cotação do dólar: R$ " + dolar);
        System.out.println("Alternativas: " + alternativa);
        System.out.println("Nome: " + nome);
    }
}
