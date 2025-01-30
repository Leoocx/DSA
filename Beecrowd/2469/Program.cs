using System;
using System.Collections.Generic;
using System.Linq;

class URI{
    public static void Main(string[] args){
        int count=int.Parse(Console.ReadLine());
        string[] aux=Console.ReadLine().Split(' ');
        
        List<int> values=new List<int>();
        
        foreach (string s in aux){
            values.Add(int.Parse(s));
        }
        values.Sort((a,b)=>b.CompareTo(a));

        int frequente=values
                    .GroupBy(item=>item)
                    .OrderByDescending(g=>g.Count())
                    .First().Key;
        Console.WriteLine(frequente);
    }

}