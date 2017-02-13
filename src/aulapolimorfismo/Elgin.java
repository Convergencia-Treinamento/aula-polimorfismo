package aulapolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Elgin extends ImpressoraFiscal{

	private double total;
	
	@Override
	public void vendeItem(String desc, double valor) {
		System.out.printf("ELGIN --- %-30s %10.2f\n", desc, valor);
		total += valor;
	}
	
	@Override
	public void finalizar() {
		System.out.println("====================================");
		System.out.printf("Total: %.2f\n", total);
	}

	
}
