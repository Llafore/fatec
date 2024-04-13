#include <stdio.h> 
#include <stdlib.h>

typedef struct caixa{
    int id;
    float peso;
    struct caixa* next;
} Caixa;

typedef struct pilha{
    Caixa* top;
    int qtde_caixas;
} Pilha;

void push(Pilha *p){
    Caixa *new = (Caixa*)(malloc(sizeof(Caixa)));
    printf("Adicionando nova caixa: "); 
    printf("\nID :"); scanf("%d", &new->id);
    printf("\nPeso: "); scanf("%f",&new->peso);   
    new->next = NULL;
    if(p->top == NULL){
        p->top =  new;
    }else{
        new->next = p->top;
        p->top = new;
    }
    p->qtde_caixas++;
    printf("Caixa %i de %.2fkg's adicionada com sucesso!",new->id,new->peso);
}

void pop(Pilha *p){
    if (p->top == NULL){
        printf("\n\nNão há o que remover!");
    } else {
        printf("\n\nRemovendo a caixa %i, limpando endereco %x\n\n\n", p->top->id, p->top);
        Caixa *aux = p->top;
        p->top = p->top->next;
        free(aux);
    }
    p->qtde_caixas--;
}




int main(){
    Pilha pilha;
    int command;

    printf("Ola! como posso ajudar?");

    for(command=69;command!=0;command){
        printf("\nDigite 1 para adicionar uma caixa na pilha\nDigite 2 para remover uma caixa da pilha\nDigite 3 para listar as caixas da pilha\nDigite 0 para sair\n");
        // fgets(command, sizeof(command), stdin);
        scanf("%d", &command);
        switch(command){
            case 1:
                push(&pilha);
                break;
            case 2:  
                pop(&pilha);
                break;
            case  0:
                command=0;
                break;
        }
    }
    

    return 0;
}