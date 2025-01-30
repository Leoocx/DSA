using System;
using System.Linq;

class Program
{
    public static void Main(string[] args)
    {
        int s = Convert.ToInt32(Console.ReadLine());
        int[] user1 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray(); // Quadradônia
        int[] user2 = Console.ReadLine().Split(' ').Select(int.Parse).ToArray(); // Nlogonia

        Array.Sort(user1);
        Array.Sort(user2);

        int vitorias = 0;
        int j = 0;

        for (int i = 0; i < s; i++)
        {
            if (user2[i] > user1[j])
            {
                vitorias++;
                j++;
            }
        }

        Console.WriteLine(vitorias);
    }
}
