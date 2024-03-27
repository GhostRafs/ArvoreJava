public class Arvore {
    No raiz = null; // Declaração da raiz da árvore

    Arvore() {
    }

    public void insereValor(int valor) {
        if (this.raiz == null) { // Se a árvore estiver vazia, o novo nó será a raiz
            this.raiz = new No(valor);
        } else {
            this.raiz = this.insereFilho(this.raiz, valor); // Caso contrário, chama a função recursiva para inserir o valor
        }
    }

    public No insereFilho(No no, int valor) {
        if (no == null) {
            return new No(valor); // Se o nó for nulo, cria um novo nó com o valor
        } else {
            if (valor < no.valor) { // Se o valor for menor que o valor do nó atual, insere na subárvore esquerda
                no.esquerda = this.insereFilho(no.esquerda, valor);
            } else if (valor > no.valor) { // Se o valor for maior que o valor do nó atual, insere na subárvore direita
                no.direita = this.insereFilho(no.direita, valor);
            }
            return no;
        }
    }

    // Método para calcular o nível de profundidade de um determinado valor na árvore
    public int nivelProfundidadeNo(int valor) {
        return this.raiz.valor == valor ? 0 : this.nivelProfundidadeFilho(this.raiz, valor, 0);
    }

    // Método auxiliar para calcular o nível de profundidade de um valor recursivamente
    public int nivelProfundidadeFilho(No no, int valor, int niveleprofundidade) {
        if (no == null) {
            return -1; // Se o nó for nulo, retorna -1
        } else if (no.valor == valor) {
            return niveleprofundidade; // Se encontrar o valor, retorna o nível de profundidade
        } else {
            if (no.valor > valor) { // Se o valor for menor que o valor do nó atual, verifica na subárvore esquerda
                niveleprofundidade = this.nivelProfundidadeFilho(no.esquerda, valor, niveleprofundidade + 1);
            } else {
                niveleprofundidade = this.nivelProfundidadeFilho(no.direita, valor, niveleprofundidade + 1); // Caso contrário, verifica na subárvore direita
            }
            return niveleprofundidade;
        }
    }

    // Método para calcular a altura da árvore
    public int nivelProfundidadeAlturaArvore() {
        return this.verificaProfundidade(this.raiz, -1);
    }

    // Método auxiliar para calcular a altura da árvore recursivamente
    public int verificaProfundidade(No no, int valor) {
        if (no == null) {
            return valor; // Se o nó for nulo, retorna o valor atual (inicializado como -1)
        } else {
            int esquerda = this.verificaProfundidade(no.esquerda, valor + 1); // Verifica a altura na subárvore esquerda
            int direita = this.verificaProfundidade(no.direita, valor + 1); // Verifica a altura na subárvore direita
            return esquerda > direita ? esquerda : direita; // Retorna a maior altura entre as subárvores
        }
    }

    // Método para calcular a altura de um determinado valor na árvore
    public int alturaNo(int valor) {
        return this.buscaNo(this.raiz, valor);
    }

    // Método auxiliar para calcular a altura de um determinado valor na árvore recursivamente
    public int buscaNo(No no, int valor) {
        if (no == null) {
            return -1; // Se o nó for nulo, retorna -1
        } else if (no.valor == valor) {
            return this.verificaAlturaFilho(no, -1); // Se encontrar o valor, retorna a altura do nó
        } else if (no.valor > valor) { // Se o valor for menor que o valor do nó atual, verifica na subárvore esquerda
            return this.buscaNo(no.esquerda, valor);
        } else {
            return no.valor < valor ? this.buscaNo(no.direita, valor) : -1; // Caso contrário, verifica na subárvore direita
        }
    }

    // Método auxiliar para calcular a altura de um nó recursivamente
    public int verificaAlturaFilho(No no, int altura) {
        if (no == null) {
            return altura; // Se o nó for nulo, retorna a altura atual
        } else {
            int esquerda = this.verificaAlturaFilho(no.esquerda, altura + 1); // Verifica a altura na subárvore esquerda
            int direita = this.verificaAlturaFilho(no.direita, altura + 1); // Verifica a altura na subárvore direita
            return esquerda > direita ? esquerda : direita; // Retorna a maior altura entre as subárvores
        }
    }

    // Método para imprimir a árvore em ordem
    public void imprimeArvore() {
        this.imprimeArvoreFormatada(this.raiz, 0);
    }

    // Método auxiliar para imprimir a árvore em ordem formatada
    public void imprimeArvoreFormatada(No no, int posicao) {
        if (no != null) {
            this.imprimeArvoreFormatada(no.direita, posicao + 1); // Imprime a subárvore direita
            for(int i = 0; i < posicao; ++i) {
                System.out.print("\t"); // Imprime espaços para formatar a árvore
            }
            System.out.println(no.valor); // Imprime o valor do nó atual
            this.imprimeArvoreFormatada(no.esquerda, posicao + 1); // Imprime a subárvore esquerda
        }
    }
}
