using System;

class URI{
    public static void Main(string[] args){
        string[] entrada=Console.ReadLine().Split(' ');
        int a=Convert.ToInt32(entrada[0]);
        int b=Convert.ToInt32(entrada[1]);
        
        for (int i=0; i<Math.Abs(b);i++){
            if ( (a-i)%b==0 ){
                int q=(a-i)/b;
                Console.WriteLine($"{q} {i}");
                
                break;
            }
        }
        
    }

}