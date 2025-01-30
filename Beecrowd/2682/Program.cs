using System;
using System.Collections.Generic;

class URI{
    public static void Main(string[] args){
        List<int> valores = new List<int>();

        while (true){
            string entrada = Console.ReadLine();

            if (string.IsNullOrWhiteSpace(entrada) || entrada.Length > 100000){
                break;
            }

            if (int.TryParse(entrada, out int valor)){
                valores.Add(valor);
            }
        }

        int ultimoValorValido = valores[0];
        for (int i = 1; i < valores.Count; i++){
            if (valores[i] < valores[i - 1]){
                Console.WriteLine(ultimoValorValido + 1);
                return;
            }
            ultimoValorValido = valores[i];
        }
        Console.WriteLine(ultimoValorValido + 1);
    }
}