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

    public Onibus(int capPessoasPe, int capPessoasSentadas, int qtdPontos) {
        this.capPessoasPe = capPessoasPe;
        this.capPessoasSentadas = capPessoasSentadas;
        this.qtdPontos = qtdPontos;
        capTotal = capPessoasPe + capPessoasSentadas;
        dentroVeiculo = 0;
        bilheteNormal = 0;
        bilheteEstudante = 0;
        bilheteIdoso = 0;
        pessoasPe = 0;
        pessoasSentadas = 0;
    }

    private boolean estaCheio(){
        return capTotal == pessoasPe + pessoasSentadas;
    }

    private void Entrar(){
        if(!estaCheio()){
            if(pessoasSentadas != capPessoasSentadas){
                pessoasSentadas++;
            }else{
                pessoasPe++;
            }
            dentroVeiculo++;
        }
    }

    private  void Sair(){
        if (dentroVeiculo != 0){
            if (pessoasPe > 0){
                pessoasPe --;
            }else {
                pessoasSentadas--;
            }
            dentroVeiculo--;
        }
    }

}
