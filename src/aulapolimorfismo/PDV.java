package aulapolimorfismo;

import java.io.FileInputStream;
import java.util.Properties;

public class PDV {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("param.properties");
		Properties props = new Properties();
		props.load(fis);
		String classe = props.getProperty("impressora");
		
		ImpressoraFiscal imp = (ImpressoraFiscal) Class.forName(classe).newInstance();
		
		
		imp.vendeItem("Antarctica Lata", 2);
		imp.vendeItem("Carvao", 7);
		imp.vendeItem("Picanha", 30);
		imp.finalizar();
		
		
	}
	
}
