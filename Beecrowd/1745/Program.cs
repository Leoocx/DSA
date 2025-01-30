using System;
using System.Numerics;
class URI{
    public static void Main(string[] args){
        int count=Convert.ToInt32(Console.ReadLine());
        while (count!=0){
            string[] valores=Console.ReadLine().Split(' ');
            BigInteger x=BigInteger.Parse(valores[0]);
            BigInteger y=BigInteger.Parse(valores[1]);
            BigInteger k=(x+y-1)/y;
            if (k<2){
                Console.WriteLine(2);
            }
            else{
                Console.WriteLine(k);
            }
            count--;
            }
    }

}