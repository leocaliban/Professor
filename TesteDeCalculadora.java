
package Professor;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAccept;
import easyaccept.EasyAcceptFacade;

public class TesteDeCalculadora {

    public static void main(String[] args) {
		
        List<String> arquivos = new ArrayList<String>();
	
        arquivos.add("testeDivisao.txt");
	CalculadoraFacade calculadoraFacade = new CalculadoraFacade();

	EasyAcceptFacade eaFacade = new EasyAcceptFacade(calculadoraFacade, arquivos);

	eaFacade.executeTests();

	System.out.println(eaFacade.getCompleteResults());
	}

}