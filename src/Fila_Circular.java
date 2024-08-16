public class Fila_Circular <T>{
    private int top = -1;
    private int base = 0;
    private int[] data;
    private int qnt;

    private int maxqnt;

    public Fila_Circular(int maxqnt) {
        this.data = new int[maxqnt];
        this.maxqnt = maxqnt;
    }

    public void add(int item) {
        if (this.isFull()) {
            System.out.println("A fila está cheia, não é possivel adicionnar um elemento");
        } else {
            this.top = (this.top + 1) % this.data.length;
            this.data[this.top] = item;
            this.qnt++;
        }
    }

    public int remove(){
        if (this.isEmpty()) {
            System.out.println("A fila está vazia, não é possivel remover elemento ");
            return -1;
        } else {
            int removedItem = this.data[this.base];
            this.data[this.base] = 0;
            this.base = (this.base + 1) % this.data.length;
            this.qnt--;
            return removedItem;
        }
    }

    public void clear() {
        this.top = -1;
        this.base = 0;
        System.out.println("A fila foi limpa");
    }

    public boolean isFull(){
        return (this.qnt == maxqnt);
    }

    public boolean isEmpty(){
        return (this.qnt == 0);
    }
}
