
class Program
{
    public static void Main(string[] args)
    {
        while (true)
        {
            double L = Convert.ToDouble(Console.ReadLine());
            if (L == 0)
            {
                break;
            }
            double k = L - 3;
            double arc = k + L;
            double x = (arc / L) - 1;
            Console.WriteLine(x.ToString("N6"));

        }

    }
}