using System;

class Vertebrado{
    public string j{get;set;}
    public string k{get;set;}
    
    public string vertebrado(string j,string k){
        this.j=j;
        this.k=k;
        if (this.j=="ave"){
            if (this.k=="carnivoro"){
                return "aguia";
            }
            else{
                return "pomba";
            }
        }
        else{
            if (this.k=="onivoro"){
                return "homem";
            }
            else{
                return "vaca";
            }
        }   
    }
}

class Invertebrado{
    public string i{get;set;}
    public string a{get;set;}

    public string invertebrado(string i,string a){
        this.i=i;
        this.a=a;
        if (this.i=="inseto"){
            if (this.a=="hematofago"){
                return "pulga";
            }
            else{
                return "lagarta";
            }
        }
        else{
            if (this.a=="hematofago"){
                return "sanguessuga";
            }
            else{
                return "minhoca";
            }
        }
    }
}

class URI{
    public static void Main(string[] args){
        string x,y,z;
        x=Console.ReadLine().ToLower();
        y=Console.ReadLine().ToLower();
        z=Console.ReadLine().ToLower();
        if (x=="vertebrado"){
            Vertebrado vertebrado=new Vertebrado();
            vertebrado.j=y;
            vertebrado.k=z;
            Console.WriteLine(vertebrado.vertebrado(vertebrado.j,vertebrado.k));
        }
        else{
            Invertebrado invertebrado=new Invertebrado();
            invertebrado.i=y;
            invertebrado.a=z;
            Console.WriteLine(invertebrado.invertebrado(invertebrado.i,invertebrado.a));
        }

    }

}









