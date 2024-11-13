import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                // Menu para chamar a função de ordenação das classes

                Scanner scanner = new Scanner(System.in);

                int opcao = 0;
                while (opcao != 8) {
                        System.out.println("Escolha uma opção:");
                        System.out.println("1 - Bubble Sort");
                        System.out.println("2 - Selection Sort");
                        System.out.println("3 - Insertion Sort");
                        System.out.println("4 - Merge Sort");
                        System.out.println("5 - Quick Sort");
                        System.out.println("6 - Tabela Hash");
                        System.out.println("7 - Busca Binária");
                        System.out.println("8 - Sair");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                                case 1:
                                        BubbleSort.main(args);
                                        break;
                                case 2:
                                        SelectionSort.main(args);
                                        break;
                                case 3:
                                        InsertionSort.main(args);
                                        break;
                                case 4:
                                        MergeSort.main(args);
                                        break;
                                case 5:
                                        QuickSort.main(args);
                                        break;
                                case 6:
                                        TabelaHash.main(args);
                                        break;
                                case 7:
                                        BuscaBinaria.main(args);
                                        break;
                                case 8:
                                        System.out.println("Saindo...");
                                        break;
                                default:
                                        System.out.println("Opção inválida.");
                                        break;
                        }
                }
        }
}