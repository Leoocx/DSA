

class RecentCounter {
    int[] arr = new int[10000];
    int inicio, fim;
    public RecentCounter() {
        this.inicio=0;
        this.fim=0;
    }
    public int ping(int t) {
        while (inicio<fim && (t-arr[inicio]>3000)){
            inicio++;
        }
        arr[fim++]=t;
        return fim-inicio;
    }
}

