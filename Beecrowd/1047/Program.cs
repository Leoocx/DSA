using System;
class URI
{
    public static void Main(string[] args)
    {
        string[] entrada = Console.ReadLine().Split(' ');
        int horainicial = int.Parse(entrada[0]);
        int mininicial = int.Parse(entrada[1]);
        int horafinal = int.Parse(entrada[2]);
        int minfinal = int.Parse(entrada[3]);

        int hora = horafinal - horainicial;
        int minutos = minfinal - mininicial;


        if (horainicial == horafinal && mininicial == minfinal && horafinal == minfinal && horainicial == mininicial)
        {
            Console.WriteLine("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        }
        if (minutos < 0)
        {
            minutos += 60;
            hora -= 1;
        }
        if (hora < 0)
        {
            hora += 24;
        }
        Console.WriteLine($"O JOGO DUROU {hora} HORA(S) E {minutos} MINUTO(S)");

    }
}