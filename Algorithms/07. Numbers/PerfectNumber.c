#include <stdio.h>
#include <math.h>
#include <stdbool.h>
//REFERÊNCIA: 
//https://seara.ufc.br/pt/producoes/nossas-producoes-e-colaboracoes/secoes-especiais-de-ciencia-e-tecnologia/secoes-especiais-matematica/numeros-perfeitos/


bool Primo(int n){
     if (n<= 1)
           return false;

       if (n<= 3)
           return true;

       if (n% 2 == 0 || n % 3 == 0)
           return false;

       int i = 5;
       while (i * i <= n)
       {
           if (n % i == 0 || n% (i + 2) == 0)
               return false;
           i += 6;
       }
       return true;
}


bool numPerfeito(int x) {
    for (int n = 2; n <= x; n++) {
        if (Primo(n)) { 
            long long mersenne = (long long)(pow(2,n)) - 1; // 2^n - 1
            if (Primo(mersenne)) { // Se 2^n - 1 for primo, então é de Mersenne
                long long nPerfeito = (long long)(pow(2, n-1)) * mersenne; // 2^(n-1) * (2^n - 1)
                if(nPerfeito==x){
                    return true;
                }
            }
        }
    }
    return false;
}



int main() {
    int x;
    
    printf("NÚMERO: ");
    scanf("%d", &x);
    
    if (x < 1) {
        printf("ENTRADA INVÁLIDA");
        return 1;
    }
    
    if (numPerfeito(x)) {
       printf("%d É UM NÚMERO PERFEITO\n", x);
    } else {
        printf("%d NÃO É UM NÚMERO PERFEITO.\n", x);
    }
    
    return 0;
}
