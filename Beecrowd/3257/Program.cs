
using System;
using System.Collections.Generic;
using System.Collections;
using System.Linq;

class URI{
    public static void Main(string[] args){
        int aux=int.Parse(Console.ReadLine());
        string[] k=Console.ReadLine().Split(' ');
        if (k.Length!=aux)
            return;
        int count=0;
        List<int> r=new List<int>();
        foreach (string i in k){
            r.Add(int.Parse(i));
        }        
        r.Sort((a,b)=>b.CompareTo(a));
        int result=0;
        List<int> valores=new List<int>();

        for (int i=0;i<r.Count;i++){
            valores.Add(i+r[i]);
        }

        Console.WriteLine(valores.Max()+2);

    } 

}