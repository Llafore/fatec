#include <stdio.h>
#include <stdlib.h>

typedef struct itm{
    int codigo;    
    struct itm *proximo;
} Item;

typedef struct lst {
    Item *primeiro;
    Item *ultimo;
} Lista;

void adicionarInicio(Lista *l){
    Item *novo = (Item*)malloc(sizeof(Item));
    printf("\nInforme um numero:");
    scanf("%i", &novo->codigo);
    novo->proximo = NULL;
    
    if(l->primeiro==NULL){
        l->primeiro = novo;    
        l->ultimo = novo;
    }
    else {
        Item *aux = l->primeiro;
        novo->proximo = aux;
        l->primeiro = novo;
    }
    printf("\nAdicionado no inicio da lista %x", novo);
}

void adicionarFim(Lista *l){
    Item *novo = (Item*)malloc(sizeof(Item));
    printf("\nInforme um numero:");
    scanf("%i", &novo->codigo);
    novo->proximo = NULL;
    if(l->primeiro==NULL){
        l->primeiro = novo;    
        l->ultimo = novo;
    } else {
        Item *aux = l->ultimo;
        aux->proximo = novo;
        l->ultimo = novo;
    }
    printf("\nAdicionado no fim da lista %x", novo);
}


void listar(Lista *l){
    if(l->primeiro==NULL){
        printf("\nLISTA VAZIA !!!!!!!!!!!");    
    }else {
        Item *aux = l->primeiro;
        do{
            printf("\nItem=%i %x", aux->codigo, aux);
            aux = aux->proximo;
        } while(aux != NULL);
    }
}

void removerInicio(Lista *l){
    if(l->primeiro==NULL){
        printf("\nLISTA VAZIA !!!!!!!!!!!");    
    } else {
        Item *aux = l->primeiro;
        l->primeiro = aux->proximo;
        free(aux);
        printf("\nRegistro removido do inicio da lista !!!!");
    }
}


void removerFim(Lista *l){
    if(l->primeiro==NULL){
        printf("\nLISTA VAZIA !!!!!!!!!!!");    
    } else {
        Item *aux = l->primeiro;
        while(aux->proximo != l->ultimo){
            aux = aux->proximo;    
        }
        l->ultimo = aux;
        free(aux->proximo);
        aux->proximo = NULL;
        printf("\nRegistro removido do fim da lista !!!!");
    }
}




void removerItem(Lista *l, int pesquisa){
    if(l->primeiro==NULL){
        printf("\nLISTA VAZIA !!!!!!!!!!!");    
    } else {
        Item *atual    = l->primeiro;
        Item *anterior = l->primeiro;
        
        while(atual != NULL){
            if(atual->codigo==pesquisa){
                if(anterior!=NULL)    anterior->proximo = atual->proximo;    
                if(atual==l->primeiro) l->primeiro = atual->proximo;
                if(atual==l->ultimo)   l->ultimo = anterior;
                free(atual);
                printf("\nItem especifico removido da lista !!!!");
                break;   
            }
            anterior= atual;
            atual = atual->proximo;
        }
    }
}



int main()
{
    Lista novaLista = {NULL, NULL};
    adicionarInicio(&novaLista);
    adicionarInicio(&novaLista);
    adicionarFim(&novaLista);
    listar(&novaLista);
    removerInicio(&novaLista);
    removerFim(&novaLista);
    adicionarFim(&novaLista);
    adicionarFim(&novaLista);
    removerItem(&novaLista, 6);
    listar(&novaLista);
    return 0;
}
