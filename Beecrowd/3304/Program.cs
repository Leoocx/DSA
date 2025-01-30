using System;
using System.Numerics;
using System.Linq;
class URI{
    public static void Main(string[] args){
        while (true){
            string entrada=Console.ReadLine();
            if (string.IsNullOrEmpty(entrada)==true){
                break;
            }
            ulong x=Convert.ToUInt64(entrada);
            bool multiplo= x%4==0 || x%7==0;
            int num7=entrada.Count(c=>c=='7');
            int num4=entrada.Count(c=>c=='4');

            if (entrada.All(c => c == '4' || c == '7')){
                Console.WriteLine("sortudo");
            }
            else if (multiplo){
                Console.WriteLine("quase sortudo");
            }
            else {
                Console.WriteLine("azarado");
            }




        }



    }
}
