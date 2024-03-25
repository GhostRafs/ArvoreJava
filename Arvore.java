import java.util.Scanner;

class Node {  //classe do Node
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Arvore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

                //Colocar opções aqui usando case
            }
        }
    }
}
