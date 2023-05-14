package AtividadeRevista;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Revista {

	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List <Edicao> edicoes;
	
	public Revista(){
		
		this.reciclagemProduzida = 0;
		this.edicoes = new ArrayList<Edicao>();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}
	
	public List<Edicao> getEdicoes() {
		return edicoes;
	}
	
	public void adicionarEdicao(int numero, Date data, int tiragem, int qtdeVendida ) {
		edicoes.add(new Edicao(numero, data, tiragem, qtdeVendida));
	}
	
	public void removerEdicao(Edicao edicao) {
		edicoes.remove(edicao);
	}
	
	public String reciclarEdicao(int nr) {
		for (Edicao edicao : this.edicoes) {
            if (edicao.getNumero() == nr) {
                if (edicao.isReciclou()) {
                    return "Edicao ja reciclada";
                } else if (edicao.obterQtdeReciclagem() == 0) {
                    return "Nao houve exemplares para reciclar";
                } else 
                    this.reciclagemProduzida += edicao.obterQtdeReciclagem();
                    edicao.reciclarExemplares();
                    return "Reciclagem realizada";
            }
        }
        return "Edicao nao encontrada";
    }
	
}