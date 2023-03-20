package StudentEntities;

public class Student {
    public double nota_1,nota_2,nota_3;

    public String name;

    public double somaNotas(){
        return nota_1+nota_2+nota_3;

    }
    public double noPassed(){
        if (somaNotas()<60.00){
            return 60.00 - somaNotas();
        }
        else {
            return 0.0;
        }
    }
}
