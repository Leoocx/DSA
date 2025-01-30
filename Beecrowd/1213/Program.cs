using System;

class URI
{
    public static void Main(string[] args)
    {
        string input;
        while ((input = Console.ReadLine()) != null)
        {
            int n = Convert.ToInt32(input);
            int re = 1;
            int length = 1;

            while (re % n != 0)
            {
                re = (re * 10 + 1) % n;
                length++;
            }

            Console.WriteLine(length);
        }
    }
}
