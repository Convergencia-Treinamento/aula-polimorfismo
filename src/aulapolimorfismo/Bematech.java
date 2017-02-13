package aulapolimorfismo;

public class Bematech extends ImpressoraFiscal{

	@Override
	public void vendeItem(String desc, double valor) {
		System.out.printf("%-30s %10.2f\n", desc, valor);
	}
	
}
