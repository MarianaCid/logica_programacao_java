import java.util.Scanner;

public class Sprint2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //VARIÁVEIS//
        String direcao;
        int distancia = 0, cargaBat = 0;

        System.out.println("===SIMULADOR DE ROBÔ===");


        System.out.println("Para completar o circuito o robô precisa ter 180 de bateria.");

        System.out.print("Digite o nível de bateria do seu robô:");
        cargaBat = input.nextInt();

        if (cargaBat >= 180) {
            System.out.println("Seu robô tem carga o suficiente, pode iniciar a partida!");
        } else {
            System.out.println("Carregue seu robô e volte mais tarde!");
            return;
        }

        System.out.println("Dica 1: Siga em frente, mas só por um tempo, conte até quatro e pare no momento.");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();

        while (!(direcao.equalsIgnoreCase("FRENTE")) || !(distancia == 4)) {
            if (!(direcao.equalsIgnoreCase("FRENTE")) && !(distancia == 4)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("FRENTE"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 2: Vá para o lado da mão que te guia, logo após conte 5 passos sem hesitar.");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("DIREITA")) || !(distancia == 5)) {
            if (!(direcao.equalsIgnoreCase("DIREITA")) && !(distancia == 5)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("DIREITA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 3: Vá para onde o ponteiro não gira, com 4 paços de esforço.");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("ESQUERDA")) || !(distancia == 4)) {
            if (!(direcao.equalsIgnoreCase("ESQUERDA")) && !(distancia == 4)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("ESQUERDA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 4: Após desviar do caminho anterior, vá para o lado " +
                "certo do ponteiro, com 4 passos você chegará no horário");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("DIREITA")) || !(distancia == 4)) {
            if (!(direcao.equalsIgnoreCase("DIREITA")) && !(distancia == 4)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("DIREITA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 5: Se ainda tiver dúvidas, vá onde o sol já se escondeu, e com 7 passos, firme o pé no chão");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("DIREITA")) || !(distancia == 7)) {
            if (!(direcao.equalsIgnoreCase("DIREITA")) && !(distancia == 7)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("DIREITA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente!");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 6: Se estiver confuso(a), siga ao lado oposto da razão e de 13 passos decisivo. ");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("ESQUERDA")) || !(distancia == 13)) {
            if (!(direcao.equalsIgnoreCase("ESQUERDA")) && !(distancia == 13)) {
                System.out.println("Direção e distância erradas, tente novamente!");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("ESQUERDA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Caminho correto, siga em frente!");
        System.out.println("Ainda resta: " + cargaBat + " de bateria");


        System.out.println("Dica 7: Você precisa tomar a última decisão, o som à esquerda te chama uma última " +
                "vez, atenda. Oito passos, e o destino estará a sua frente!");
        System.out.print("Digite a direção:");
        direcao = input.next().toUpperCase();
        System.out.print("Digite a distância:");
        distancia = input.nextInt();


        while (!(direcao.equalsIgnoreCase("ESQUERDA")) || !(distancia == 8)) {
            if (!(direcao.equalsIgnoreCase("ESQUERDA")) && !(distancia == 8)) {
                System.out.println("Direção e distância erradas, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            } else if (!(direcao.equalsIgnoreCase("ESQUERDA"))) {
                System.out.println("Direção errada, tente novamente");
                System.out.print("Digite a direção:");
                direcao = input.next().toUpperCase();
            } else {
                System.out.println("Distância errada, tente novamente");
                System.out.print("Digite a distância:");
                distancia = input.nextInt();
            }
        }
        cargaBat -= (distancia * 4);
        System.out.println("Você chegou ao final do caminho!");
        System.out.println("Restou " + cargaBat + " de bateria");
    }
}