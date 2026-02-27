import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Matriz
        int[][] estoque = new int[5][3];
        int[] somaArmazem = new int[4];
        double[] somaProd = new double[3];
        double[] custoProd = new double[3];
        double[] custoArm = new double[4];

        //VARIÁVEL
        int maiorProd2=0, indiceProd2=0, menorArm=0, indArmMenor=0;


        //Carregar matriz
        for (int produto=0; produto<4; produto++){
            System.out.println("--------------- ESTOQUE NO ARMAZÉM ( " + (produto+1) + " ) ---------------");
            for (int armazem=0; armazem<3; armazem++){
                System.out.print("Infome a quantidade em estoque no produto ( " + (armazem+1) + " ):");
                estoque[produto][armazem] = entrada.nextInt();
            }
        }

        //carregar custo
        System.out.println("--------------------- CUSTO DE CADA PRODUTO --------------------");
        for (int armazem=0; armazem<3; armazem++){
            System.out.print("Informe o custo do Produto ( " + (armazem+1) + " ):");
            estoque[4][armazem] = entrada.nextInt();
        }

        // Alternativa A
        System.out.println("");
        System.out.println("---------- QUANTIDADE DE ITENS EM CADA ARMAZÉM ----------");
        for (int armazem=0; armazem<4; armazem++){

            for (int produto=0; produto<3; produto++){
                somaArmazem[armazem] += estoque[armazem][produto];
            }
            System.out.println("Estoque no armazém ( " + (armazem+1) + " ):" + somaArmazem[armazem]);
        }

        //ALTERNATIVA B
        System.out.println("");
        System.out.println("----------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ----------");
        for (int armazem=0; armazem<4; armazem++){
            if (estoque[armazem][1] > maiorProd2 ){
                //trava o produto na coluna 1 prod2
                maiorProd2 = estoque[armazem][1];
                indiceProd2 = armazem;
            }
        }

        //O for inicia no zero, por isso quando manipular indice
        //precisa vir com mais 1
        System.out.println("");
        System.out.println("Armazém ( " + (indiceProd2+1) + " ) com a quantidade de " + maiorProd2 + " no estoque." );

        //ALTERNATIVA C
        System.out.println("");
        System.out.println("--------- ARMAZÉM COM MENOR ESTOQUE --------");
        for (int armazem=0; armazem<4; armazem++){
            if (armazem==0){
                menorArm=somaArmazem[armazem];
                indArmMenor=armazem;
            } else if (somaArmazem[armazem]<menorArm){
                menorArm=somaArmazem[armazem];
                indArmMenor=armazem;
            }
        }

        System.out.println("");
        System.out.println("Armazém ( " +(indArmMenor+1)+ " ) com a quantidade de " +(menorArm) + " no estoque.");

        //ALTERNATIVA D
        System.out.println("");
        System.out.println("---------- CUSTO TOTAL DE CADA PRODUTO ------------");

        for (int produto=0; produto < 3; produto++){
            for (int armazem=0; armazem < 4; armazem++){
                somaProd[produto] += estoque[armazem][produto];
            }
            custoProd[produto] = somaProd[produto] * estoque[4][produto];
            System.out.println("");
            System.out.println("Custo total do produto ( " + (produto+1) + " ): " + custoProd[produto]);
        }

        //ALTERNATIVA E
        System.out.println("");
        System.out.println("--------- CUSTO TOTAL DE CADA ARMAZÉM ----------");

        for (int armazem=0; armazem<4;armazem++){
            for (int produto=0; produto<3; produto++){
                custoArm[armazem] += estoque[armazem][produto] * estoque[4][produto];
            }
            System.out.println("");
            System.out.println("Custo total no armazém ( " + (armazem+1) + " ): " + custoArm[armazem]);
        }
    }
}
