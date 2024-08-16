public class Main {
    public static void main(String[] args) {
        Fila_Circular<Integer> filaCircular = new Fila_Circular<>(5);
        filaCircular.add(10);
        filaCircular.add(20);
        filaCircular.add(30);
        filaCircular.add(40);

        filaCircular.remove();
        filaCircular.remove();
        filaCircular.add(50);
        filaCircular.add(60);
        filaCircular.add(70);
        filaCircular.remove();
        filaCircular.remove();
        filaCircular.remove();
        filaCircular.remove();
        filaCircular.remove();
        filaCircular.remove();

        filaCircular.add(50);
        filaCircular.add(50);
        filaCircular.add(50);
        filaCircular.add(50);
        filaCircular.add(50);
        filaCircular.add(50);
        filaCircular.add(50);




        System.out.println("lalala");
    }
}
