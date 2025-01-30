using System;
class Desafios
{
    static void Main(string[] args)
    {

        int x = Convert.ToInt32(Console.ReadLine());

        if (x >= 2 && x <= 100)
        {
            int quadrados_brancos, quadrados_pretos;
            if ((x * x) % 2 == 0)
            {

                quadrados_pretos = (x / 2) * x;
                quadrados_brancos = (x / 2) * x;

            }
            else
            {
                quadrados_brancos = (x * x + 1) / 2;
                quadrados_pretos = (x * x - 1) / 2;

            }
            Console.WriteLine($"{quadrados_brancos} casas brancas e {quadrados_pretos} casas pretas");
        }

    }
}


