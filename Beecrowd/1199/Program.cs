using System;

class URI
{


    public static void Main(string[] args)
    {
        while (true)
        {
            string entrada = Console.ReadLine();
            bool l = entrada.Contains("-");
            if (l == true)
            {
                break;
            }
            bool k = entrada.Contains("x");
            if (k == true)
            {
                string a = entrada.Remove(0, 2);
                int hex_dec = Convert.ToInt32(a, 16);
                Console.WriteLine(hex_dec);
            }
            else
            {
                string hexValue = string.Format("{0:x}", Convert.ToInt32(entrada)); ;
                Console.WriteLine($"0x{hexValue.ToUpper()}");
            }


        }
    }
}