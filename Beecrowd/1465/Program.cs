using System;
using System.Numerics;

class URI{
    public static void Main(string[] args){
        int count=int.Parse(Console.ReadLine());
        while (count!=0){
            string[] entrada=Console.ReadLine().Split(' ');
            long x=long.Parse(entrada[0]);
            long y=long.Parse(entrada[1]);
            if (x>10000 || x<-10000 || y>10000 || y<-10000){
                break;
            }
            int aux=1;
            double tolerancia=1e-6;
            
            while (true){
                Complex complexo = new Complex(x,y);
                Complex k = Complex.Pow(complexo,aux);
                if (Math.Abs(k.Real)>Math.Pow(2,30)){
                    Console.WriteLine("TOO COMPLICATED");
                    break;
                }
                if (Math.Abs(k.Imaginary) < tolerancia){
                    Console.WriteLine(aux);
                    break;
                }                
                aux++;
                     
            }
            count--;
        }
    }
}