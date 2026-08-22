import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        // Solicitação inicial de notas
        System.out.println("--- Cadastro Inicial de Notas ---");
        System.out.print("Quantas notas deseja cadastrar inicialmente? ");
        int quantidadeInicial = scanner.nextInt();

        for (int i = 0; i < quantidadeInicial; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas.add(scanner.nextDouble());
        }

        int opcao = 0;

        // Menu de opções usando apenas if / else
        while (opcao != 6) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar nota");
            System.out.println("2. Remover uma nota");
            System.out.println("3. Listar todas as notas");
            System.out.println("4. Calcular e exibir a média");
            System.out.println("5. Ordenar notas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao == 1) {
                // 1. Adicionar nota
                System.out.print("Digite a nova nota: ");
                double novaNota = scanner.nextDouble();
                notas.add(novaNota);
                System.out.println("Nota adicionada com sucesso!");

            } else if (opcao == 2) {
                // 2. Remover nota
                if (notas.isEmpty()) {
                    System.out.println("A lista de notas está vazia.");
                } else {
                    System.out.println("\n--- Notas Cadastradas ---");
                    for (int i = 0; i < notas.size(); i++) {
                        System.out.println("Posição [" + i + "]: " + notas.get(i));
                    }
                    System.out.print("Informe a posição (índice) da nota que deseja remover: ");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < notas.size()) {
                        notas.remove(indice);
                        System.out.println("Nota removida com sucesso!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                }

            } else if (opcao == 3) {
                // 3. Listar notas
                if (notas.isEmpty()) {
                    System.out.println("Nenhuma nota cadastrada.");
                } else {
                    System.out.println("\n--- Lista de Notas ---");
                    for (int i = 0; i < notas.size(); i++) {
                        System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
                    }
                }

            } else if (opcao == 4) {
                // 4. Calcular média
                if (notas.isEmpty()) {
                    System.out.println("Não é possível calcular a média sem notas.");
                } else {
                    double soma = 0;
                    for (double nota : notas) {
                        soma += nota;
                    }
                    double media = soma / notas.size();
                    System.out.println("Média das notas: " + media);
                }

            } else if (opcao == 5) {
                // 5. Ordenar notas
                if (notas.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    Collections.sort(notas);
                    System.out.println("Notas ordenadas em ordem crescente com sucesso!");
                }

            } else if (opcao == 6) {
                System.out.println("Saindo do programa...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}