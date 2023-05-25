package ViagemATT;
import java.util.Date;

public class Viagem {

	private final int idViagem;
	private final String destino;
	private Date dataInicial;
	private Date dataFinal;
	private int kmPercorrido;
	private Veiculo veiculo;

	public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal) {
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.kmPercorrido = 0;
		this.veiculo = null;
	}

	public int getIdViagem() {
		return idViagem;
	}

	public String getDestino() {
		return destino;
	}

	public Date getDataInicial() {

		return dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public int getKmPercorrido() {
		return kmPercorrido;
	}


	boolean iniciarViagem(Veiculo veiculo) {
		if (veiculo.getStatus() == 'V') {
			return false;
		}
		this.veiculo = veiculo;
		this.veiculo.registrarViagem();
		this.dataInicial = new Date();
		return true;
	}

	void finalizarViagem(int kmOdometro) {
		this.veiculo.registrarRetorno(kmOdometro);
		this.kmPercorrido = calcularKmPercorrido();
		this.dataFinal = new Date();

	}

	int calcularKmPercorrido() {
		return veiculo.getKmOdometro() - kmPercorrido;
	}

}

