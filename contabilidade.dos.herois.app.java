import java.util.Scanner;

public class ContabilidadeHerois {
        
    public static double calculoSalario(double horasT, int diasT, double valorH){
        return horasT * diasT * valorH;
    }
            
    public static void main(String[] args) {
        //declaração das variáveis
        Scanner entrada = new Scanner(System.in);
        String[] nomeHeroi = new String [3];
        double[] horasTrabalhadas = new double[3];
        int[] diasTrabalhados = new int[3];
        double[] valorHora = new double[3];
        double[] salarioHeroi = new double[3];
        
        for (int x = 0; x < 3; x++){
            System.out.println("Digite o nome do heroi " + x + ": ");
            nomeHeroi[x] = entrada.nextLine();
            
            System.out.println("Digite o numero de horas trabalhadas pelo heroi " + x + ": ");
            horasTrabalhadas[x] = entrada.nextDouble();
            
            System.out.println("Digite o numero de dias trabalhadas pelo heroi " + x + ": ");
            diasTrabalhados[x] = entrada.nextInt();
            
            System.out.println("Digite o valor da hora trabalhada pelo heroi " + x + ": ");
            valorHora[x] = entrada.nextDouble();
            
            entrada.nextLine(); //Consome o resto da linha deixado pelo nextDouble()
        }
        
        for (int x = 0; x < 3; x++){
            salarioHeroi[x] = calculoSalario(horasTrabalhadas[x], diasTrabalhados[x], valorHora[x]);
        }
        
        for (int x = 0; x < 3; x++) {
            System.out.println("Nome do heroi " + x + ": " + nomeHeroi[x] );
            System.out.println("Salario do heroi " + x + ": " + salarioHeroi[x] );
        } 
    }
 
}
