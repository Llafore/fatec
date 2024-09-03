#include <stdio.h>
#include <stdlib.h>


typedef struct _no {
   int info;
   struct _no *esq;
   struct _no *dir;
} no;


typedef struct {
  no *raiz;     
} Arvore;


no* inserir (no *n, int v){
    if(n == NULL){
        n=(no*)malloc(sizeof(no));
        n->info = v;
        n->esq = NULL;
        n->dir = NULL;
        printf("\n Elemento inserido com sucesso %i \n", v);
    }
    else if(v < n->info){
        printf("<-");
        n->esq = inserir(n->esq,v);
    }
    else{
         printf("->");
        n->dir = inserir(n->dir,v);
    }
    return n;
}


int buscar (no *n, int v){
    if(n==NULL){
        printf("NAO ACHOU \n");
        return 0;
    }
    else if(v < n->info){
        printf("<-");
        return buscar(n->esq,v);
    }
    else if(v > n->info){
        printf("->");
        return buscar(n->dir,v);
    }
    else{
        printf("ACHEI %x \n", n);
        return 1;
    }
}


no* cria_arv_vazia() {
   return NULL;
}

int main () {

Arvore *a = cria_arv_vazia ();

a=inserir(a, 50);
a=inserir(a, 30);
a=inserir(a, 90);
a=inserir(a, 20);
a=inserir(a, 40);
a=inserir(a, 95);
a=inserir(a, 10);
a=inserir(a, 10);
a=inserir(a, 35);
a=inserir(a, 45);

buscar(a, 40);
buscar(a, 1240);
buscar(a, -1240);


return 0;


}