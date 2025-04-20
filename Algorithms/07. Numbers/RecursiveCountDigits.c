#include <stdio.h>
int contador(int num) {
    if (num < 10 && num > -10) {
        return 1;
    }
    return 1 + contador(num / 10);
}



int main() {
    int numero;
    printf("\n Número: ");
    scanf("%d", &numero);
    printf("O número %d tem %d dígito(s).\n", numero, contador(numero));    
    return 0;
}
