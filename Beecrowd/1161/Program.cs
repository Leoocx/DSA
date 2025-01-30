class Program
{
    public static long Fatorial(int q)
    {
        long result = 1;
        for (int i = 1; i <= q; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void Main(string[] args)
    {
        while (true)
        {
            string linha = Console.ReadLine();
            if (linha == null)
            {
                break;
            }

            string[] entrada = linha.Split(' ');

            if (entrada.Length != 2)
            {
                break;
            }
            if (entrada == null)
            {
                break;
            }

            int x = int.Parse(entrada[0]);
            int y = int.Parse(entrada[1]);
            Console.WriteLine(Fatorial(x) + Fatorial(y));
        }
    }
}