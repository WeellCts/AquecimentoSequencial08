import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("Digite a distância percorrida (km): ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite os litros de combustível consumidos: ");
        double litros = entrada.nextDouble();

        // PROCESSAMENTO
        double consumoMedio = distancia / litros;

        // DECISÃO E SAÍDA
        System.out.println("Média de consumo: " + consumoMedio + " km/l");

        if (consumoMedio >= 12.0) {
            System.out.println("Consumo econômico");
        } else {
            System.out.println("Consumo elevado");
        }

        entrada.close();
    }
}
