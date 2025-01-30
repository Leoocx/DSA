using System;
class URI{
    public static void Main(string[] args){
        int aux=int.Parse(Console.ReadLine());
        if (aux>20 || aux<0){
            return;
        }
        Console.WriteLine(Math.Pow(3,aux));

    }
}