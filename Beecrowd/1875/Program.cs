class Program
{
    public static void Main(string[] args)
    {
        int count = Convert.ToInt32(Console.ReadLine());

        while (count != 0)
        {
            int c = Convert.ToInt32(Console.ReadLine());

            int blue = 0, red = 0, green = 0;

            while (c != 0)
            {
                string[] input = Console.ReadLine().Split();


                if (input[0] == "R")
                {
                    if (input[1] == "B")
                    {
                        red += 1;
                    }
                    else
                    {
                        red += 2;
                    }
                }
                else if (input[0] == "B")
                {
                    if (input[1] == "G")
                    {
                        blue += 1;
                    }
                    else
                    {
                        blue += 2;
                    }
                }
                else if (input[0] == "G")
                {
                    if (input[1] == "R")
                    {
                        green += 1;
                    }
                    else
                    {
                        green += 2;
                    }
                }

                c--;
            }

            if (blue == green && blue == red)
            {
                Console.WriteLine("trempate");
            }
            else if ((blue == green && blue > red) || (blue == red && blue > green) || (red == green && red > blue))
            {
                Console.WriteLine("empate");
            }
            else
            {
                if (green > red && green > blue)
                {
                    Console.WriteLine("green");
                }
                else if (red > blue && red > green)
                {
                    Console.WriteLine("red");
                }
                else
                {
                    Console.WriteLine("blue");
                }
            }

            count--;
        }
    }
}
