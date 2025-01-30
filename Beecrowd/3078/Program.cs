using System;

class URI{
    public static void Main(string[] args){
        while (true){
            string n=Console.ReadLine();
            if (string.IsNullOrEmpty(n) || n=="-1"){
                return;
            }
            int x=Convert.ToInt32(n);
            double b=x%257;
            double c=x%193;
            double d=Math.Pow(b,16/22)*Math.Pow(b,3/11)-b+4;
            double delta=b*b-4*c;
            if (delta<0){
                Console.WriteLine("So o ouro");
            }
            else{
                double k1=(-b+Math.Sqrt(delta))/2;
                double k2=(-b-Math.Sqrt(delta))/2;
                if (k1<0 && k2<0){
                    Console.WriteLine("So o ouro");
                }
                else if ((k1<0 && k2==0)||(k2<0 && k1==0)||(x==0)||(k1==0.0 && k2==0.0)){
                    Console.WriteLine("Bom");
                }
                else{
                    Console.WriteLine("Regular");
                }
            }
        }
    }

}