class Program
{
    public static void Main(string[] args)
    {
        int count = Convert.ToInt32(Console.ReadLine());
        while (count != 0)
        {
            string entrada = Console.ReadLine();
            string[] numeros = entrada.Split('x');
            int result1 = Convert.ToInt32(numeros[0].Trim());
            int result2 = Convert.ToInt32(numeros[1].Trim());
            if (result1 != result2)
            {
                Console.WriteLine($"{result1} x {5} = {result1 * 5} && {result2} x {5} = {result2 * 5}");
                Console.WriteLine($"{result1} x {6} = {result1 * 6} && {result2} x {6} = {result2 * 6}");
                Console.WriteLine($"{result1} x {7} = {result1 * 7} && {result2} x {7} = {result2 * 7}");
                Console.WriteLine($"{result1} x {8} = {result1 * 8} && {result2} x {8} = {result2 * 8}");
                Console.WriteLine($"{result1} x {9} = {result1 * 9} && {result2} x {9} = {result2 * 9}");
                Console.WriteLine($"{result1} x {10} = {result1 * 10} && {result2} x {10} = {result2 * 10}");
            }
            else
            {
                Console.WriteLine($"{result1} x {5} = {result1 * 5}");
                Console.WriteLine($"{result1} x {6} = {result1 * 6}");
                Console.WriteLine($"{result1} x {7} = {result1 * 7}");
                Console.WriteLine($"{result1} x {8} = {result1 * 8}");
                Console.WriteLine($"{result1} x {9} = {result1 * 9}");
                Console.WriteLine($"{result1} x {10} = {result1 * 10}");


            }
            count--;
        }

    }
}