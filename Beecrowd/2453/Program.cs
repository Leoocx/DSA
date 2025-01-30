using System;
using System.Linq;

class URI{

    public static void Main(string[] args){

        string[] s=Console.ReadLine().Split();
        string result="";

        foreach (string r in s){
            for (int j=1; j< r.Length; j+=2){
                result+=r[j];
            }
            result+=" ";
        }

        Console.WriteLine(result.Trim());
    }
}
