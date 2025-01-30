using System;
using System.Collections.Generic;

class URI
{

    public static int SomaDivisores(int q)
    {
        int soma = 1;
        int raiz = (int)Math.Sqrt(q);

        for (int i = 2; i <= raiz; i++)
        {
            if (q % i == 0)
            {
                soma += i;
                if (i != q / i)
                {
                    soma += q / i;
                }
            }
        }
        return soma;
    }

    public static void Main(string[] args)
    {
        while (true)
        {
            string[] entrada = Console.ReadLine().Split(' ');
            int x = int.Parse(entrada[0]);
            int y = int.Parse(entrada[1]);

            if (x == 0 && y == 0)
            {
                break;
            }

            int somaDivisoresX = SomaDivisores(x);
            int somaDivisoresY = SomaDivisores(y);

            bool xAmaY = y % somaDivisoresX == 0; // x ama y
            bool yAmaX = x % somaDivisoresY == 0; // y ama x

            if (xAmaY && yAmaX)
            {
                Console.WriteLine("Friends and lovers <3");
            }
            else if (somaDivisoresX == somaDivisoresY)
            {
                Console.WriteLine("Almost lovers!");
            }
            else if (xAmaY && !yAmaX)
            {
                Console.WriteLine($"{y} friendzoned {x}!");
            }
            else if (yAmaX && !xAmaY)
            {
                Console.WriteLine($"{x} friendzoned {y}!");
            }
            else
            {
                Console.WriteLine("No connection.");
            }
        }
    }
}
