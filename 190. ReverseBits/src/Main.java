public class Main {

    public static int reverseBits(int n) {
        int result=0;
        for (int i=0;i<32;i++){
            int bit=n&1;
            result = (result<<1)|bit;
            n=n>>>1;
        }
        return result;
    }

    public static void main(String[] args) {
        reverseBits(01111111);
    }
}

/*
* Loop de 32 iterações  int i = 0; i < 32; i++)
    Itera 32 vezes, pois estamos lidando com um número de 32 bits.
    *
    * int bit = n & 1;

    Obtém o bit menos significativo de n (0 ou 1).
    *
    *
    *
    * result = (result << 1) | bit;

    Desloca result para a esquerda em 1 posição para abrir espaço para o novo bit.

    Usa | bit para inserir o bit extraído no result.
    * */