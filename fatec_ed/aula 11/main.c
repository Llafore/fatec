/******************************************************************************
Selection Sort:

O Selection Sort é um algoritmo de ordenação simples que divide a lista em duas partes: 
a parte ordenada na esquerda e a parte não ordenada na direita. O algoritmo procura o menor 
(ou maior) elemento na parte não ordenada e o troca com o primeiro elemento da parte não 
ordenada, expandindo a parte ordenada e reduzindo a parte não ordenada até que toda a lista 
esteja ordenada.

Algoritmo Quick Sort:

O Quick Sort é um algoritmo de ordenação eficiente que usa a estratégia de dividir e conquistar. 
Ele funciona da seguinte forma:

Escolha um elemento como pivô.
Particione a lista em duas sublistas: uma contendo elementos menores que o pivô e outra contendo
 elementos maiores.
Recursivamente aplique a mesma estratégia às duas sublistas.
*******************************************************************************/
#include <stdio.h>
#include <conio.h>

void selection_sort(int *v, int tamanho) {
    int i, j, min, aux;
        for (i=0;i<(tamanho-1);i++) {
            min = i;
            for (j=(i+1); j<tamanho;j++) {
                if(v[j] < v[min]) min =j;
            }
            if (v[i] != v[min]) {
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
}

int main(void) {
	 int t[] = {3,7,64,25,12,22,11,8,4,1};
	 int tamanho = sizeof(t)/sizeof(int);
	  selection_sort(t, tamanho);
	 int x =0;
	 for(x=0; x<tamanho; x++){
	    printf("%i\n", t[x]);    
	 }
	 getch(); 
}



