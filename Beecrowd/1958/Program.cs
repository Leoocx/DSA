

class Program
{
    public static int Binario(int q)
    {
        string result = "";
        while (q != 0)
        {
            int r = q % 2;
            string s = Convert.ToString(r);
            result = s + result;
            q = q / 2;
            return Convert.ToInt32(result);

        }
    }

    static void Main(string[] args)
    {
        double num = Convert.ToDouble(Console.ReadLine());
        List<string> lista = new List<string>();
        if (num > 0)
        {
            lista.Add("+");
            int expoente = 0;
            while (Math.Truncate(num) != 1)
            {
                double valor = num / 2;
                expoente += 1;
            }
            lista.Add(Convert.ToString(Math.Round(num, 4)));
            lista.Add("E");
            lista.Add(Convert.ToString(expoente));

            int ParteExpoente = 127 + expoente;
            int ParteExp = Binario(ParteExpoente);


        }
        else
        {
            lista.Add("-");
        }


    }

}