using System;


class URI{
    public static void Main(string[] args){
        int count=Convert.ToInt32(Console.ReadLine());
        while (count!=0){
            string s=Console.ReadLine();
            int result=0;
            foreach (var i in s){
                if (i=='1'){
                    result+=2;
                }
                else if (i=='2'){
                    result+=5;
                }
                else if (i=='3'){
                    result+=5;
                }
                else if (i=='4'){
                    result+=4;
                }
                else if (i=='5'){
                    result+=5;
                }
                else if (i=='6'){
                    result+=6;
                }
                else if (i=='7'){
                    result+=3;
                }
                else if (i=='8'){
                    result+=7;
                }
                else if (i=='9'){
                    result+=6;
                }              
                else {
                    result+=6;
                }                  
            }
            Console.WriteLine($"{result} leds");
            count--;
        }




    }


}