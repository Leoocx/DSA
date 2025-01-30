using System.Globalization;

class Program
{
    public static void Main(string[] args)
    {
        int count = Convert.ToInt32(Console.ReadLine());


        while (count != 0)
        {
            int dias = 0;
            double kilos = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            while (kilos > 1)
            {
                kilos = kilos / 2.0;
                dias++;
            }
            Console.WriteLine($"{dias} dias");
            count--;

        }


    }

}