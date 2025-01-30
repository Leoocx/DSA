using System;
using System.Globalization;
using System.Linq;
using System.Collections.Generic;
class URI{
    public static void Main(string [] args){
        List<string> strings= new List<string> ();
        int count=int.Parse(Console.ReadLine()); 
        while (count!=0){   
            string name= Console.ReadLine();
            strings.Add(name);
            count--;
        }
        var sortedNames = strings.OrderBy(n => n[0]).ThenBy(n => strings.IndexOf(n));
        foreach(string i in sortedNames){
            TextInfo textInfo=new CultureInfo("en-US",false).TextInfo;
            Console.WriteLine($"{textInfo.ToTitleCase(i.ToString())}");

        }

    }

}