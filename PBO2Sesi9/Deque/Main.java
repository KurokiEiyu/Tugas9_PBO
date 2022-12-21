package PBO2Sesi9.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Spesialis brawler=new Spesialis("Brawler");
        Spesialis armose=new Spesialis("Armored Horse",3000,120,25);
        Spesialis priest=new Spesialis("Priestes",2800,110,20);

        Knight ksword=new Knight("Knight Swords");
        Knight paladin=new Knight("Paladin",2400,150,14);
        Knight kaxe=new Knight("Knight Axe",2500,140,17);

        ArrayDeque<Knight> charaKnight=new ArrayDeque<Knight>();
        ArrayDeque<Spesialis> charaSpesialis=new ArrayDeque<Spesialis>();

        charaSpesialis.add(brawler);
        charaSpesialis.addFirst(armose);
        charaSpesialis.add(priest);

        charaKnight.add(ksword);
        charaKnight.add(paladin);
        charaKnight.addFirst(kaxe);

        System.out.println("Character Spesialis : ");
        for(Spesialis spesialis: charaSpesialis){
            spesialis.infoCharacter();
        }
        System.out.println("");
        System.out.println("Character Knight :");
        for(Knight kishi: charaKnight){
            kishi.infoCharacter();
        }
    }
}
