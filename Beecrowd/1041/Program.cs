class Program
{
    static void Main(string[] args)
    {
        string[] entrada = Console.ReadLine().Split(' ');

        double x = Convert.ToDouble(entrada[0]);
        double y = Convert.ToDouble(entrada[1]);
        if (x > 0 & y > 0)
        {
            Console.WriteLine("Q1");
        }
        else if (x < 0 & y > 0)
        {
            Console.WriteLine("Q2");
        }
        else if (x < 0 & y < 0)
        {
            Console.WriteLine("Q3");
        }
        else if (x == 0 & y == 0)
        {
            Console.WriteLine("Origem");
        }
        else if (x != 0 & y == 0)
        {
            Console.WriteLine("Eixo X");
        }
        else if (y != 0 & x == 0)
        {
            Console.WriteLine("Eixo Y");
        }

        else
        {
            Console.WriteLine("Q4");
        }
    }

}