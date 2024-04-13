#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct container{
    int id;
    float peso;
    struct container* proximo;
} Container;

typedef struct navio{
    Container* naFrente;
} Navio;

void coloca(Navio *navio){
    printf("\nAdicionando novo Container!");
    Container *noGancho = (Container*)(malloc(sizeof(Container)));
    printf("\nid: "); scanf("%i",&noGancho->id);
    printf("\npeso: "); scanf("%i",&noGancho->peso);
    noGancho->proximo = NULL;
    if(navio->naFrente==NULL){
        navio->naFrente = noGancho;
    } else {
        noGancho->proximo = navio->naFrente; 
        navio->naFrente = noGancho;
    }
    printf("\nO container %i foi adicionado no endereco %x\n\n", navio->naFrente->id, navio->naFrente);
}

void tira(Navio *navio){
    if(navio->naFrente==NULL){
        printf("TA MOSCANO JAO? !");
    } else {
        Container *removendo = navio->naFrente;
        printf("Removendo o container %i do endereco %x", removendo->id, navio->naFrente);
        navio->naFrente = navio->naFrente->proximo;
        free(removendo);
    }
};

int main(){
    Navio navio;

    coloca(&navio);
    coloca(&navio);
    tira(&navio);
    printf("Deu ruim?");
    tira(&navio);
    printf("Deu ruim?");
    tira(&navio);

    return 0;
}