using System;
using System.Numerics;
using System.Collections;
using System.Collections.Generic;

class URI {
    public static void Main(string[] args) {
        while (true) {
            string[] entrada = Console.ReadLine()?.Split(' ');
            if (entrada == null || entrada.Length != 2 || string.IsNullOrEmpty(entrada[0]) || string.IsNullOrEmpty(entrada[1])) {
                break;
            }

            try {
                BigInteger x = BigInteger.Parse(entrada[0]);
                BigInteger y = BigInteger.Parse(entrada[1]);
                Console.WriteLine(BigInteger.Abs(x - y));
            } catch (FormatException) {
                break;
            }
        }
    }
}
