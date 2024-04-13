#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct c {
    char placa[8];
    char modelo[100];
    struct c* proximo;
} Carro;

typedef struct p{
    Carro* atual;
} Pedagio;

int vazio(Pedagio *p){
    if(p->atual==NULL){
        return 1;
    } else{
        return 0;
    }
}

void chegou(Pedagio *p){
    printf("\n\n\nUm carro chegou!");
    Carro *chegando = (Carro*)(malloc(sizeof(Carro)));
    printf("\nPlaca: "); scanf("%s",&chegando->placa);
    printf("Modelo: "); scanf("%s",&chegando->modelo);
    chegando->proximo=NULL;
    if(vazio(p)){
        p->atual = chegando;
    } else {
        Carro *aux = p->atual;
        while(aux->proximo!=NULL){
            aux = aux->proximo;
        };
        aux->proximo = chegando;
    }
    printf("O %s foi adicionado no endereco %x",chegando->modelo,chegando);
}

void atendido(Pedagio *p){
    if(vazio(p)){
        printf("Nao ha clientes (amem!)");
    } else {
        Carro *aux = p->atual;
        printf("\n\nRemovendo o %s do endereco %x",aux->modelo,aux);
        p->atual = p->atual->proximo;
        free(aux);
    }
}

int main(){
    Pedagio *p = {NULL};
    chegou(&p);
    chegou(&p);
    atendido(&p);
    atendido(&p);
    atendido(&p);
    return 0;
}