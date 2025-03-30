package homework1;

import java.util.Scanner;
import java.util.Random;

public class hw1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task1Lakcim(sc);
        
        task2Pitagorasz(sc);
        
        task3Uzemanyag(sc);
        
        task4Teglalap(sc);
        
        task5Kor(sc);
        
        task6AtlagHarom(sc);
        
        task7EuroFT(sc);
        
        task8KockaDobas();
        
        task9Zoldseges(sc);
        
        task10Kocka(sc);
     
        sc.close();
    }
    
    public static void task1Lakcim(Scanner sc) {
        System.out.println("1. Feladat: Lakcím beolvasása");
        System.out.print("Kérem adja meg az irányítószámot: ");
        String iranyitoszam = sc.nextLine();
        System.out.print("Kérem adja meg a várost: ");
        String varos = sc.nextLine();
        System.out.print("Kérem adja meg az utca nevét: ");
        String utca = sc.nextLine();
        System.out.print("Kérem adja meg a házszámot: ");
        String hazszam = sc.nextLine();
        
        System.out.println("Lakcím: " + iranyitoszam + " " + varos + ", " + utca + " " + hazszam + ".");
        System.out.println("-----------------------------------");
    }

    public static void task2Pitagorasz(Scanner sc) {
        System.out.println("2. Feladat: Pitagorasz-tétel alkalmazása");
        System.out.print("Kérem adja meg az első befogót: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a második befogót: ");
        double b = sc.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Az átfogó hossza: " + c);
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
    
    public static void task3Uzemanyag(Scanner sc) {
        System.out.println("3. Feladat: Útiköltség számítása");
        System.out.print("Kérem adja meg az autó fogyasztását (liter/100km): ");
        double fogyasztas = sc.nextDouble();
        System.out.print("Kérem adja meg a benzin árát (Ft/liter): ");
        double benzinAr = sc.nextDouble();
        System.out.print("Kérem adja meg az út hosszát (km): ");
        double utHossza = sc.nextDouble();
        double koltseg = (fogyasztas / 100.0) * utHossza * benzinAr;
        System.out.println("Az útiköltség: " + koltseg + " Ft");
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
    
    public static void task4Teglalap(Scanner sc) {
        System.out.println("4. Feladat: Téglalap kerület és terület számítása");
        System.out.print("Kérem adja meg a téglalap egyik oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a téglalap másik oldalát: ");
        double b = sc.nextDouble();
        double kerulet = 2 * (a + b);
        double terulet = a * b;
        System.out.println("Kerület: " + kerulet);
        System.out.println("Terület: " + terulet);
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
    
    public static void task5Kor(Scanner sc) {
        System.out.println("5. Feladat: Kör kerület és terület számítása");
        System.out.print("Kérem adja meg a kör sugarát: ");
        double r = sc.nextDouble();
        double kerulet = 2 * Math.PI * r;
        double terulet = Math.PI * r * r;
        System.out.println("Kerület: " + kerulet);
        System.out.println("Terület: " + terulet);
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
    
    public static void task6AtlagHarom(Scanner sc) {
        System.out.println("6. Feladat: Három egész szám átlaga");
        System.out.print("Kérem adja meg az első számot: ");
        int num1 = sc.nextInt();
        System.out.print("Kérem adja meg a második számot: ");
        int num2 = sc.nextInt();
        System.out.print("Kérem adja meg a harmadik számot: ");
        int num3 = sc.nextInt();
        double atlag = (num1 + num2 + num3) / 3.0;
        System.out.println("Átlag: " + atlag);
        System.out.println("-----------------------------------");
        sc.nextLine();
    }

    public static void task7EuroFT(Scanner sc) {
        System.out.println("7. Feladat: Euró Ft átváltás");
        System.out.print("Kérem adja meg az Euró árfolyamát (1€ hány Ft): ");
        double arfolyam = sc.nextDouble();
        System.out.print("Kérem adja meg az átváltandó Euró mennyiségét: ");
        double euro = sc.nextDouble();
        double eredmeny = arfolyam * euro;
        System.out.println(euro + " Euró = " + eredmeny + " Ft");
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
    

    public static void task8KockaDobas() {
        System.out.println("8. Feladat: Kockadobás");
        Random rand = new Random();
        int eredmeny = rand.nextInt(6) + 1;
        System.out.println("A kockadobás eredménye: " + eredmeny);
        System.out.println("-----------------------------------");
    }
    
 
    public static void task9Zoldseges(Scanner sc) {
        System.out.println("9. Feladat: Zöldséges vásárlás");
        double arAlma = 240;   
        double arSzilva = 310; 
        double arSzolo = 650;  
        
        System.out.println("Árak: Alma: " + arAlma + " Ft/kg, Szilva: " + arSzilva + " Ft/kg, Szőlő: " + arSzolo + " Ft/kg.");
        System.out.print("Kérem adja meg az alma mennyiségét (kg): ");
        double kgAlma = sc.nextDouble();
        System.out.print("Kérem adja meg a szilva mennyiségét (kg): ");
        double kgSzilva = sc.nextDouble();
        System.out.print("Kérem adja meg a szőlő mennyiségét (kg): ");
        double kgSzolo = sc.nextDouble();
        
        double osszegAlma = kgAlma * arAlma;
        double osszegSzilva = kgSzilva * arSzilva;
        double osszegSzolo = kgSzolo * arSzolo;
        double vegosszeg = osszegAlma + osszegSzilva + osszegSzolo;
        
        System.out.println("Alma: " + kgAlma + " kg, ár: " + osszegAlma + " Ft");
        System.out.println("Szilva: " + kgSzilva + " kg, ár: " + osszegSzilva + " Ft");
        System.out.println("Szőlő: " + kgSzolo + " kg, ár: " + osszegSzolo + " Ft");
        System.out.println("Végösszeg: " + vegosszeg + " Ft");
        System.out.println("-----------------------------------");
        sc.nextLine();
    }

    public static void task10Kocka(Scanner sc) {
        System.out.println("10. Feladat: Kocka felszín és térfogat számítása");
        System.out.print("Kérem adja meg a kocka élhosszát: ");
        double a = sc.nextDouble();
        double felszin = 6 * a * a;
        double terfogat = a * a * a;
        System.out.println("Kocka felszíne: " + felszin);
        System.out.println("Kocka térfogata: " + terfogat);
        System.out.println("-----------------------------------");
        sc.nextLine();
    }
}
