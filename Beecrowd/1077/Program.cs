using System;
using Microsoft.VisualBasic;


class URI{
    public static void Main(string[] args){
        int count=int.Parse(Console.ReadLine());
        while (count!=0){
            string infix=Console.ReadLine().Replace("(","").Replace(")","");
            string postfix=infix;
            int k=0;
            foreach(var i in postfix){
                if (i=='*'){
                    postfix.Remove('*');
                    postfix.Insert(i+1,"*");
                }
            }
            Console.WriteLine(postfix);

        }
        
    }




}