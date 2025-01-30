
class Program
{
    public static void Main(string[] args)
    {
        ulong n = Convert.ToUInt32(Console.ReadLine());
        ulong result = ((n * (n - 3)) / 2);

        Console.WriteLine(result);

    }
}