#include <stdio.h>
#include <stdlib.h>

typedef struct Paciente {
    char documento[11];
    char nome[40];
    char genero[1];
    int idade;
} *pc;

typedef struct Consulta {
    pc paciente;
    struct Consulta *ant;
    struct Consulta *prox;
} *cl;

typedef struct {
    cl inicio;
    cl fim;
} Consultas;

pc inserirPaciente() {
    pc novo = (pc)malloc(sizeof(struct Paciente));
    printf("Insira o documento: "); scanf("%10s", novo->documento);
    printf("Insira o nome: "); scanf(" %39[^\n]", novo->nome);
    printf("Insira o genero (M ou H): "); scanf(" %1s", novo->genero);
    printf("Insira a idade: "); scanf("%d", &novo->idade);
    return novo;
}

cl inserirConsulta(pc paciente) {
    cl novaConsulta = (cl)malloc(sizeof(struct Consulta));
    novaConsulta->paciente = paciente;
    novaConsulta->ant = NULL;
    novaConsulta->prox = NULL;
    return novaConsulta;
}

void inserirInicio(Consultas *lista, cl novaConsulta) {
    if (lista->inicio == NULL) {
        lista->inicio = novaConsulta;
        lista->fim = novaConsulta;
    } else {
        novaConsulta->prox = lista->inicio;
        lista->inicio->ant = novaConsulta;
        lista->inicio = novaConsulta;
    }
}

void inserirFim(Consultas *lista, cl novaConsulta) {
    if (lista->fim == NULL) {
        lista->inicio = novaConsulta;
        lista->fim = novaConsulta;
    } else {
        novaConsulta->ant = lista->fim;
        lista->fim->prox = novaConsulta;
        lista->fim = novaConsulta;
    }
}

void inserirMeio(Consultas *lista, cl novaConsulta, int pos) {
    if (pos == 0 || lista->inicio == NULL) {
        inserirInicio(lista, novaConsulta);
        return;
    }
    
    cl atual = lista->inicio;
    for (int i = 0; i < pos - 1 && atual->prox != NULL; i++) {
        atual = atual->prox;
    }
    
    novaConsulta->prox = atual->prox;
    novaConsulta->ant = atual;
    
    if (atual->prox != NULL) {
        atual->prox->ant = novaConsulta;
    } else {
        lista->fim = novaConsulta;
    }
    
    atual->prox = novaConsulta;
}

void removerInicio(Consultas *lista) {
    if (lista->inicio == NULL) {
        printf("Lista vazia!\n");
        return;
    }
    
    cl temp = lista->inicio;
    lista->inicio = lista->inicio->prox;
    
    if (lista->inicio != NULL) {
        lista->inicio->ant = NULL;
    } else {
        lista->fim = NULL;
    }
    
    free(temp);
    printf("Removido do inicio!\n");
}

void removerFim(Consultas *lista) {
    if (lista->fim == NULL) {
        printf("Lista vazia!\n");
        return;
    }
    
    cl temp = lista->fim;
    lista->fim = lista->fim->ant;
    
    if (lista->fim != NULL) {
        lista->fim->prox = NULL;
    } else {
        lista->inicio = NULL;
    }
    
    free(temp);
    printf("Removido do fim!\n");
}

void listar(Consultas *lista) {
    if (lista->inicio == NULL) {
        printf("Lista vazia!\n");
        return;
    }
    
    cl atual = lista->inicio;
    while (atual != NULL) {
        printf("Paciente: %s, Nome: %s, Genero: %s, Idade: %d\n",
                atual->paciente->documento, atual->paciente->nome,
                atual->paciente->genero, atual->paciente->idade);
        atual = atual->prox;
    }
}

int main() {
    Consultas lista = {NULL, NULL};
    pc paciente1 = inserirPaciente();
    cl consulta1 = inserirConsulta(paciente1);
    
    inserirInicio(&lista, consulta1);
    
    pc paciente2 = inserirPaciente();
    cl consulta2 = inserirConsulta(paciente2);
    
    inserirFim(&lista, consulta2);
    
    pc paciente3 = inserirPaciente();
    cl consulta3 = inserirConsulta(paciente3);
    
    inserirMeio(&lista, consulta3, 1);
    
    listar(&lista);
    
    removerInicio(&lista);
    listar(&lista);
    
    removerFim(&lista);
    listar(&lista);
    
    return 0;
}
