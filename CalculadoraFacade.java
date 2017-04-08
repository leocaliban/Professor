package Professor;
public class CalculadoraFacade {

    private Calculadora c;
	
    public CalculadoraFacade(){
	c = new Calculadora();
    }
    public double dividir(double a, double b) throws Exception{
	return c.dividir(a, b);
    }
    public int somar(int a, int b){
        return c.somar(a, b);
    }
    
    public int multiplicar(int a, int b){
        return c.multiplicar(a, b);
    }
    public int subtrair(int a, int b) {
        return c.subtrair(a, b);
    }	
    public int fatorial (int a)throws Exception{
        return c.fatorial(a);
    }
}
