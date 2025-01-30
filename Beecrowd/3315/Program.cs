using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    public static string Bin(int q)
    {
        if (q == 0)
            return "0";

        string result = "";
        while (q != 0)
        {
            int r = q % 2;
            string s = Convert.ToString(r);
            result = s + result;
            q = q / 2;
        }
        return result;
    }

    public static void Main(string[] args)
    {
        int linhas = 4;
        List<int> result = new List<int>();
        while (linhas != 0)
        {
            string[] entrada = Console.ReadLine().Split(' ');
            int x = int.Parse(entrada[0]);
            int y = int.Parse(entrada[1]);
            int z = int.Parse(entrada[2]);
            int k = int.Parse(entrada[3]);
            int l = int.Parse(entrada[4]);
            int a = int.Parse(entrada[5]);
            int f = int.Parse(entrada[6]);
            int soma = (x + y + z + k + l + a + f);
            result.Add(soma);
            linhas--;
        }
        int r = result.Max();
        Console.WriteLine($"{r} = {Bin(r)}");
    }
}
