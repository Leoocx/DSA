#include <stdio.h>
int Fibonacci(int n){
     if (n==0)
        return 0;
     if (n==1)
        return 1;
     return Fibonacci(n-1)+Fibonacci(n-2);
}
int main(){
  int num;
  printf("NÚMERO: ");
  scanf("%d",&num);
  if (num<0)
    printf("ENTRADA INVÁLIDA"); 
  else
    printf("RESULTADO: %i", Fibonacci(num));  
  return 0;   
}
