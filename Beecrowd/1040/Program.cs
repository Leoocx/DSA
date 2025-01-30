using System;
using System.Globalization;

class URI{
    public static void Main(string[] args){
        string[] entrada=Console.ReadLine().Split(' ');
        double x=Convert.ToDouble(entrada[0],CultureInfo.InvariantCulture);        
        double y=Convert.ToDouble(entrada[1],CultureInfo.InvariantCulture);        
        double z=Convert.ToDouble(entrada[2],CultureInfo.InvariantCulture);        
        double k=Convert.ToDouble(entrada[3],CultureInfo.InvariantCulture);        

        double media=(x*2+3*y+4*z+k)/10;

        
        bool aprovado=media>7;
        bool reprovado=media<5;
        if (aprovado){
            Console.WriteLine($"Media: {(media-0.0001).ToString("N1")}");
            Console.WriteLine("Aluno aprovado.");
        }
        else if (reprovado){
            Console.WriteLine($"Media: {(media-0.0001).ToString("N1")}");

            Console.WriteLine("Aluno reprovado.");
        }
        else{
            Console.WriteLine($"Media: {(media-0.0001).ToString("N1")}");
           
            double e=Convert.ToDouble(Console.ReadLine(),CultureInfo.InvariantCulture);
            Console.WriteLine("Aluno em exame.");
            Console.WriteLine($"Nota do exame: {e.ToString("N1")}");
           
            if((e+media)/2 >5.0){
                Console.WriteLine("Aluno aprovado.");
                Console.WriteLine($"Media final: {((e+media)/2).ToString("N1")}");
            }
            else{
                Console.WriteLine("Aluno reprovado.");
                Console.WriteLine($"Media final: {((e+media)/2).ToString("N1")}");
            }

        }
    }
}