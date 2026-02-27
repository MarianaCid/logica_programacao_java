import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat fPerc = new DecimalFormat("##0%");

        //MATRIZ
        double[][] mes1 = new double[3][3];
        double[][] mes2 = new double[3][3];
        double[][] bimestre = new double[3][4];


        //VETORES
        String[] nomeProd = new String[]{"prod1", "prod2", "prod3"};
        String[] nomeLoja = new String[]{"LojaA", "LojaB", "LojaC"};
        double[] somaLoja = new double[3];
        double[] percLoja = new double[3];
        double[] somaProduto = new double[3];

        //VARIÁVEIS
            double somaMatriz=0, maiorProduto=0, menorLoja=0;
            int indProdMaior=0, indMenorLoja=0, contador=0;
        //MES 1
        System.out.println("MÊS 1");
        for (int produto=0; produto<3; produto++){
            for (int loja=0; loja<3; loja++){
                System.out.print("Produto " + (produto+1) + " - Loja " + (loja+1) + ":");
                mes1[produto][loja]= entrada.nextDouble();
            }
        }

        //MÊS 2
        System.out.println("MÊS 2");
        for (int produto=0; produto<3; produto++){
            for (int loja=0; loja<3; loja++){
                System.out.print("Produto " + (produto+1) + " - Loja " + (loja+1) + ":");
                mes2[produto][loja]= entrada.nextDouble();
            }
        }

        //LETRA A)
        //Bimestre
        for (int produto=0; produto<3; produto++) {
            for (int loja = 0; loja < 3; loja++) {
                bimestre[produto][loja]+=mes1[produto][loja] + mes2[produto][loja];
                somaMatriz+=bimestre[produto][loja];
            }
        }

        //Carregar coluna meta
        for (int produto=0; produto<3; produto++){
            System.out.print("Digite a meta de produtos " + (produto+1) + ":");
            bimestre[produto][3]= entrada.nextDouble();
        }

        //Letra B
        System.out.println("");
        System.out.println("---------- Porcentagem por loja ----------");
        for (int loja=0; loja<3; loja++){
            for (int produto=0; produto<3; produto++){
                somaLoja[loja]+=bimestre[produto][loja];
            }
            percLoja[loja]=somaLoja[loja]/somaMatriz; //no calculo não multiplicamos por 100, pois colocamos o decimal format
            System.out.println("Porcentagem de vendas loja " + (loja+1) + ":" + fPerc.format(percLoja[loja]));
        }

        //Letra C
        System.out.println("");
        System.out.println("------------ Produto com a melhor saída ----------");
        for (int produto=0; produto<3; produto++){
            for (int loja=0; loja<3; loja++){
                somaProduto[produto]+=bimestre[produto][loja];
            }
            if(somaProduto[produto]>maiorProduto){
                maiorProduto=somaProduto[produto];
                indProdMaior=produto;
            }
        }
        System.out.println("Produto "+ (indProdMaior+1) + " - " + maiorProduto);

        //Letra D
        System.out.println("");
        System.out.println("---------- A loja com menor venda no bismestre ----------");
        for (int loja=0; loja<3; loja++){
            if(loja==0){
                menorLoja=somaLoja[loja];
                indMenorLoja = loja;
            } else if (somaLoja[loja] < menorLoja) {
                menorLoja=somaLoja[loja];
                indMenorLoja = loja;
            }
        }
        System.out.println("A loja " + (indMenorLoja+1) + " total " + menorLoja + " tem a menor venda do bimestre.");

        //Letra E
        System.out.println("");
        System.out.println("----------- Qunatos Produtos atingiram a meta no bimestre -----------");
        for (int produto=0; produto<3; produto++){
            if(somaProduto[produto]>bimestre[produto][3]){
                contador++;
            }
        }
        System.out.println("Quntidade de produtos que atingiram a meta: " + contador);
    }
}
