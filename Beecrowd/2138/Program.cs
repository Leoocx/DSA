using System;
using System.Linq;

class Program
{
    static void Main()
    {
        while (true)
        {
            string input = Console.ReadLine();
            char mostFrequentDigit = FindMostFrequentDigit(input);
            Console.WriteLine(mostFrequentDigit);
        }
    }

    static char FindMostFrequentDigit(string input)
    {
        return input
            .Where(char.IsDigit)
            .GroupBy(c => c)
            .OrderByDescending(g => g.Count())
            .FirstOrDefault()?.Key ?? '\0';
    }
}
