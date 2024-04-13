#include <stdio.h>
#include <string.h>
// int main(){
//     int y, *p, x;
//     y = 0;
//     p = &y;
//     x = *p;
//     x = 4;

//     ++(*p);
//     x--;
//     (*p) += x++;
//     printf ("y = %d\n", y);


    // int x, y, *p;y = 0;
    // p = &y;
    // x = *p;
    // x = 4;
    // (*p)++;
    // --x;
    // (*p) += x;
    // printf("\n x = %d \n y = %d \n p = %x", x, y, p); // p = endereco de y



//a)
void main() {
    int x, *p;
    x = 100;
    p = &x;
    printf("Valor de p: %d\n", *p);

    // c)
    char a[] = "abacate", b[] = "uva";

    if (strcmp(a, b) < 0) {printf("%s vem antes de %s no dicionario", a, b);}
    else{printf("%s vem depois de %s no dicionario", a, b);}

}
// b)
void troca(int *i, int *j){
    int temp;
    temp = *i;
    *i = *j;
    *j = temp;
}


