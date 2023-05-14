package AtividadeRevista;

import java.util.Date;

public class AppRevista {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		
		Revista revista = new Revista();
		revista.adicionarEdicao(52, data, 1000, 800);
		revista.adicionarEdicao(53, data, 900, 900);
		revista.adicionarEdicao(54, data, 1200, 1000);
		
		resultadoReciclarEdicao("Reciclando edicao 53",revista.reciclarEdicao(53), revista);
		resultadoReciclarEdicao("Reciclando edicao 54",revista.reciclarEdicao(54), revista);
		resultadoReciclarEdicao("Reciclando edicao 54 novamente",revista.reciclarEdicao(54), revista);
		resultadoReciclarEdicao("Reciclando edicao 99",revista.reciclarEdicao(99),revista );
	}

	 public static void resultadoReciclarEdicao(String numeroEdicao, String texto, Revista revista) {
		System.out.println("\n"+numeroEdicao);
		System.out.println(texto);
		System.out.println("Reciclagem produzida:..............." + revista.getReciclagemProduzida());
		for(Edicao edicao : revista.getEdicoes()) {
			System.out.println("O identificador da edicao:.........." + edicao.getNumero());
			// como n foi pedido para imprimir data, esta comentada.
			//System.out.println("a data e:." + edicao.getData());
			System.out.println("O atributo e:.......................\n" + edicao.isReciclou());

		}
	 }
}
