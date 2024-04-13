#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numeroConta;
    char nomeCliente[10];
    float saldo;
} ContaCorrente;

void mostraConta(ContaCorrente *p ,int Conta){
    int numeroCC = p[Conta - 1].numeroConta;
    char *nomeCC = p[Conta - 1].nomeCliente;
    float saldoCC = p[Conta - 1].saldo;
    printf("Numero da conta: %d\n",numeroCC);
    printf("Nome do cliente: %s\n",nomeCC);
    printf("Saldo em conta : %.2f\n",saldoCC);
}

void limpaCMD(){
    system("cls");
}

void limpaBuffer(){ //limpa o buffer para evitar que o caractere seja lido na proxima linha (peguei isso na internet, anotei para que daqui um tempo eu saiba o que é)
    while (getchar() != '\n');
}

int main(){
    limpaCMD();
    ContaCorrente *p; 
    int i, qtdContas, operacao, contaConsulta;

    printf("Informe a quantidade de contas a cadastrar: ");
    scanf(" %d", &qtdContas);

    limpaBuffer();

    p = (ContaCorrente *) malloc(qtdContas * sizeof(ContaCorrente));

    for(i=0;i < qtdContas;i++){
        p[i].numeroConta = i+1;
        printf("Nome do cliente %d: ", i+1);
        scanf(" %s", &p[i].nomeCliente);
        limpaBuffer();       
        printf("Saldo desse cliente: R$");
        scanf(" %f", &p[i].saldo);
        limpaBuffer();
        printf("\n\n");
    }

    limpaCMD();

    while(1) {
        printf("\nMenu:\n");
        printf("Ola! Como posso ajudar? \nDigite 0 para sair \nDigite 1 para acessar os dados da conta corrente\n   ");
        scanf(" %d",&operacao);
        limpaBuffer();
        
        if(operacao == 1){
            limpaCMD();
            printf("Digite o numero da conta a ser consultada: ");
            scanf(" %d", &contaConsulta);
            limpaBuffer();
            mostraConta(p,contaConsulta);
            printf("Pressione enter para continuar");
            scanf("");
            limpaBuffer();
            limpaCMD();
        } else if (operacao == 0){
            break;
        }
    } 
    free(p);
    return 0;
}