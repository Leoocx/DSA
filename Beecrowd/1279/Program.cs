using System;
using System.Numerics;

class URI
{
    public static void Main(string[] args)
    {
        string input;
        bool isFirst = true;

        while ((input = Console.ReadLine()) != null)
        {
            if (!isFirst)
            {
                Console.WriteLine();
            }
            isFirst = false;
            BigInteger x = BigInteger.Parse(input);

            if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
            {
                Console.WriteLine("This is leap year.");
                if (x % 15 == 0)
                {
                    Console.WriteLine("This is huluculu festival year.");
                }
                if (x % 55 == 0)
                {
                    Console.WriteLine("This is bulukulu festival year.");
                }
            }
            else if (x % 15 == 0)
            {
                Console.WriteLine("This is huluculu festival year.");
            }
            else
            {
                Console.WriteLine("This is an ordinary year.");
            }

        }

    }
}
