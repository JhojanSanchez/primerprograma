import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluciones = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le daria a la película Matrix");
            nota = teclado.nextDouble();

            if(nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluciones++;
            }

        }
        System.out.println("La media de evaluaciones para Matriz es: " + mediaEvaluaciones / totalEvaluciones);

    }
}