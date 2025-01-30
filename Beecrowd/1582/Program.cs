using System.Formats.Asn1;
using System.Runtime.CompilerServices;


class Program
{


    static int calculaMdc(int a, int b)
    {
        int resto = a % b;

        while (resto != 0)
        {
            a = b;
            b = resto;
            resto = a % b;
        }

        return b;
    }
    public static void Main(string[] args)
    {
        while (true)
        {
            string[] entrada = Console.ReadLine().Split(' ');
            int x = Convert.ToInt32(entrada[0]);
            int y = Convert.ToInt32(entrada[1]);
            int z = Convert.ToInt32(entrada[2]);
            int k = 0;
            if (x < y)
            {
                k = x;
                x = y;
                y = k;
            }
            if (x < z)
            {
                k = x;
                x = z;
                z = k;
            }


            if (x * x + y * y == z * z)
            {
                int mdc = calculaMdc(x, y);
                int result = calculaMdc(mdc, z);

                if (result == 1)
                {
                    Console.WriteLine("tripla pitagorica primitiva");
                }
                else
                {
                    Console.WriteLine("tripla pitagorica");
                }
            }
            else
            {
                Console.WriteLine("tripla");
            }


        }

    }
}

