package zadachaabs;

public class main {
    public static void main(String[] args) {
        ACar ACar=new ACar("toyota","grey",250);
        System.out.println(ACar);
        ACar.gas();
        ACar.brake();
        Lorry Lorry =new Lorry("howo","black",200);
        System.out.println(Lorry);
        Lorry.gas();
   Lorry.brake();
    }
}
