using System;
using System.Numerics;

class URI{

    static bool Primo(long number){
        if (number <= 1){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.Sqrt(number); i += 2){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void Main(string[] args){
        while (true){
            string input=Console.ReadLine();
            if (string.IsNullOrEmpty(input)){
                break;
            }
            int r=input.Length;
            int s=0;
            long m=Convert.ToInt64(input);
            
            foreach (char i in input){
                if (i=='2' || i=='3' || i=='5' || i=='7') {
                    s++;
                }
            }

            if (s==r && Primo(m)==true){
                Console.WriteLine("Super");
            }
            else if (Primo(m)==true){
                Console.WriteLine("Primo");
            }
            else{
                Console.WriteLine("Nada");
            }
        }
    }
}