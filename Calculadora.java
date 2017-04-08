
package Professor;
public class Calculadora {
    public double dividir(double a, double b) throws IllegalArgumentException{
	if (b == 0)
            throw new IllegalArgumentException("Segundo parametro nao pode ser 0");
	else	
            return a / b;
    }
    public int somar(int a, int b) {
        int resultado = a+b;
        return resultado;
    } 
    public int multiplicar(int a, int b) {
        int resultado = a*b;
        return resultado;
    }
    public int subtrair(int a, int b) {
        int resultado = a-b;
        return resultado;
    } 
    
    public int fatorial (int a)throws Exception{
        if (a<0)
            throw new Exception("Erro! Não Existe Fatorial Para Números Negativos.");
        else{
            int entrada = a;
            int fatorial = entrada;
            while (entrada > 1){
               fatorial = fatorial * (entrada-1);
               entrada--;
            }
            return fatorial;
        }
    }   
}
