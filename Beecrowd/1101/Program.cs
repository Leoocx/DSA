using System.Globalization;

class Program
{
    static void Main(string[] args)
    {
        List<int> result = new List<int>();
        while (true)
        {
            int T = 0;
            string[] valores = Console.ReadLine().Split(' ');
            int M = Convert.ToInt32(valores[0], CultureInfo.InvariantCulture);
            int N = Convert.ToInt32(valores[1], CultureInfo.InvariantCulture);
            if (M <= 0 | N <= 0)
            {
                break;
            }

            else if (N > M)
            {
                for (int i = M; i <= N; i++)
                {
                    T += i;
                    Console.Write("{0} ", i);

                }
                Console.WriteLine("Sum={0}", T);
            }
            else if (M > N)
            {
                for (int i = N; i <= M; i++)
                {
                    T += i;
                    Console.Write("{0} ", i);
                }
                Console.WriteLine("Sum={0}", T);


            }
        }
    }
}



