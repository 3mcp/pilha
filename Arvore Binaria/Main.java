//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserir elementos
        arvore.inserir(10);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(9);  // 9 será inserido na posição correta de acordo com a lógica
        arvore.inserir(14);
        arvore.inserir(1);
        arvore.inserir(8);
        arvore.inserir(4);
        arvore.inserir(16);
        arvore.inserir(11);
        arvore.inserir(12);
        arvore.inserir(54);



        System.out.println("\nÁrvore em ordem:");
        arvore.emOrdem();

        // Remover elemento e mostrar o número removido
        System.out.println("\n\nRemovendo 9...");
        arvore.remover(9);

        System.out.println("\nÁrvore após remoção:");
        arvore.emOrdem();

        // Adicionar um novo elemento
        System.out.println("\n\nAdicionando 12...");
        arvore.inserir(12);

        System.out.println("\nÁrvore após adicionar 12:");
        arvore.emOrdem();
    }
}