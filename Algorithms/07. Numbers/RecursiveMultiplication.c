#include <stdio.h>
int multiplicacao(int a, int b) {
    if (b == 0) {
        return 0;
    } else if (b > 0) {
        return a + multiplicacao(a, b - 1);
    } else { 
         return -multiplicacao(a, -b);
    }
}
int main() {
    int n1, n2;
    printf("DIGITE 2 NÚMEROS INTEIROS: ");
    scanf("%d %d", &n1, &n2);
    printf("%d x %d = %d\n", n1, n2, multiplicacao(n1, n2));
    
    return 0;
}
