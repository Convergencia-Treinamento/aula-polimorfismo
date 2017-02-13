package aulapolimorfismo;

public class Epson extends ImpressoraFiscal{

	@Override
	public void vendeItem(String desc, double valor) {
		System.out.printf("Vendeu item: %s\n", desc);
	}
	
	@Override
	public void finalizar() {
		System.out.println("Finalizou");
	}
	
}
