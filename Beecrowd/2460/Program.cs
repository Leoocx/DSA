using System;
using System.Collections.Generic;
using System.Linq;

class URI{

    public static void Main(string[] args){

        int count=int.Parse(Console.ReadLine());
        string[] k1=Console.ReadLine().Split(' ');

        int count2=int.Parse(Console.ReadLine());
        string[] k2=Console.ReadLine().Split(' ');

        IEnumerable<string> result= from num in k1.Except(k2)
                            select num;
        string m=string.Join(" ",result);
        Console.WriteLine(m.Trim());

    }

}