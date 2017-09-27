package net.yusufakgun.myapplication;

public class karakter {
    int kilo;
    int hareketKabiliyeti;
    int saldiriGucu;
    public String yemek(){
        if(hareketKabiliyeti > 0) {
            kilo++;
            hareketKabiliyeti--;
            return "Karakterimiz yemek yedi";
        }
        else
            return "Yeterli Hareket Kabiliyeti Yok";
    }
    public String uyumak(){
        if(hareketKabiliyeti > 0) {
            hareketKabiliyeti++;
            saldiriGucu++;
            return "Karakterimiz uyudu";
        }
        else
            return "Yeterli Hareket Kabiliyeti Yok";
    }
    public String savas(){
        if(hareketKabiliyeti > 0) {
            hareketKabiliyeti--;
            kilo--;
            saldiriGucu--;
            return "Karakterimiz savaştı ";
        }
        else
            return "Yeterli Hareket Kabiliyeti Yok";
    }
    @Override
    public String toString(){
        return "kilo: " + kilo + "\n hareket kabiliyeti: " + hareketKabiliyeti + "\n saldiri gücü: " + saldiriGucu;
    }
}
