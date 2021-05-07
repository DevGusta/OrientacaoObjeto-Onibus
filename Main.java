import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(40,20,10);
        int pessoas = 0;
        boolean continua = true;
        boolean paradoNoPonto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo a sua vigaem!");

        while (continua){
            onibus.setPonto();
            if (onibus.getPonto() == 1){
                System.out.println();
                System.out.println(onibus.toString());
            }

            System.out.println();
            System.out.println("Estamos no ponto " + onibus.getPonto());

            if (pessoas > 0){
                for (int i = 0; i < pessoas; i++) {
                    onibus.sair();
                }
                System.out.println("Desceu do ônibus: " + pessoas + " pessoa(s)");
                pessoas = 0;
            }

            paradoNoPonto = true;

            while (paradoNoPonto){
                System.out.println();
                System.out.println("1.Entrar passageiro");
                System.out.println("2.Pedir para sair no próximo ponto");
                System.out.println("3.Continuar para o próximo ponto");
                System.out.println("4.Informações sobre a viagem");
                System.out.println("5.Encerrar viagem");
                System.out.print("Escolha uma das opções:");

                switch (teclado.nextInt()){
                    case 1:
                        System.out.println();
                        System.out.print("Quantos passageiros irão entrar? ");
                        int qtdPassageiros = teclado.nextInt();
                        for (int i = 0; i < qtdPassageiros; i++) {
                            onibus.entrar();
                        }
                        break;
                    case 2:
                        if(onibus.getDentroVeiculo() == 0){
                            System.out.println();
                            System.out.println("Não há passageiros no ônibus.");
                            break;
                        }
                        System.out.println();
                        pessoas = onibus.pedirPraDescer();
                        break;
                    case 3:
                        paradoNoPonto = false;
                        break;
                    case 4:
                        System.out.println();
                        System.out.println(onibus.toString());
                        break;
                    case 5:
                        paradoNoPonto = false;
                        continua = false;
                        break;
                    default:
                        System.out.println();
                        System.out.print("Erro. Escolha uma das opções:");
                        break;
                }
            }
        }
        System.out.println();
        System.out.println("Obrigado pela viagem!");
    }
}
