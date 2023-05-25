package ExameDiabete;

public class Exame {
	
	
	private final int idExame;
	private String nomePaciente;
	private int nivelGlicose;
	
	
	
		
		public int getIdExame() {
			return idExame;
		}
		
		public String getNomePaciente() {
			return nomePaciente;
		}
		
		public int getNivelGlicose() {
			return nivelGlicose;
		}
		
		public void setnomePaciente(String novoNomePaciente) {
			this.nomePaciente = novoNomePaciente;
		}
		public void  setNivelGlicose(int novoNivelGlicose) {
			this.nivelGlicose = novoNivelGlicose;
		}
	
		public Exame (int idExame, String nomePaciente, int nivelGlicose) {
			
			this.idExame = idExame;
			this.nomePaciente = nomePaciente;
			this.nivelGlicose = nivelGlicose;
			
		}
		
		public String obterDiagnostico() {
			
			if (nivelGlicose <= 99) {
				return "Normal";
			}
			else if (nivelGlicose <= 125) {
				return "Pre-diabetes";
			}
			else {
				return "Diabetes";
			}
		}
	}