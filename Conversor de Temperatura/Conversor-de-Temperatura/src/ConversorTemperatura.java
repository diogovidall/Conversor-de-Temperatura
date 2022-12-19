import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemperatura {
    public static void main(String[] args) {
        //variaveis
        double c,f;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //entrada
        System.out.println("Conversão de Temperatura");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        f = teclado.nextDouble();
        //Processamento
        c = (5 * (f - 32)) / 9;
        //Saida
        System.out.println("Temperatura em Celsius: " + formatador.format(c) +  "°C");

        teclado.close();
    }
}
