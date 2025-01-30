using System;

class URI{

    public static int MDC(int q,int r){
        if (r==0){
            return q;
        }
        else{
            int c=q%r;
            return MDC(r,c);
        }
    }


    public static void Main(string[] args){
        int count=int.Parse(Console.ReadLine());


        while (count!=0){
            string[] entrada=Console.ReadLine().Split(' ');
            int x=Convert.ToInt32(entrada[0]);
            int y=Convert.ToInt32(entrada[1]);
            Console.WriteLine(MDC(x,y));
            count--;
        }
    }
}