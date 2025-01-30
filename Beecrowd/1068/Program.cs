using System;
using System.Collections.Concurrent;
using System.Text.RegularExpressions;

class URI{
    public static void Main(string[] args){
        while (true){
            string j=Console.ReadLine();
            if (string.IsNullOrEmpty(j)){
                return;
            }

            j=j.Trim();            

            bool Correct=true;
            int brackets=0;
            foreach (var i in j){
                if (i=='('){
                    brackets++;
                }
                else if (i==')'){
                    if (brackets>0){
                        brackets--;
                    }
                    else{
                        Correct=false;
                        break;
                    }
                }
            }
            Correct=Correct && (brackets == 0);
            
            if (Correct==true ){
                Console.WriteLine("correct");
            }
            else{
                Console.WriteLine("incorrect");
            }




        }
    }
}



