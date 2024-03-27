import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arvore arvorebinaria = new Arvore();        // Instanciando uma árvore binária

        int opcao = 9;

        while(opcao != 0) {
            System.out.println("MENU");
            System.out.println("1 - Inserir valor na árvore");
            System.out.println("2 - Nível de um nó");
            System.out.println("3 - Nível da árvore");
            System.out.println("4 - Profundidade do nó");
            System.out.println("5 - Profundidade da árvore");
            System.out.println("6 - Altura do nó");
            System.out.println("7 - Altura da árvore");
            System.out.println("8 - Impressão da árvore");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            int numero;

            switch (opcao) {
                case 1:
                    // Inserção de um valor na árvore
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor: "));
                    arvorebinaria.insereValor(numero);
                    break;
                case 2:
                    // Obtenção do nível de um nó
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor do Nó: "));
                    int nivel = arvorebinaria.nivelProfundidadeNo(numero);
                    if (nivel == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " não existe na árvore");
                    } else if (nivel == 0) {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " é a RAIZ da árvore, Nível: 0");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " tem o nível: " + nivel);
                    }
                    break;
                case 3:
                    // Obtenção do nível da árvore
                    int nivelarvore = arvorebinaria.nivelProfundidadeAlturaArvore();
                    if (nivelarvore == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Não existe árvore");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "O Nível da árvore é: " + nivelarvore);
                    }
                    break;
                case 4:
                    // Obtenção da profundidade de um nó
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor do Nó: "));
                    int profundidade = arvorebinaria.nivelProfundidadeNo(numero);
                    if (profundidade == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " não existe na árvore");
                    } else if (profundidade == 0) {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " é a RAIZ da árvore, Profundidade: 0");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " tem a profundidade: " + profundidade);
                    }
                    break;
                case 5:
                    // Obtenção da profundidade da árvore
                    int profundidadearvore = arvorebinaria.nivelProfundidadeAlturaArvore();
                    if (profundidadearvore == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Não existe árvore");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "A profundidade da árvore é: " + profundidadearvore);
                    }
                    break;
                case 6:
                    // Obtenção da altura de um nó
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor do Nó: "));
                    int altura = arvorebinaria.alturaNo(numero);
                    if (altura == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " não existe na árvore");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Nó: " + numero + " tem a altura: " + altura);
                    }
                    break;
                case 7:
                    // Obtenção da altura da árvore
                    int alturaarvore = arvorebinaria.nivelProfundidadeAlturaArvore();
                    if (alturaarvore == -1) {
                        JOptionPane.showMessageDialog((Component)null, "Não existe árvore");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "A altura da árvore é: " + alturaarvore);
                    }
                    break;
                case 8:
                    // Impressão da árvore
                    arvorebinaria.imprimeArvore();
            }
        }
    }
}
