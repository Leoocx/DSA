#include <stdio.h>


void Fatorial(int n){
  double result=1;
  for (int i=1; i<=n; i++){
     result*=i;
  }
  printf("%lf \n", result);
}




int main(){
    int numero;
    printf("Numero :");
    scanf("%d",&numero);
    if (numero<0)
        printf("ENTRADA INVÁLIDA");
    else
        Fatorial(numero);
  return 0;   
}
