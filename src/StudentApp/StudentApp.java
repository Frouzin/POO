package StudentApp;

import StudentEntities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        student.name = scan.nextLine();
        student.nota_1 = scan.nextDouble();
        student.nota_2 = scan.nextDouble();
        student.nota_3 = scan.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.somaNotas());

        if (student.somaNotas()< 60.0){
            System.out.println("Failed");
            System.out.printf("MISSING %.2f POINTS%n", student.noPassed());
        }
        else {
            System.out.println("PASS");
        }

    }
}