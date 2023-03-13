package applicationElevator;

public class ElevadorApp {
    public static void main(String[] args) {

    Elevador elevador = new Elevador();

    elevador.cadastraElevador(5);
    System.out.println(elevador.getCodigo());
    System.out.println(elevador.getLimitePesooas());
    System.out.println(elevador.getPessoasTransportadas());
    System.out.println(elevador.getStatus());

    System.out.println("1ª operação");
    elevador.registraEntrada(6);
    elevador.registraSaida(1);
    System.out.println(elevador.getPessoasTransportadas());
    System.out.println(elevador.getStatus());

    System.out.println("2ª operação");
    elevador.registraEntrada(2);
    elevador.registraSaida(3);
    System.out.println(elevador.getPessoasTransportadas());
    System.out.println(elevador.getStatus());

    System.out.println("3ª operação");
    elevador.registraEntrada(10);
    elevador.registraSaida(2);
    System.out.println(elevador.getPessoasTransportadas());
    System.out.println(elevador.getStatus());

    }
}
