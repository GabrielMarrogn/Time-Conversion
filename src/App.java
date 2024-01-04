import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundo,entrada;
        entrada = sc.nextInt();
        sc.close();

        horas = entrada / 3600;
        minutos = (entrada % 3600) / 60;
        segundo = (entrada % 3600) % 60; 
    
        System.out.println(horas +":" +minutos +":" +segundo); 
    }
}
