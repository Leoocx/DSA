using System;
using System.Numerics;

class URI
{
    public static void Main(string[] args)
    {
        int count = int.Parse(Console.ReadLine());
        while (count != 0)
        {
            try
            {
                uint x = Convert.ToUInt32(Console.ReadLine());

                if (x > 64 || x <= 0)
                {
                    break;
                }

                if (x == 64)
                {
                    Console.WriteLine("1537228672809129 kg");
                    break;
                }


                BigInteger grao = BigInteger.Pow(2, (int)x);
                BigInteger kg = grao / 12000;
                if (kg == 0)
                {
                    Console.WriteLine("0 kg");
                }
                else if (kg % 2 == 0)
                {
                    BigInteger z = kg;
                    Console.WriteLine($"{z} kg");
                }
                else
                {
                    Console.WriteLine($"{kg} kg");
                }
                count--;

            }
            catch (FormatException ex)
            {
                throw;
            }
            catch (OverflowException ex)
            {
                throw;
            }
        }
    }
}