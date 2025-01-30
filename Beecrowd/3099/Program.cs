using System.Collections.Generic;
using System.Linq;
class Program
{
    public static void Main(string[] args)
    {

        string entrada = Console.ReadLine();
        int valor = Convert.ToInt32(entrada);
        int SomaTotal = 0;

        for (int i = 0; i <= valor; i++)
        {
            string l = i.ToString();
            int count7 = l.Count(c => c == '7');
            int count1 = l.Count(c => c == '1');
            SomaTotal += count7 + count1;
        }
        Console.WriteLine(SomaTotal);
    }

}
