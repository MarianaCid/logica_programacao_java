import java.util.Scanner;

public class Exercicio08 {

    static Scanner entrada = new Scanner(System.in);
    static String[] nomes = new String[]{"Max Verstappen", "Lando Norris", "Charles Leclerc","Lewis Hamilton","George Russel"};


    public static void main(String[] args) {
        String[] paises = new String[]{"Bélgica","Itália","Cingapura","Malásia","Japão"};
        relatorioGeral(paises);

    }


    public static void relatorioGeral(String[] paises){

        int[][] pontos = pontos(paises);
        int[] somaPontos = somaPontos(pontos);
        String[] vencedores = vencedor(pontos);

        System.out.println("----------- RELATÓRIO GERAL -----------");
        System.out.println("");

        System.out.println("Pontuação total dos pilotos");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " -> " + somaPontos[i] + " pontos");
        }

        System.out.println("");
        System.out.println("Vencedores por GP");
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] + " - " + vencedores[i]);
        }

        System.out.println("");
        pilotoVencedor(somaPontos);


    }

    static public int[][] pontos(String[] paises){
        int[][] pontos = new int[5][5];

        for (int pilotos=0; pilotos<5; pilotos++){
            System.out.println(nomes[pilotos]);
            for (int pais=0; pais<5; pais++){
                System.out.println("Digite a pontuação ( " + (paises[pais]) + " ):");
                pontos[pilotos][pais] = entrada.nextInt();
            }
        }

        return pontos;
    }

    static public int[] somaPontos(int[][] pontos){
        int[] somaPontos = new int[5];

        for (int pilotos=0; pilotos<5; pilotos++){
            for (int pais=0; pais<5; pais++){
                somaPontos[pilotos]+=pontos[pilotos][pais];
            }
        }

        return somaPontos;
    }

    static public String[] vencedor(int[][] pontos){

        String[] vencedores = new String[5];
        int ind=0, maior=0;

        for (int pais=0; pais<5; pais++){

            ind = 0;
            maior = 0;

            for (int pilotos=0; pilotos<5; pilotos++){

                if(pontos[pilotos][pais]>maior){
                    maior=pontos[pilotos][pais];
                    ind = pilotos;
                }

            }
            vencedores[pais]=nomes[ind];
        }

        return vencedores;
    }


    public static void pilotoVencedor(int[] somaPontos){

        int maior=0;
        String vencedor="";

        for (int piloto=0; piloto<5; piloto++){
            if (somaPontos[piloto]>maior){
                maior=somaPontos[piloto];
                vencedor = nomes[piloto];
            }
        }

        System.out.println("O piloto campeão foi " + vencedor + " com o total de pontos de " + maior);

    }
}
