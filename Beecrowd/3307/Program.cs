using System;
using System.Globalization;

class URI
{
    static void Main(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        double pi = 3.14;

        for (int i = 0; i < N; i++)
        {
            double area = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            double radius = Math.Sqrt(area / (4 * pi));

            string cor;
            double custo;

            if (radius < 12)
            {
                cor = "vermelho";
                custo = area * 0.09;
            }
            else if (radius <= 15)
            {
                cor = "azul";
                custo = area * 0.07;
            }
            else
            {
                cor = "amarelo";
                custo = area * 0.05;
            }

            Console.WriteLine($"{cor} = R$ {custo:F2}");
        }
    }
}
