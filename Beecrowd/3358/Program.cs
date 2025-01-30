using System;
using System.Linq;
using System.Globalization;
class URI{
    public static void Main(string[] args){
       
        int count=int.Parse(Console.ReadLine());
        

        while (count!=0){
            string surname=Console.ReadLine().ToLower();

            if (surname.Length>42){
                break;
            }
            string aux=surname.Replace("a","").Replace("e","").Replace("i","").Replace("o","").Replace("u","");
            char[] result=surname.ToCharArray();
            bool easy=true;
            
            for (int i=0;i<result.Length-2;i++){
                string v = new string(new char[] { result[i], result[i + 1], result[i + 2] } );
                if (aux.Contains(v)==true){
                    easy=false;
                    break;
                }
            }
            if (easy==false ){
                TextInfo textInfo = new CultureInfo("en-US", false).TextInfo;
                Console.WriteLine($"{textInfo.ToTitleCase(surname.ToLower())} nao eh facil");
            }
            else{
                TextInfo textInfo = new CultureInfo("en-US", false).TextInfo;
                Console.WriteLine($"{textInfo.ToTitleCase(surname.ToLower())} eh facil");
            }

            count--;
        }

    }

}



