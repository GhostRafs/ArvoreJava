import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Arvore {
    static void imprimirArvore(Node node) {
        if (node != null) {
            imprimirArvore(node.left);
            System.out.println(node.data + " ");
            imprimirArvore(node.right);
        }
    }

    static void inserir(Node node, int valor) {
        if (node != null) {
            if (valor < node.data) {
                if (node.left != null) {
                    inserir(node.left, valor);
                } else {
                    System.out.println("Inserindo " + valor + " à esquerda de " + node.data);
                    node.left = new Node(valor);
                }
            } else if (valor > node.data) {
                if (node.right != null) {
                    inserir(node.right, valor);
                } else {
                    System.out.println("Inserindo " + valor + " à direita de " + node.data);
                    node.right = new Node(valor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node root = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 Mostrar nível de um determinado nó");
            System.out.println("2 Nível da árvore");
            System.out.println("3 Mostrar nós e suas profundidades");
            System.out.println("4 Mostrar profundidade da árvore");
            System.out.println("5 Mostrar altura de cada nó");
            System.out.println("6 Mostrar altura da árvore");
            System.out.println("7 Impressão da árvore com identação");
            System.out.println("8 Inserir um valor na árvore");
            System.out.println("0 Sair");

            System.out.print("Escolha uma opção: ");
            char option = scanner.next().charAt(0);

            switch (option) {
                case '1':
                    // Implementar a lógica para mostrar o nível de um determinado nó
                    break;

                case '2':
                    // Implementar a lógica para mostrar o nível da árvore
                    break;

                case '3':
                    // Implementar a lógica para mostrar os nós e suas profundidades
                    break;

                case '4':
                    // Implementar a lógica para mostrar a profundidade da árvore
                    break;

                case '5':
                    // Implementar a lógica para mostrar a altura de cada nó
                    break;

                case '6':
                    // Implementar a lógica para mostrar a altura da árvore
                    break;

                case '7':
                    // Chamar a função de impressão da árvore com identação
                    System.out.println("Árvore com identação:");
                    imprimirArvore(root);
                    System.out.println();
                    break;

                case '8':
                    // Chamar a função de inserção de um valor na árvore
                    System.out.print("Digite o valor a ser inserido: ");
                    int value = scanner.nextInt();
                    if (root == null) {
                        root = new Node(value);
                        System.out.println("Árvore criada com raiz " + value);
                    } else {
                        inserir(root, value);
                    }
                    break;

                case '0':
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
