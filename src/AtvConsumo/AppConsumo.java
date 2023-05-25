package AtvConsumo;

public class AppConsumo {
    public static void main(String[] args) {

        Consumo consumo = new Consumo(35);
        Consumo consumo1 = new Consumo(25.00, 'F');
        Consumo consumo2 = new Consumo(23.00, 'A');
        Consumo consumo3 = new Consumo(35.00, 'A');

        System.out.println(consumo);
        System.out.println();
        System.out.println(consumo1);
        System.out.println();
        System.out.println(consumo2);
        System.out.println();
        System.out.println(consumo3);


    }
}

