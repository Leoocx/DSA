#include <stdio.h>


double Fatorial(int n){
  if (n==0)
     return 1;
  return n * Fatorial(n-1);
}

int main(){
    int num;
    printf("NÚMERO: ");
    scanf("%d",&num);
    if (num<0)
        printf("ENTRADA INVÁLIDA");
    else
        printf("%lf \n", Fatorial(num));
  return 0;   
}
