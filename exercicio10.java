import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //vetores
        int[] totVendas = new int[5];
        float[] comissao = new float[5];
        String[] nome = new String[2];
        String [] estado = new String[5];
        double[] percentualCom = new double[5];

        //Variáveis
        double pagoComi=0;
        float maiorComi=0;
        int  vendSP=0, nomeMaior=0, menorVenda=0, nomeMenor=0;

        for (int i=0; i<2; i++) {
            System.out.print("Digite o nome do vendedor:");
            nome[i] = entrada.next();
            System.out.print("Digite o total de vendas:");
            totVendas[i] = entrada.nextInt();
            System.out.print("Digite o percentual de comissão:");
            comissao[i] = entrada.nextFloat() / 100;
            System.out.print("Digite o estado do vendedor:");
            estado[i] = entrada.next();


            //Alternativa D
            if (comissao[i] > maiorComi) {
                maiorComi = comissao[i];
                nomeMaior = i;
            }

            //Alternativa E
            if (estado[i].equalsIgnoreCase("SP")) {
                vendSP++;
            }

            //Alternativa F
            if (i == 0) {
                menorVenda=totVendas[i];
                nomeMenor=i;
            } else{
                if (totVendas[i] < menorVenda) {
                    menorVenda = totVendas[i];
                    nomeMenor = i;
                }
            }
        }

        for (int i=0; i<2; i++){
            //Alternativa B
            //calcular comissão
            percentualCom[i] = totVendas[i] * comissao[i];
            System.out.println(nome[i] + "\t" + totVendas[i] + "\t" + comissao[i] + "\t" + percentualCom[i] + "\t" + estado[i]);

            //Alternativa C
            pagoComi += percentualCom[i];
        }

        System.out.println("O total de comissão pago aos funcionários é:" + pagoComi);
        System.out.println("O vendedor que recebeu maior comissão foi " + nome[nomeMaior] + " com: " + maiorComi);
        System.out.println("A quantidade de vendedores que pertencem a São Paulo é:" + vendSP);
        System.out.println("O vendedor que realizou a menor venda foi " + nome[nomeMenor] + " com:" + totVendas[menorVenda]);


    }
}
