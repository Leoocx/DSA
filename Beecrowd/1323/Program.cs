

class Program
{
    public static void Main(string[] args)
    {
        while (true)
        {
            int squares = int.Parse(Console.ReadLine());
            if (squares == 0)
            {
                break;
            }
            int result = 0;
            while (squares != 0)
            {
                result += (squares * squares);
                squares--;
            }
            Console.WriteLine(result);
        }

    }
}