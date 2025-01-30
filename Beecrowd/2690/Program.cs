using System;

class URI{

    public static void Main(string[] args){
        int count=Convert.ToInt32(Console.ReadLine());   
        while (count!=0){
            string s=Console.ReadLine().ToLower().Replace(" ","");
            foreach (var i in s){
                if (i=='a' || i=='k' || i=='u'){
                    s=s.Replace(i,'0');
                }
                else if (i=='b' || i=='l' || i=='v'){
                    s=s.Replace(i,'1');
                }                
                else if (i=='c' || i=='m' || i=='w'){
                    s=s.Replace(i,'2');
                }
                else if (i=='d' || i=='n' || i=='x'){
                    s=s.Replace(i,'3');
                }                
                else if (i=='e' || i=='o' || i=='y'){
                    s=s.Replace(i,'4');
                }            
                else if (i=='f' || i=='p' || i=='z'){
                    s=s.Replace(i,'5');
                }            
                else if (i=='g' || i=='q' ){
                    s=s.Replace(i,'6');
                }            
                if (i=='h' || i=='r'){
                    s=s.Replace(i,'7');
                }
                if (i=='i' || i=='s' ){
                    s=s.Replace(i,'8');
                }
                else if (i=='j' || i=='t'){
                    s=s.Replace(i,'9');
                }
            }

            Console.WriteLine(s);

            count--;

        }





    }

}