using System;
using System.Globalization;
using System.Collections.Generic;
using System.Linq;
class URI{
    public static void Main(string[] args){
        int count=int.Parse(Console.ReadLine());
        while (count!=0){
            List<double> valores=new List<double>();
            string name=Console.ReadLine();
            string[] entrada=Console.ReadLine().Split(' ');
            if  (entrada.Length>4 || name.Length>20){
                break;
            }
        
            if (entrada.Length==1){
                Console.WriteLine($"{name}: {(Convert.ToDouble(entrada[0],CultureInfo.InvariantCulture)/2.0).ToString("N1")}");
            }     
            else{      
                foreach(string s in entrada){
                    valores.Add(Convert.ToDouble(s,CultureInfo.InvariantCulture));
                }

                if (valores.Count==4){
                    double aux0=valores[0];
                    double aux1=valores[1];
                    double aux2=valores[2];
                    double aux3=valores[3];
                    double aux4=Math.Min(aux0, aux1);
                    double aux5=Math.Min(aux2, aux3);
                    valores.Remove(Math.Min(aux4,aux5));
                }
                double media= valores.Sum()/valores.Count;
                Console.WriteLine($"{name}: {media.ToString("N1")}");            
            }
            count--;
        }
    }
}