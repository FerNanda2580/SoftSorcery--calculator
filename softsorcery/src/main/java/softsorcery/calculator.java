package softsorcery;

public class calculator {
    
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    int multiplicacao(int a, int b){   
        return a * b;
    }
 
    int divisao(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero");
        }
        return a / b;
    }
 
    //int potenciacao(int a, int b){ 
    //}
 
    //int raizQuadrada(double a) {
    //}
}