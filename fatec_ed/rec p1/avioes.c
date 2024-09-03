#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct a{
    int id;
    char nome[30];
    struct a* prox;
} aviao;

typedef struct p{
    struct a* decolando;
} pista;

// c) Adicionar um avião à fila de espera;
void adicionar(pista *p){
    printf("\n\n///////Um aviao esta chegando///////");
    aviao *chegando = (aviao*)malloc(sizeof(aviao));
    printf("\nInsira o ID do aviao: "); scanf("%d", &chegando->id);
    printf("\nInsira o nome do aviao: "); scanf("%s", &chegando->nome);
    chegando->prox = NULL;
    if(p->decolando == NULL){
        p->decolando = chegando;
    }else{
        aviao *aux = p->decolando;
        while (aux->prox != NULL){
            aux = aux->prox;
        }
        aux->prox = chegando;     
    }
    printf("\nO aviao foi adicionado no endereco %x", chegando);
}
// b) Autorizar a decolagem do primeiro avião da fila;
void decolar(pista *p){
    printf("\n\n///////Iniciando decolagem...///////");
    if(p->decolando == NULL){
        printf("\nPISTA VAZIA!");
    }else{
        aviao *aux = p->decolando;
        p->decolando = p->decolando->prox;
        printf("\nO aviao %s do endereco %x, decolou", aux->nome, aux);
        free(aux);
    }
}

// e) Listar as características do primeiro avião da fila.
void listarPrimeiro(pista *p){
    if(p->decolando == NULL){
        printf("\nPISTA VAZIA!");
    }else{
        printf("\nPrimeiro da fila: \nnome: %s\nid: %d\nendereco: %x", p->decolando->nome, p->decolando->id, p->decolando);
    }
}

// a) Listar o número de aviões aguardando na fila de decolagem;
void qtdeLista(pista *p){
    if(p->decolando==NULL){
        printf("\n\nPISTA VAZIA!");
    }else{
        int qtde = 1;
        aviao *aux = p->decolando;
        while(aux->prox != NULL){
            aux = aux->prox;
            qtde++;
        }
            printf("\n\nExistem %d avioes na pista", qtde);
    }
}

// d) Listar todos os aviões na fila de espera;
void listar(pista *p){
    if(p->decolando==NULL){
        printf("\nPISTA VAZIA!");
    }else{
        aviao *aux = p->decolando;
        while(aux!= NULL){
            printf("\n\n\nnome: %s\nid: %d\nendereco: %x", aux->nome, aux->id, aux);
            aux = aux->prox;
        };
    }
}

int main() {
    pista *p = {NULL};

    adicionar(&p);
    adicionar(&p);
    adicionar(&p);
    decolar(&p);
    adicionar(&p);
    qtdeLista(&p);
    listarPrimeiro(&p);
    listar(&p);
    return 0;
}