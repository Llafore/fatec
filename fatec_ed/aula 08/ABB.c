/*
1- O que e uma arvore binaria e quais seus componentes?
No :

E a unidade basica da arvore. Cada nó contém:
Valor/Dado (Data): A informação armazenada no nó.
Referência ao filho esquerdo (Left Child): Um ponteiro ou referência ao nó filho à esquerda.
Referência ao filho direito (Right Child): Um ponteiro ou referência ao nó filho à direita.
Raiz (Root):

É o nó superior da árvore. Não tem pai (parent). Todos os outros nós descendem dele.
Folhas (Leaves):

Nós que não têm filhos. Eles são os nós terminais da árvore.
Filhos (Children):

Nós que são descendentes diretos de um nó específico. Um nó pode ter até dois filhos em uma árvore binária.
Pai (Parent):

O nó que tem uma referência direta para outros nós (filhos).
Subárvore (Subtree):

Qualquer nó em uma árvore binária pode ser considerado a raiz de uma subárvore que contém todos os seus descendentes.
Altura (Height):

O comprimento do caminho mais longo da raiz até uma folha.
Nível (Level):

A distância de um nó à raiz. A raiz está no nível 0, seus filhos estão no nível 1, e assim por diante.
Profundidade (Depth):

A distância da raiz até um nó específico. Em outras palavras, a profundidade de um nó é o nível em que ele se encontra.

2-Qual a diferenca entre uma AB e uma ABB ?

Para cada nó, todos os valores nos nós da subárvore à esquerda são menores ou iguais ao valor do nó, e todos os valores nos nós da subárvore à direita são maiores ou iguais ao valor do nó.
*/
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


/*Cria um no em uma arvore!*/
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

int buscar(no *n, int v, int nivel) {
    if (n == NULL) {
        printf("NAO ACHOU \n");
        return -1; // Retorna -1 para indicar que o valor não foi encontrado
    } else if (v < n->info) {
        printf("<-");
        return buscar(n->esq, v, nivel + 1);
    } else if (v > n->info) {
        printf("->");
        return buscar(n->dir, v, nivel + 1);
    } else {
        printf("ACHEI %x no nivel %d\n", n, nivel);
        return nivel;
    }
}

/*Cria uma arvore vazia!*/
/*Cria uma arvore vazia!*/
/*Cria uma arvore vazia!*/
no* cria_arv_vazia() {
   return NULL;
}


int main() {

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

buscar(&a, 40, 0);
buscar(&a, 1240, 0);
buscar(&a, -1240, 0);


return 0;


}