public class No {
    int valor; // Valor armazenado no nó
    No esquerda; // Referência para o nó filho à esquerda
    No direita; // Referência para o nó filho à direita

    No(int valor) {
        this.valor = valor;
        // Inicializa os nós filhos como nulos
        this.esquerda = null;
        this.direita = null;
    }
}
