using System;
using System.Globalization;
class URI{
    public static void Main(string[] args){
        string[] entrada=Console.ReadLine().Split(' ');
        if (entrada.Length>2){
            return;
        }
        double f1=Convert.ToDouble(entrada[0],CultureInfo.InvariantCulture);
        double f2=Convert.ToDouble(entrada[1],CultureInfo.InvariantCulture);
        double variacao=((1+f1/100)*(1+f2/100)-1)*100;
        Console.WriteLine(variacao.ToString("N6"));

    }
}