using System;
using System.Collections;
using System.Collections.Generic;
using System.Numerics;


class URI
{
    public static void Main(string[] args)
    {
        string entrada = Console.ReadLine();
        Console.WriteLine(entrada);
        while (entrada.Length > 1)
        {
            string k = entrada.Substring(0, entrada.Length - 1);
            string m = entrada.Substring(entrada.Length - 1);

            BigInteger x=BigInteger.Parse(k);
            BigInteger y=BigInteger.Parse(m);
            

            BigInteger aux = BigInteger.Parse(entrada);

            aux = x * 3 + y;
            entrada = aux.ToString();
            Console.WriteLine(aux);
        }


    }

}