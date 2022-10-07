import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que calcule a área de um quadrado, 
        //em seguida mostre o dobro desta área para o usuário.
        double lado;
        double area;
        double dobroArea;
        //passo 1 digite o lado do quadrado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a o lado do quadrado ");
        lado = teclado.nextDouble();
        teclado.close();
        // tarefa do programa: calcular a área do quadrado
        area = lado * lado;
        // dobro da área do quadrado
        dobroArea = area * 2;
        System.out.println("O dobro da área do quadrado é " + dobroArea);
        


        

    }
}
