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
 
    float potenciacao(int a, int b){ 
        if (b == 0){
            return 1;
        }
        if(b < 0 ){
            int potenciacao = a;
            for(int i= 0; i<(-b-1); i++ ){
            potenciacao = a*potenciacao;
            }
            float numerador = 1;
            float result = numerador/potenciacao;
            return result;
        }
        int potenciacao = a;
        for(int i= 0; i<b-1; i++ ){
            potenciacao = a*potenciacao;
        }
        return potenciacao;
        }

        
    
 
    int fatorial(int a) {
        if( a < 0){
            throw new IllegalArgumentException("Numeros negativos não possuem fatorial");
        }
        else if(a == 0){
            return 1;
        }
        int resultado = 1;
        for(int i = a; i>=1; i--){
            resultado *= i;
        }
        return resultado;
    }
}