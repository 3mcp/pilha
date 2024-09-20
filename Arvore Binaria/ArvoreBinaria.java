class No {
    int valor;
    No esquerdo, direito;

    public No(int valor) {
        this.valor = valor;
        esquerdo = direito = null;
    }
}

class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // Método para inserir um valor na árvore
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
        System.out.println("Número adicionado: " + valor);
    }

    // Inserção recursiva
    private No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerdo = inserirRec(raiz.esquerdo, valor);
        } else if (valor > raiz.valor) {
            raiz.direito = inserirRec(raiz.direito, valor);
        }

        return raiz;
    }

    // Método para remover um valor da árvore
    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
        System.out.println("Número removido: " + valor);
    }

    // Remoção recursiva
    private No removerRec(No raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        // Encontrar o nó a ser removido
        if (valor < raiz.valor) {
            raiz.esquerdo = removerRec(raiz.esquerdo, valor);
        } else if (valor > raiz.valor) {
            raiz.direito = removerRec(raiz.direito, valor);
        } else {
            // Caso 1: Nó com no máximo um filho
            if (raiz.esquerdo == null)
                return raiz.direito;
            else if (raiz.direito == null)
                return raiz.esquerdo;

            // Caso 2: Nó com dois filhos
            raiz.valor = menorValor(raiz.direito);
            raiz.direito = removerRec(raiz.direito, raiz.valor);
        }

        return raiz;
    }

    // Encontrar o menor valor na subárvore direita
    private int menorValor(No raiz) {
        int min = raiz.valor;
        while (raiz.esquerdo != null) {
            min = raiz.esquerdo.valor;
            raiz = raiz.esquerdo;
        }
        return min;
    }

    // Método para imprimir a árvore (em ordem)
    public void emOrdem() {
        emOrdemRec(raiz);
    }

    private void emOrdemRec(No raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerdo);
            System.out.print(raiz.valor + " ");
            emOrdemRec(raiz.direito);
        }
    }
}
