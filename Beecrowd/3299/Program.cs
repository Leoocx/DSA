using System;
using System.Numerics;
class URI
{
    public static void Main(string[] args)
    {
        BigInteger input = BigInteger.Parse(Console.ReadLine());
        string entrada = Convert.ToString(input);
        if (entrada.Contains("13"))
        {
            Console.WriteLine($"{entrada} es de Mala Suerte");
        }
        else
        {
            Console.WriteLine($"{entrada} NO es de Mala Suerte");
        }

    }
}