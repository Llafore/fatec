/*
Bubble Sort
    Funcionamento:

    O Bubble Sort é um algoritmo de ordenação simples que funciona repetidamente passando pela lista a ser ordenada, 
comparando cada par de elementos adjacentes e trocando-os se estiverem na ordem errada.
    Este processo é repetido até que a lista esteja ordenada.

Insertion Sort
    Funcionamento:

    O Insertion Sort é um algoritmo de ordenação que constrói a lista final ordenada um item de cada vez. Ele é muito 
eficiente para listas pequenas e principalmente quase ordenadas.
    A cada iteração, o algoritmo remove um elemento da entrada, encontra o local que ele pertence na lista ordenada
e insere-o lá. Ele repete até que não haja mais elementos de entrada.
*/
#include <stdio.h>
#include <conio.h>

void insertionSort(int *v, int tamanho){
    int aux,i,j=1;
    while(j < tamanho){
        aux=v[j];
        i=j-1;
        while((i>=0)&&(v[i]>aux)){
            v[i+1] = v[i];
            i-=1;
        }
        v[i+1]=aux;
        j+=1;
    }
}

int main(){
    int t[] = {3,7,8,2,1,9,23,6,12,8,4,1};
	int tamanho = sizeof(t)/sizeof(int);
	insertionSort(&t, tamanho);
	int x =0;
	for(x=0; x<tamanho; x++){
	   printf("%i\n", t[x]);    
	}
	getch(); 
    return 0;
}