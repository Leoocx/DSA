using System;
using System.Collections.Generic;
using System.Collections;
using System.Linq;
using System.Numerics;

class URI{
    public static void Main(string[] args){
        
        while (true){


            string input=Console.ReadLine();
            if (string.IsNullOrEmpty(input)){
                Environment.Exit(0);
            }
            
            string[] values =input.Split(' ');
            
            
            if (string.IsNullOrEmpty(values[0]) || string.IsNullOrEmpty(values[1])){
                Environment.Exit(0);
            }
            
            BigInteger x=BigInteger.Parse(values[0]);
            BigInteger y=BigInteger.Parse(values[1]);
            BigInteger result=x^y;
            Console.WriteLine(result);
        }


    }

}