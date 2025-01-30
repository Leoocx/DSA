using System;
using System.Numerics;

class URI{
    public static void Main(string[] args){
        string r=Console.ReadLine();
        ulong aux=Convert.ToUInt64(r);
        if (aux>999999999){
            return;
        }
        BigInteger valorbase =new BigInteger(3);
        BigInteger modulo = new BigInteger(2147483647);
        BigInteger result = BigInteger.ModPow(valorbase,aux,modulo);
        Console.WriteLine(result);
    }
}