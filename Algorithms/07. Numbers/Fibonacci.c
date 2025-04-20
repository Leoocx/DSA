#include <stdio.h>

long Fibonacci(int n){
    if (n==0) return 0;
    if (n==1) return 1;
    
    long x=0,result=1;

    for (int i=2; i<=n;i++){
        result=result+x; //PROXIMO VALOR
        x=result-x;               // VALOR ANTERIOR
    }
    return result;
}


int main()
{
    long num;
    printf("NÚMERO: ");
    scanf("%ld", &num);
    if (num<0)
        printf("ENTRADA INVÁLIDA");
    else
        printf("RESULTADO: %ld \n", Fibonacci(num));
    return 0;
}
