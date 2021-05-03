# OrientacaoObjeto-Onibus
1.	A atividade deve ser em grupos de 2 à 4 integrantes. Deve ser entregue um arquivo zip com a implementação feita para o problema.
	
	
2.	Durante o percurso de um onibus em sua linha existem N pontos, nomeadas de P1 à PN, de forma circular (após chegar em PN ele retoma a rota em P1). Em cada ponto, as pessoas podem subir ou descer do onibus.  o Onibus tem capacidade maxima para X pessoas sentadas mais Y em pé. 
3.	Crie uma classe Onibus para armazenar as informações de ocupação em um onibus. A classe deve armazenar o numero de pessoas dentro do veiculo, quantas entraram com bilhete normal, de idoso e de estudante. Com base no numero de poltronas que ele possui, a classe deve conter também um método para indicar se existem pessoas em pé ou não, e quantas são. A classe deve também disponibilizar os seguintes métodos:
4.	Inicializar: deve instanciar um objeto que permita manipular as informações do onibus. Nesse caso, o onibus tem capacidade maxima para 20 pessoas sentadas mais 40 em pé, e percorre uma linha com pontos 10 pontos.
5.	Entrar: para acrescentar uma pessoa no onibus (só deve acrescentar se ainda houver espaço);
6.	Sair: para remover uma pessoa do onibus (só deve remover se houver alguém dentro dele);
7.	ContarTipoBilhetes: armazenar quantos passageiros usaram o onibus com base nos bilhetes usados
8.	Pedirpara descer: informa que existe um passageiro quer descer no proximo ponto
9.	Numero de viagens: quantas voltas o onibus já realizou entre os pontos P1 e PN.
10.	Obs.: Encapsular todos os atributos da classe (criar os métodos set e get). Precisa também de um programa mostrando o funcionamento da classe.
11.	Lembre-se! O onibus percorre a linha, então a rotina de teste da classe deve também considerar a viagem, podendo disponibilizar os dados a cada chegada no ponto final.
