using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
class URI
{
    public static double LogFatorial(int q)
    {
        double logFatorial = 0;
        for (int i = 1; i <= q; i++)
        {
            logFatorial += Math.Log(i);
        }
        return logFatorial;
    }

    public static void Main(string[] args)
    {
        int count = int.Parse(Console.ReadLine());
        int count2 = 1;
        int victp = 0;
        int victl = 0;
        List<string> result = new List<string>();

        while (count != 0)
        {
            string[] l = Console.ReadLine().Split('^');
            string aux = Console.ReadLine();

            // Remove qualquer caractere não numérico da string auxiliar
            string AUX = new string(aux.Where(char.IsDigit).ToArray());

            double value1, value2, logL;
            int P;

            value1 = int.Parse(l[0]);
            value2 = int.Parse(l[1]);

            logL = value2 * Math.Log(value1); // log(LUCAS)
            P = int.Parse(AUX); // PEDRO

            double logP = LogFatorial(P); // log(Pedro)

            if (logL > logP)
            {
                result.Add($"Rodada #{count2}: Lucas foi o vencedor");
                victl++;
            }
            else if (logP > logL)
            {
                result.Add($"Rodada #{count2}: Pedro foi o vencedor");
                victp++;
            }
            count2++;
            count--;
        }

        if (victp == victl)
        {
            Console.WriteLine("A competicao terminou empatada!");
        }
        else if (victp > victl)
        {
            Console.WriteLine("Campeao: Pedro!");
        }
        else
        {
            Console.WriteLine("Campeao: Lucas!");
        }

        foreach (string i in result)
        {
            Console.WriteLine(i);
        }
    }
}
