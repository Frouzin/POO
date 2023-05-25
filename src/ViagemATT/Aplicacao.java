package ViagemATT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
			SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
			Date data1 = form.parse("20-05-2023");
			Date dataFinal = form.parse("10-07-2023");


			Viagem viagem = new Viagem(110,"Recife",data1,dataFinal);

			System.out.printf("Numero da viagem: %d", viagem.getIdViagem());
			System.out.printf("Destino da viagem e: %s",viagem.getDestino());
			System.out.printf("Data  inicio da viagem: ",viagem.getDataInicial());
			System.out.printf("Data final da viagem: ",viagem.getDataFinal());
			System.out.printf("KM percorridos da viagem:%d ",viagem.getKmPercorrido());

		

			Veiculo veiculo = new Veiculo(520,"KKU5S33",0);
			System.out.printf("Numero do carro: %d ",veiculo.getIdVeiculo());
			System.out.printf("Placa do carro: %s ",veiculo.getPlaca());
			System.out.printf("Kilometragem do carro: %d",veiculo.getKmOdometro());
			System.out.printf("Status do veiculo: %s ",veiculo.getStatus());
			
			System.out.print("INICIO DA VIAGEM");
			System.out.println(viagem.iniciarViagem(veiculo));
			data1=new Date();
			System.out.printf("ID da viagem: %d", viagem.getIdViagem());
			System.out.printf("O destino da viagem e: %s",viagem.getDestino());
			System.out.printf("A data de inicio: %s",viagem.getDataInicial());
			System.out.printf("Os kilometros percorridos na viagem:%d ",viagem.getKmPercorrido());
			System.out.printf("ID do carro: %d ",veiculo.getIdVeiculo());
			System.out.printf("Status do carro: %s ",veiculo.getStatus());

			
			System.out.print("FINAL DA VIAGEM");
			System.out.print("O final da viagem esta para ser registrada");
			viagem.finalizarViagem(10000);
			veiculo.registrarRetorno(50000);
			System.out.println("O Final de viagem foi registrada");
			dataFinal = new Date();
			System.out.printf("id da viagem: %d", viagem.getIdViagem());
			System.out.printf("A viagem foi finalizafa em: %s",viagem.getDataFinal());
			System.out.printf("KM percorrido foi: %d",viagem.calcularKmPercorrido());
			System.out.printf("ID do carro: %d ",veiculo.getIdVeiculo());
			System.out.printf("Status do carro: %s ",veiculo.getStatus());

			

			veiculo.revisar();
			System.out.printf("id do carro: %d",veiculo.getIdVeiculo());
			System.out.printf("\nplaca do carro: %s",veiculo.getPlaca());
			System.out.printf("KM percorrido foi: %d",viagem.calcularKmPercorrido());
			System.out.printf("\nstatus do carro: %s ",veiculo.getStatus());
			}
	}	