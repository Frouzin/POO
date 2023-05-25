package ExameDiabete;

import java.util.Scanner;
public class AppExame {
	
	static Exame[] diag = new Exame[4];
	static Scanner scan = new Scanner(System.in);
	static int contExame = 0;
	
	public static void main(String[] args) {

		int opcao = 0;
		do {
			
			System.out.println("\n");
			System.out.println("1 - Cadastrar exame");
			System.out.println("2 - Consultar exame");
			System.out.println("3 - Alterar exame");
			System.out.println("4 - Excluir exame");
			System.out.println("5 - Listar exame");
			System.out.println("0 - Finalizar programa");

			System.out.print("\nOpcao: ");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraExame();
				break;
			case 2:
				consultaExame();
				break;
			case 3:
				alteraExame();
				break;
			case 4:
				excluiExame();
				break;
			case 5:
				listaExames();
				break;
			case 0:
				System.out.println("\n -PROGRAMA FINALIZADO- \n");
				break;
			default:
				System.out.println("\n -Opcão inexistente- \n");
				
			}
			
		} while (opcao != 0);
		scan.close();
	}

	public static int pesquisaExamePorId(int codigo) {
		
		for (int i = 0; i < diag.length; i++) {
			if (diag[i] != null && codigo == diag[i].getIdExame()) {
				return i;
			}
		}
		return -1;
	}

	public static void cadastraExame() {
				
		if (contExame == diag.length) {
			System.out.println("\n -Espaco para cadastro cheio- \n");
			return;
		}
		
		System.out.print("\nCodigo Exame: ");
		int codigo = scan.nextInt();
		
		if (pesquisaExamePorId(codigo) != -1) {
			System.out.println("\n -Codigo ja cadastrado- \n");
			return;
		}	
		
		scan.nextLine();
		System.out.print("Nome paciente: ");
		String nomePaciente = scan.nextLine();
		System.out.print("Nivel glicose: ");
		int nivelGlicose = scan.nextInt();
		
		for (int i = 0; i < diag.length; i++) {
			if (diag[i] == null) {
				diag[i]= new Exame(codigo, nomePaciente, nivelGlicose);
				contExame++;
				System.out.println("\n -Cadastro efetuado- \n");
				return;
			}
		}
		
		System.out.println("\n -Espaco para cadastro insuficiente-");

	}	

	public static void consultaExame() {
		
		if (contExame == 0) {
			System.out.println("\n -Nao encontrado- ");

			return;
		}
		
		System.out.print("\nCodigo do ID: ");
		int codigo = scan.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorId(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n -ID nao cadastrado- \n");
			return;
		}
		
		System.out.println("\n -Consulta do Exame- \n");		
		System.out.printf("ID do exame.....: %d\n", diag[posicaoEncontrada].getIdExame());
		System.out.printf("Nome do paciente: %s\n", diag[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel da glicose: %d\n", diag[posicaoEncontrada].getNivelGlicose());
		System.out.printf("Resultado.......: %s\n", diag[posicaoEncontrada].obterDiagnostico());
	}
	
	public static void alteraExame() {
		
		System.out.println("\n -Alteracão de Exame- \n");
		if (contExame ==0) {
			System.out.println("\n -Exame Não encontrado- \n");

			return;
		}

		System.out.print("\nCodigo do ID: ");
		int codigo = scan.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorId(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n -Codigo nao cadastrado- \n");
			System.out.print("\n------------------------------------\n");

			return;
		}			
		
		System.out.printf("Codigo do ID....: %d\n", diag[posicaoEncontrada].getIdExame());
		System.out.printf("Nome do pacience: %s\n", diag[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel da glicose: %d\n", diag[posicaoEncontrada].getNivelGlicose());
		System.out.printf("Resultado.......: %s\n", diag[posicaoEncontrada].obterDiagnostico());				

		System.out.print("Alterar nome (N), alterar Glicose (G), ambos (A): ");
		char confirma;
		do {
		scan.nextLine();
		confirma = scan.nextLine().charAt(0);
		confirma = Character.toUpperCase(confirma);
		if(confirma == 'N' && confirma == 'G' && confirma == 'A') {
			continue;
		}
		break;
	} while (true);
	if (confirma == 'N') {
		
		System.out.println("\nNovo nome: ");
		String novoNome = scan.next();
		diag[posicaoEncontrada].setnomePaciente(novoNome);
        System.out.println("\n -Nivel da taxa de glicose alterado- \n");
    }
	
	else if (confirma == 'G'){
		
		System.out.println("\nNova taxa de glicose: ");
		int novaGlicose = scan.nextInt();
		diag[posicaoEncontrada].setNivelGlicose(novaGlicose);
		System.out.println("\n -Nome alterado- \n");

    }
	
	else {
		
		System.out.println("\nNova taxa de glicose: ");
		int novaGlicose = scan.nextInt();
		diag[posicaoEncontrada].setNivelGlicose(novaGlicose);
		System.out.println("\nNovo nome: ");
		String novoNome = scan.next();
		diag[posicaoEncontrada].setnomePaciente(novoNome);
		System.out.println("\n -Nivel da taxa de glicose alterado- \n");
		System.out.println("\n -Nome alterado- \n");
    }
}
		
	public static void excluiExame() {
		
		System.out.println("\n -Exclusao de cadastro- \n");
		if (contExame == 0) {
			System.out.println("\n -Não encontrado- \n");

			return;
		}
		
		System.out.print("\nCodigo do ID: ");
		int codigo = scan.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorId(codigo);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n -ID não cadastrado- \n");
			return;
		}			
		
		System.out.printf("Codigo do ID....: %d\n", diag[posicaoEncontrada].getIdExame());
		System.out.printf("Nome do paciente: %s\n", diag[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel de glicose: %d\n", diag[posicaoEncontrada].getNivelGlicose());
		System.out.printf("Resultado.......: %s\n", diag[posicaoEncontrada].obterDiagnostico());				
		
		char confirma;
		do {
			
			System.out.print("\nConfirma exclusão (S/N): ");
			scan.nextLine();
			confirma = scan.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma == 'S' && confirma == 'N') {
				continue;
			}
			break;
		} while (true);
		if (confirma == 'S') {
			if(posicaoEncontrada == diag.length-1) {
			diag[posicaoEncontrada] = null;
			System.out.println("\n -Diagnóstico Excluido- \n");
			contExame--;
			return;
		}
		for(int i = posicaoEncontrada; i < diag.length -1; i++) {
			diag[posicaoEncontrada] = diag[i+1];
					}
		diag[diag.length-1] = null;
		System.out.print("\n -Diagnóstico Excluido- \n");
		contExame--;
		}
		else{
			
			System.out.println("\n -Diagnóstico Excluido- \n");
        }
	}

	public static void listaExames() {
		
		System.out.println("\n -Listagem dos pacientes- \n");
		
		if (contExame ==0) {
			
			System.out.println("\n -Não existe cadastro- \n");
			return;
		}

		System.out.println("ID exame  | Nome paciente  |  Nivel de Glicose   |    Resultado   |");

		for (int i = 0; i < diag.length; i++) {
			
			if (diag[i] != null) {
				System.out.printf("%-9d | %-14s | %-18d | %-12s |\n",
						diag[i].getIdExame(),
						diag[i].getNomePaciente(),
						diag[i].getNivelGlicose(),
						diag[i].obterDiagnostico());

			}
			
			else {
				
				System.out.printf("%d - cadastro vazio\n", i);
			}
		}		
	}
}