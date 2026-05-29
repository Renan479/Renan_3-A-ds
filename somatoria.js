public class Main {
    public static void main(String args[]) {
        Numeros numeros = new Numeros();
        int retorno = numeros.soma(10, 20);
        System.out.println(retorno);        
    }
}

class Numeros {
    public int numero_inicial;
    public int numero_final;
    
    public int soma(int n1, int n2) {
        this.numero_inicial = n1;
        this.numero_final = n2;
        int resultadoLocal = 0; // Variável local limpa o resultado a cada nova chamada
        
        for (int i = this.numero_inicial; i <= this.numero_final; i++) {
            resultadoLocal += i;
        }
        return resultadoLocal;
    }
}
