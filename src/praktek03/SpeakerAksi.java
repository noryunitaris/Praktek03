package praktek03;
public class SpeakerAksi {
    public static void main(String[] args) {
        Speaker s = new Speaker();
   
        s.setMerk("Bower&wilkins");
        s.setJenis("Audio");
        s.setHarga(2500000);
        
        s.informasi();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Jenisnya \t: ");
        System.out.println(s.getJenis());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
    
}
