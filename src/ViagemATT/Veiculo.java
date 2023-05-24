package ViagemATT;

public class Veiculo {
	
	private int idVeiculo;

	private String placa;
	private char status;
	private int kmOdometro;
	
	public Veiculo(int idVeiculo, String placa, int kmOdometro) {
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.status = 'D';
		this.kmOdometro = kmOdometro;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public char getStatus() {
		return status;
	}

	public int getKmOdometro() {
		return kmOdometro;
	}
	
	void registrarViagem() {		
			this.status = 'V';	
	}
	
	void registrarRetorno(int kmOdometro) {	
			this.status ='D';
			this.kmOdometro = kmOdometro;	
	}
	
	void revisar() {		
			this.status = 'M';		
	}	
}