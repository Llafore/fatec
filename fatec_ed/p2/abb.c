#include <stdio.h>
#include <stdlib.h>


typedef struct _no {
   int info;
   struct _no *l;
   struct _no *r;
} no;


typedef struct {
  no *raiz;     
} Arvore;


no* inserir (no *n, int v){
    if(n == NULL){
        n=(no*)malloc(sizeof(no));
        n->info = v;
        n->l = NULL;
        n->r = NULL;
        printf("\n Numero adicionado!  %i \n", v);
    }
    else if(v < n->info){
        printf("<=");
        n->l = inserir(n->l,v);
    }
    else{
         printf("=>");
        n->r = inserir(n->r,v);
    }
    return n;
}


int buscar (no *n, int v){
    if(n==NULL){
        printf("    Numero nao encontrado\n");
        return 0;
    }
    else if(v < n->info){
        printf("<=");
        return buscar(n->l,v);
    }
    else if(v > n->info){
        printf("=>");
        return buscar(n->r,v);
    }
    else{
        printf("   Numero %x encontrado \n", n->info);
        return 1;
    }
}


no* cria_arv_vazia() {
   return NULL;
}

int main () {

Arvore *a = cria_arv_vazia ();

a=inserir(a, 43);
a=inserir(a, 65);
a=inserir(a, 25);
a=inserir(a, 87);
a=inserir(a, 54);
a=inserir(a, 24);
a=inserir(a, 6);
a=inserir(a, 65);
a=inserir(a, 76);
a=inserir(a, 98);

buscar(a, 54);
buscar(a, 65);
buscar(a, 3213);


return 0;


}