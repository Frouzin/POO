package AttNavio;

public class NavioApp {
    public static void main(String[] args) {

        NavioGraneleiro navioGraneleiro1 = new NavioGraneleiro(10, "Estrela do Mar",50000 ,4 , 4);
        System.out.println("ID do Navio: "+ navioGraneleiro1.getId());
        System.out.println("Nome do Navio: "+ navioGraneleiro1.getNome());
        System.out.println("Carga do Navio: "+ navioGraneleiro1.getCapacidadeCarga());
        System.out.println("Quantidade de Porões do Navio: "+ navioGraneleiro1.getQuantidadePoroes());
        System.out.println("Quantidade de escotilhas do Navio: "+ navioGraneleiro1.getQuantidadeEscotilhas());
        System.out.println();

        NavioGraneleiro navioGraneleiro2 = new NavioGraneleiro(25,"Cruzeiro do Sul",80000 ,3 , 6);
        System.out.println("ID do Navio: "+ navioGraneleiro2.getId());
        System.out.println("Nome do Navio: "+ navioGraneleiro2.getNome());
        System.out.println("Carga do Navio: "+ navioGraneleiro2.getCapacidadeCarga());
        System.out.println("Quantidade de Porões do Navio: "+ navioGraneleiro2.getQuantidadePoroes());
        System.out.println("Quantidade de escotilhas do Navio: "+ navioGraneleiro2.getQuantidadeEscotilhas());
        System.out.println();

        NavioContainer navioConteiner1 = new NavioContainer(33,"Bela Fera",100000,2,2,30);
        System.out.println("ID do Navio: "+ navioConteiner1.getId());
        System.out.println("Nome do Navio: "+ navioConteiner1.getNome());
        System.out.println("Carga do Navio: "+ navioConteiner1.getCapacidadeCarga());
        System.out.println("Quantidade de Porões do Navio: "+ navioConteiner1.getQuantidadePoroes());
        System.out.println("Quantidade de Guindaste do Navio: "+ navioConteiner1.getQuantidadeGuindaste());
        System.out.println("Quantidade de Camadas do Navio: "+ navioConteiner1.getQuantidadeCamadas());
        System.out.println();

        NavioContainer navioConteiner2 = new NavioContainer(48,"Arrecifes",120000,2,2,30);
        System.out.println("ID do Navio: "+ navioConteiner2.getId());
        System.out.println("Nome do Navio: "+ navioConteiner2.getNome());
        System.out.println("Carga do Navio: "+ navioConteiner2.getCapacidadeCarga());
        System.out.println("Quantidade de Porões do Navio: "+ navioConteiner2.getQuantidadePoroes());
        System.out.println("Quantidade de Guindaste do Navio: "+ navioConteiner2.getQuantidadeGuindaste());
        System.out.println("Quantidade de Camadas do Navio: "+ navioConteiner2.getQuantidadeCamadas());
        System.out.println();

        NavioContainer navioConteiner3 = new NavioContainer(52,"Aguas Belas",90000,1,0,25);
        System.out.println("ID do Navio: "+ navioConteiner3.getId());
        System.out.println("Nome do Navio: "+ navioConteiner3.getNome());
        System.out.println("Carga do Navio: "+ navioConteiner3.getCapacidadeCarga());
        System.out.println("Quantidade de Porões do Navio: "+ navioConteiner3.getQuantidadePoroes());
        System.out.println("Quantidade de Guindaste do Navio: "+ navioConteiner3.getQuantidadeGuindaste());
        System.out.println("Quantidade de Camadas do Navio: "+ navioConteiner3.getQuantidadeCamadas());

    }

}