using System;
using System.Globalization;
class Program
{
    static void Main(string[] args)
    {

        string[] entrada = Console.ReadLine().Split(' ');
        double code1 = Convert.ToDouble(entrada[0], CultureInfo.InvariantCulture);
        double units1 = Convert.ToDouble(entrada[1], CultureInfo.InvariantCulture);
        double price1 = double.Parse(entrada[2], CultureInfo.InvariantCulture);

        string[] entrada2 = Console.ReadLine().Split(' ');
        double code2 = Convert.ToDouble(entrada2[0], CultureInfo.InvariantCulture);
        double units2 = Convert.ToDouble(entrada2[1], CultureInfo.InvariantCulture);
        double price2 = double.Parse(entrada2[2], CultureInfo.InvariantCulture);

        double valorpagar = ((price1 * units1) + (price2 * units2));

        Console.WriteLine($"VALOR A PAGAR: R$ {valorpagar.ToString("F2", CultureInfo.InvariantCulture)}");
        Console.ReadKey();
    }


}