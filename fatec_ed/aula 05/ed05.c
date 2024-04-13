// 1.O que é uma fila e como funciona:
// Uma fila é uma estrutura de dados linear que segue o princípio FIFO (First In, First Out), o que significa que o primeiro elemento a ser inserido na fila é o primeiro a ser removido. Em termos simples, é como uma fila em um supermercado, onde o primeiro cliente a entrar é o primeiro a ser atendido.
// 2.Situações em que uma fila pode ser utilizada:
// As filas são amplamente utilizadas em situações em que os elementos precisam ser processados na ordem em que foram adicionados. Alguns exemplos incluem:
// Processamento de solicitações em um sistema de gerenciamento de recursos compartilhados, como impressoras ou CPUs.
// Implementação de filas de espera em sistemas de atendimento ao cliente, onde as solicitações são atendidas em ordem de chegada.
// Tarefas de processamento em lote, onde os itens precisam ser processados sequencialmente, sem paralelismo.
// Implementação de buffers em comunicações de rede, onde os pacotes de dados são tratados na ordem em que foram recebidos.


#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct u{
    int ag;
    int conta;
    char nome[40];
    float saldo;
    struct u* prox;
} usuario;

typedef struct f{
  usuario* primeiro;  
} fila;

void colocar(fila *f){
    usuario *novo = (usuario*)malloc(sizeof(usuario));
    printf("\nAdicionando um novo cliente na fila:");
    printf("\nNome: "); scanf("%s", &novo->nome);
    printf("Agencia: "); scanf("%d", &novo->ag);
    printf("Conta: "); scanf("%d", &novo->conta);
    printf("Saldo: "); scanf("%f", &novo->saldo);
    novo->prox=NULL;

    if (f->primeiro == NULL){
        f->primeiro = novo;
    }else{
        usuario *aux = f->primeiro;
        while(aux->prox!=NULL){
            aux = aux->prox;
        };
        aux->prox = novo;
    }
    printf("\nCliente addicionado!\n\n");
};

void listar(fila *f){
    if(f->primeiro==NULL){
        printf("\nNAO EXISTEM CLIENTES NA FILA! (AMEM)");
    }else{
        usuario *aux = f->primeiro;
        do{
            printf("\n%s da agencia %d e conta %d. Saldo:%.2f", aux->nome, aux->ag, aux->conta, aux->saldo);
            aux = aux->prox;
        }while(aux!=NULL);
    }
}

void remover(fila *f){
    if (f->primeiro==NULL){
        printf("\nNao ha o que remover!");
    } else {
        usuario *aux = f->primeiro;
        printf("\nEliminando o %s da fila", f->primeiro->nome);
        f->primeiro = f->primeiro->prox;
        free(aux);
    }
    
}

void filaVazia(fila *f){
    do{
        usuario *aux = f->primeiro;
        printf("\nEliminando o %s da fila", f->primeiro->nome);
        f->primeiro = f->primeiro->prox;
        free(aux);
    } while(f->primeiro!=NULL);
}

int main(){
    fila *f={NULL};

    colocar(&f);
    colocar(&f);
    colocar(&f);
    listar(&f);
    filaVazia(&f);
    listar(&f);
    return 0;
}