import java.util.Scanner;

public class Onibus {
    private int dentroVeiculo;
    private int bilheteNormal;
    private int bilheteIdoso;
    private int bilheteEstudante;
    private int pessoasPe;
    private int pessoasSentadas;
    private int capTotal;
    private int capPessoasPe;
    private int capPessoasSentadas;
    private int qtdPontos;
    private int totalBilhetes;
    private int voltas;
    private int ponto;

    public Onibus(int capPessoasPe, int capPessoasSentadas, int qtdPontos) {
        this.capPessoasPe = capPessoasPe;
        this.capPessoasSentadas = capPessoasSentadas;
        this.qtdPontos = qtdPontos;
        capTotal = capPessoasPe + capPessoasSentadas;
        dentroVeiculo = 0;
        bilheteNormal = 0;
        bilheteEstudante = 0;
        bilheteIdoso = 0;
        totalBilhetes = 0;
        pessoasPe = 0;
        pessoasSentadas = 0;
        voltas = 0;
        ponto = 0;
    }

    public int getDentroVeiculo() {
        return dentroVeiculo;
    }

    public void setDentroVeiculo(int dentroVeiculo) {
        this.dentroVeiculo = dentroVeiculo;
    }

    public int getBilheteNormal() {
        return bilheteNormal;
    }

    public void setBilheteNormal(int bilheteNormal) {
        this.bilheteNormal = bilheteNormal;
    }

    public int getBilheteIdoso() {
        return bilheteIdoso;
    }

    public void setBilheteIdoso(int bilheteIdoso) {
        this.bilheteIdoso = bilheteIdoso;
    }

    public int getBilheteEstudante() {
        return bilheteEstudante;
    }

    public void setBilheteEstudante(int bilheteEstudante) {
        this.bilheteEstudante = bilheteEstudante;
    }

    public int getPessoasPe() {
        return pessoasPe;
    }

    public void setPessoasPe(int pessoasPe) {
        this.pessoasPe = pessoasPe;
    }

    public int getPessoasSentadas() {
        return pessoasSentadas;
    }

    public void setPessoasSentadas(int pessoasSentadas) {
        this.pessoasSentadas = pessoasSentadas;
    }

    public int getCapTotal() {
        return capTotal;
    }

    public void setCapTotal(int capTotal) {
        this.capTotal = capTotal;
    }

    public int getCapPessoasPe() {
        return capPessoasPe;
    }

    public void setCapPessoasPe(int capPessoasPe) {
        this.capPessoasPe = capPessoasPe;
    }

    public int getCapPessoasSentadas() {
        return capPessoasSentadas;
    }

    public void setCapPessoasSentadas(int capPessoasSentadas) {
        this.capPessoasSentadas = capPessoasSentadas;
    }

    public int getQtdPontos() {
        return qtdPontos;
    }

    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    }

    public int getTotalBilhetes() {
        return totalBilhetes;
    }

    public void setTotalBilhetes(int totalBilhetes) {
        this.totalBilhetes = totalBilhetes;
    }

    public int getVoltas() {
        return voltas;
    }

    public void setVoltas() {
        voltas++;

    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto() {
        if (ponto >= 10){
            setVoltas();
            ponto = 0;
        }
        ponto++;
    }

    public boolean estaCheio(){
        return capTotal == pessoasPe + pessoasSentadas;
    }

    public void entrar(){
        if(!estaCheio()){
            if(pessoasSentadas != capPessoasSentadas){
                pessoasSentadas++;
            }else{
                pessoasPe++;
            }

            System.out.println("1.Bilhete Normal");
            System.out.println("2.Bilhete de Idoso");
            System.out.println("3.Bilhete de Estudante");
            System.out.println();
            System.out.print("Digite o tipo de bilhete do passageiro:");

            Scanner teclado = new Scanner(System.in);

            boolean continua = true;

            while (continua){
                int tipoBilhete = teclado.nextInt();
                switch (tipoBilhete){
                    case 1:
                        bilheteNormal++;
                        continua = false;
                        break;
                    case 2:
                        bilheteIdoso++;
                        continua = false;
                        break;
                    case 3:
                        bilheteEstudante++;
                        continua = false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("Erro. Escolha uma das op????es.");
                        System.out.println("Digite o tipo de bilhete:");
                        break;

                }
            }

            dentroVeiculo++;
            totalBilhetes++;
        }else {
            System.out.println("O ??nibus est?? cheio.");
        }
    }

    public void sair(){
        if (dentroVeiculo != 0){
            if (pessoasPe > 0){
                pessoasPe --;
            }else {
                pessoasSentadas--;
            }
            dentroVeiculo--;
        }
    }

    public void contarNumerosBilhetes(){
        int bilhetes = getTotalBilhetes();
        System.out.println("Total de passageiros at?? o momento: " + bilhetes);
    }

    public int pedirPraDescer(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pessoas ir??o descer no pr??ximo ponto ?");
        return teclado.nextInt();
    }

    @Override
    public String toString() {
        return "Informa????es:" +
                "\nQuantidade de pontos na viagem: " + qtdPontos +
                "\nPonto atual: " + ponto +
                "\nPassageiros no ??nibus: " + dentroVeiculo +
                "\nCapacidade total do ??nibus: " + capTotal +
                "\nPassageiros sentados ??nibus: "  + pessoasSentadas +
                "\nCapacidade total de pessoas sentadas do ??nibus: "  + capPessoasSentadas +
                "\nPassageiros em p?? ??nibus: " + pessoasPe +
                "\nCapacidade total de pessoas em p?? do ??nibus: " + capPessoasPe +
                "\nPassageiros que usaram bilhete normal: " + bilheteNormal +
                "\nPassageiros que usaram bilhete de idoso: " + bilheteIdoso +
                "\nPassageiros que usaram bilhete de estudante: " + bilheteEstudante +
                "\nTotal de bihetes usados at?? o momento:" + totalBilhetes +
                "\nTotal de voltas do ??nibus: " + voltas
                ;
    }
}
