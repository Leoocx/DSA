using System;
using System.Collections.Generic;

class URI
{
    public static void Main(string[] args)
    {
        List<int> result = new List<int>();
        int caso = 1;

        while (true)
        {
            string aux = Console.ReadLine();
            if (string.IsNullOrEmpty(aux))
            {
                return;
            }

            int value = Convert.ToInt32(aux);
            Dictionary<int, int> countDict = new Dictionary<int, int>(); 
            result.Add(0);
            if (aux.Equals("0")){
                Console.WriteLine($"Caso {caso}: {result.Count} numero");
                Console.WriteLine(string.Join(" ", result));

                Console.WriteLine();
                result.Clear();
                caso++;
            }
            else{
                while (value != 0)
                {
                    if (!countDict.ContainsKey(value) || countDict[value] != value)
                    {
                        result.Add(value);
                        if (countDict.ContainsKey(value))
                        {
                            countDict[value]++;
                        }
                        else
                        {
                            countDict[value] = 1;
                        }
                    }
                    else
                    {
                        value--;
                        }
                }
                result.Sort();
                Console.WriteLine($"Caso {caso}: {result.Count} numeros");
                Console.WriteLine(string.Join(" ", result));
                Console.WriteLine();
                result.Clear();
                caso++;

                    
            }


        }
    }
}
