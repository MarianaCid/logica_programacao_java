import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

    static Scanner entrada = new Scanner(System.in);
    static double[] carrosVendidos = new double[5];
    static  DecimalFormat formataMoeda = new DecimalFormat("R$ #,##0.00");

    public static void main(String[] args) {


        String[] carro = new String[]{"Classic","Cobalt","Onix","Prisma","Cruze"};
        double[] preco = new double[]{33600,44900,37790,43150,55400};


        int[][] vendasCarros = vendasCarros(carro);

        relatorioGerencial(carro,preco,vendasCarros);

    }

    static public int[][] vendasCarros(String[] carro){

        int[][] vendasCarros = new int[4][5];

        for ( int trimestre=0; trimestre<4; trimestre++){
            System.out.println("Vendas " + (trimestre+1) + "º TRI");
            for (int carros=0; carros<5; carros++){
                System.out.println("Digite a quantidade de vendas do carro ( " + (carro[carros] + " ):"));
                vendasCarros[trimestre][carros]= entrada.nextInt();
            }
        }
        return vendasCarros;
    }

    static public double[] calcularTotal(int[][] vendasCarros, double[] preco){

        double[] valorTotal = new double[5];

        for (int carros=0; carros<5; carros++){
            for (int trimestre=0; trimestre<4; trimestre++) {
                //carros vendidos é global, assim pode ser acessado no relatório gerencial
                carrosVendidos[carros] += vendasCarros[trimestre][carros];
            }
            valorTotal[carros] = carrosVendidos[carros] * preco[carros];
        }

        return valorTotal;
    }


    public static void relatorioGerencial(String[] carro, double[] preco , int[][] vendasCarros) {

        //Chama a função B
        double[] valorTotal  = calcularTotal(vendasCarros,preco);

        double totalGeral =0;

        System.out.println("RELATÓRIO GERENCIAL VIGORITO");
        for (int carros = 0; carros < 5; carros++) {
            System.out.println("Carro: " + carro[carros] + "\t Quantidade Geral: " + carrosVendidos[carros] + "\tTotal: "
                    +formataMoeda.format(valorTotal[carros]));

            totalGeral += valorTotal[carros];
        }
        System.out.println("Total Geral de Vendas: " + formataMoeda.format(totalGeral));
    }


}
