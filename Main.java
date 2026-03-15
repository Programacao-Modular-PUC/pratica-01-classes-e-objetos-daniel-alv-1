import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura (m,c): ");
        double altura = sc.nextDouble();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        p.calculaIMC();

        System.out.println("\nPessoa: " + p.getNome() + " " + p.getSobrenome());
        System.out.println("IMC: " + p.getImc());
        System.out.println("Classificação: " + p.informaObesidade());

        sc.close();
    }
}