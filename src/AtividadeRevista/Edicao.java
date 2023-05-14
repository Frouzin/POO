package AtividadeRevista;

import java.util.Date;

public class Edicao {
	
	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;
	
	public Edicao(int numero, Date data, int tiragem, int qtdeVendida) {
		this.numero = numero;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.reciclou = false;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public int getTiragem() {
		return tiragem;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public boolean isReciclou() {
		return reciclou;
	}
	
	public void reciclarExemplares() {
		this.reciclou = true;
	}
	
	public int obterQtdeReciclagem() {
		return this.tiragem-this.qtdeVendida;
	}
}
