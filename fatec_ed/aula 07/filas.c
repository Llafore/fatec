#include <stdio.h>
#include <stdlib.h>

typedef struct unidade{
    int max;
    int min;
    struct unidade* proximo;
} Unidade;

typedef struct fila{
    struct unidade* primeiro;
} Fila;

void inserirInicio(Fila *f){
    printf("\n\n------Inserindo Item no Inicio------");
    Unidade *inicializado = (Unidade*)(malloc(sizeof(Unidade)));
    printf("\nMinimo: "); scanf("%i", &inicializado->min);
    printf("\nMaximo: "); scanf("%i", &inicializado->max);
    inicializado->proximo = NULL;
    if(f->primeiro==NULL){
        f->primeiro=inicializado;
    }else{
        inicializado->proximo=f->primeiro;
        f->primeiro=inicializado;
    }
}

void inserirMeio(Fila *f, int posicao){
    printf("\n\n----Inserindo Item na Posicao %i----",posicao);
    int i,controle=1;
    Unidade *aux = f->primeiro;
    for(i=0;i++;i!=posicao){
        printf("\n  %i  ",i);
        if(aux==NULL){
            printf("\nPosicao nao encontrada!!!");
            controle=0;
            break;
        }
        aux = aux->proximo;
    }
    if(controle==1){
    Unidade *inicializado = (Unidade*)(malloc(sizeof(Unidade)));
    printf("\nMinimo: "); scanf("%i", &inicializado->min);
    printf("\nMaximo: "); scanf("%i", &inicializado->max);
    inicializado->proximo = aux->proximo;
    aux->proximo = inicializado;
    }
}

void inserirFim(Fila *f){
    printf("\n\n--------Inserindo Item no Fim-------");
    Unidade *inicializado = (Unidade*)(malloc(sizeof(Unidade)));
    printf("\nMinimo: "); scanf("%i", &inicializado->min);
    printf("\nMaximo: "); scanf("%i", &inicializado->max);
    inicializado->proximo = NULL;
    if(f->primeiro==NULL){
        f->primeiro=inicializado;
    }else{
        Unidade *aux = f->primeiro;
        while(aux->proximo!=NULL){
            aux = aux->proximo;
        }
        aux->proximo = inicializado;
    }
}
void removerInicio(Fila *f){
    printf("\n\n------Removendo Item no Inicio------");
    if(f->primeiro==NULL){
        printf("Nao ha o que remover no inicio!");
    }else{
        Unidade *aux = f->primeiro;
        f->primeiro = f->primeiro->proximo;
        free(aux);
    }
}

void removerMeio(Fila *f, int posicao){
    printf("\n\n----Inserindo Item na Posicao %i----",posicao);
    int i,controle=1;
    Unidade *aux = f->primeiro;
    for(i=0;i++;i!=posicao){
        printf("\n  %i  ",i);
        if(aux==NULL){
            printf("\nPosicao nao encontrada!!!");
            controle=0;
            break;
        }
        aux = aux->proximo;
    }
    if(controle==1){
        Unidade *remover = aux->proximo;
        aux->proximo = aux->proximo->proximo;
        free(remover); 
    }
}

void removerFim(Fila *f){
    printf("\n\n--------Removendo Item no Fim-------");
    if(f->primeiro==NULL){
        printf("Nao ha o que remover no inicio!");
    }else{
        Unidade *aux = f->primeiro;
        while(aux->proximo!=NULL){
            aux = aux->proximo;
        }
        free(aux);        
    }
}

void listar(Fila *f){
    if(f->primeiro==NULL){
        printf("\n\n------------Lista Vazia-----------");
    }else{
        printf("\n\n");
        Unidade *aux = f->primeiro;
        while(aux!=NULL){
            printf("\nMinimo: %i || Maximo : %i",aux->min, aux->max);
            aux = aux->proximo;
        }
    }
}

void listarMaiorMenor(Fila *f){
    if(f->primeiro==NULL){
        printf("\n\n------------Lista Vazia-----------");
    }else{
        Unidade *aux = f->primeiro;
        int max = aux->max,min = aux->min;
        while(aux!=NULL){
            if(max<aux->max){
                max = aux->max;
            }
            if(min>aux->min){
                min = aux->min;
            }
            aux = aux->proximo;
        } 
        printf("\n\nO menor valor entre os minimos e: %i \nO maior valor entre os maximos e: %i",min,max);       
    }    
}

int main(){
    Fila fila = {NULL};

    inserirInicio(&fila);
    inserirInicio(&fila);
    inserirInicio(&fila);
    // inserirFim(&fila);
    // inserirMeio(&fila,2);
    // removerInicio(&fila);
    // removerMeio(&fila, 2);
    // removerFim(&fila);
    // listar(&fila);
    listarMaiorMenor(&fila);

    return 0;
}