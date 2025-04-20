#include <stdio.h>


int soma(int num) {
    int soma = 0;
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            soma += i;
        }
    }
    return soma;
}

int main() {
    int n1, n2;
    
 
    printf("DIGITE 2 NUMEROS INTEIROS: ");
    scanf("%d %d", &n1, &n2);
    
    
    if (soma(n1) == n2 && soma(n2) == n1) {
        printf("%d E %d SÃO NÚMEROS AMIGOS.\n", n1, n2);
    } else {
        printf("%d E %d SÃO NÚMEROS INIMIGOS.\n", n1, n2);
    }
    
    return 0;
}
