import java.util.Scanner;

public class Cinzody {
    public static void main(String[] args) {
        Scanner dt =new Scanner(System.in);
        int dy  , brc;
        String burcu ="";
        System.out.println("Doğum Yılınızı Girin : ");
        dy = dt.nextInt();
        brc = dy % 12;

        switch (brc){

            case 0:
                burcu = "Maymun" ;
                break;
            case 1:
                burcu ="Çin Zodyağı Burcunuz: Horoz ";
                break;
            case 2:
                burcu="Çin Zodyağı Burcunuz: Köpek ";
                break;
            case 3:
                burcu="Çin Zodyağı Burcunuz Domuz" ;
                break;
            case 4:
                burcu="Çin Zodyağı Burcunuz: Fare ";
                break;
            case 5:
                burcu="Çin Zodyağı Burcunuz: Öküz ";
                break;
            case 6:
                burcu="Çin Zodyağı Burcunuz: Kaplan ";
                break;
            case 7:
                burcu="Çin Zodyağı Burcunuz: Tavşan ";
                break;
            case 8:
                burcu="Çin Zodyağı Burcunuz: Ejderha ";
                break;
            case 9:
                burcu="Çin Zodyağı Burcunuz: Yılan ";
                break;
            case 10:
                    burcu="Çin Zodyağı Burcunuz: At ";
                break;
            case 11:
                burcu="Çin Zodyağı Burcunuz: Koyun ";
                break;
        }
        System.out.println(burcu);
    }
}
