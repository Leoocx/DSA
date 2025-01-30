using System.Globalization;

class Program
{
    public static void Main(string[] args)
    {
        string entrada = Console.ReadLine();
        while (true)
        {
            if (entrada == null)
            {
                break;
            }
            int N = int.Parse(entrada);
            string[] dimensions = Console.ReadLine().Split();
            int H = int.Parse(dimensions[0]);
            int C = int.Parse(dimensions[1]);
            int L = int.Parse(dimensions[2]);

            double lengthOfRamp = Math.Sqrt(Math.Pow(N * C, 2) + Math.Pow(N * H, 2));
            double areaOfRamp = lengthOfRamp * L / 10000.0;

            Console.WriteLine(areaOfRamp.ToString("F4", CultureInfo.InvariantCulture));
        }

    }
}