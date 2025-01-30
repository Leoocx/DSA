class Program
{
    public static void Main(string[] args)
    {
        string[] entrada = Console.ReadLine().Split(' ');
        long a = long.Parse(entrada[0]);
        long b = long.Parse(entrada[1]);
        long result = ((b - a + 1) * (a + b)) / 2;
        Console.WriteLine(result);

    }
}