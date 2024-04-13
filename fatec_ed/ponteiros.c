#include <stdio.h>

int main(){
    int var = 15;
    int *prt;
    prt = &var;

    printf("\n O valor da variavel    = %d", var);
    printf("\n O endereco da variavel = %p", &var);
    printf("\n O conteudo apontado pelo ponteiro = %d", *prt);
    printf("\n O valor do ponteiro               = %p",  prt);
    printf("\n O endereco do ponteiro            = %p", &prt);

    *prt += 1;
    
    printf("\n O valor da variavel    = %d", var);
    printf("\n O endereco da variavel = %p", &var);
    printf("\n O conteudo apontado pelo ponteiro = %d", *prt);
    printf("\n O valor do ponteiro               = %p",  prt);
    printf("\n O endereco do ponteiro            = %p", &prt);

    // Ponteiros: 
    // *prt => valor da variavél em que o ponteiro está apontado
    //  prt => valor do endereço em que o ponteiro está apontado
    // &prt => valor do endereço em que está sendo armazenado a informação
    return 0;
};

