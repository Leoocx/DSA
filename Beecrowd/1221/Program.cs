using System.Collections.Generic;
using System;
class Program
{
    static void Main(string[] args)
    {
        int count = Convert.ToInt32(Console.ReadLine());
        List<string> result = new List<string>();

        while (count != 0)
        {
            int entrada = Convert.ToInt32(Console.ReadLine());
            if (IsPrime(entrada))
            {
                result.Add("Prime");
                count--;
            }
            else
            {
                result.Add("Not Prime");
                count--;
            };

        }
        foreach (string i in result)
        {
            Console.WriteLine(i);
        }
    }
    static bool IsPrime(int numero)
    {
        if (numero <= 1)
            return false;

        if (numero <= 3)
            return true;

        if (numero % 2 == 0 || numero % 3 == 0)
            return false;

        int i = 5;
        while (i * i <= numero)
        {
            if (numero % i == 0 || numero % (i + 2) == 0)
                return false;
            i += 6;
        }

        return true;
    }
}
