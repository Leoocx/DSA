using System;
using System.Globalization;

class Program
{
    public static void Main(string[] args)
    {
        while (true)
        {
            double pi = 3.14159;
            double g = 9.80665;

            double h = Convert.ToDouble(Console.ReadLine(), CultureInfo.InvariantCulture);
            string begin_end = Console.ReadLine();
            if (begin_end == null)
            {
                break;
            }
            string[] entrada = begin_end.Split(' ');
            int p1 = Convert.ToInt32(entrada[0]);
            int p2 = Convert.ToInt32(entrada[1]);
            int count = Convert.ToInt32(Console.ReadLine());
            while (count != 0)
            {

                string[] valores = Console.ReadLine().Split(' ');
                double a = Convert.ToDouble(valores[0], CultureInfo.InvariantCulture);
                double v = Convert.ToDouble(valores[1], CultureInfo.InvariantCulture);
                double radiano = (pi * a) / 180;
                double voy = v * Math.Sin(radiano);
                double vox = v * Math.Cos(radiano);
                double t = (voy / g) + (Math.Sqrt((voy * voy) + (2 * g * h)) / g);
                double result = vox * t;


                if (result >= p1 && result <= p2)
                {
                    Console.WriteLine($"{result:F5} -> DUCK");
                }
                else
                {
                    Console.WriteLine($"{result:F5} -> NUCK");
                }


                count--;
            }
        }
    }
}
