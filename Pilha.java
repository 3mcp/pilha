public class Pilha <T>{
    private int top = 0;
    private T[] data;

    public void push(T p){
        if(isFull()){
            throw new RuntimeException("Pilha Cheia");
        }
        this.data[top] = p;
        this.top++;
    }

    private boolean isFull() {
        return top == data.length;
    }

    public T pop(){
        if (top == 0){
            throw new RuntimeException("Pilha Vazia");
        }
        top--;
        return data[top];
    }
}
