using System;
using System.Reflection;
using System.Runtime.InteropServices;

class URI{
    public static void Main(string[] args){
        
        while (true){
            int carry=0;
            string[] values=Console.ReadLine().Split(" ");
            string aux1=values[0];
            string aux2=values[1];
            string[] values1=aux1.Split("");
            string[] values2=aux2.Split("");
            if (values1[0]=="0" && values2[0]=="0"){
                Environment.Exit(0);
            }
            for (int i=0;i<values1.Length;i++){
                int x=Convert.ToInt32(values1[i]);
                int y=Convert.ToInt32(values2[i]);
                if (x+y>=10){
                    carry++;
                }
            }


            Console.WriteLine(carry);
        }
    }
}