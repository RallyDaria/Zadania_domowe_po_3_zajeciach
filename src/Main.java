import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Witam w Nowej GRZE "+
                "Jesteś gotowy na nową przygode ???  " +
                "Potrzebuje kilka informacji o Twojej POSTACI:");
        System.out.println("Jak będzie nazywać się Twoja POSTAĆ:");
        String name=sc.next();
        System.out.println("Wybierz Klase postaci");
        String klass=sc.next();
        System.out.println("Ile punktów siły ma posiadać Twoja POSTAĆ ?");
        int punktySily=sc.nextInt();
        System.out.println("Ile punktów Many ma posiadać Twoja POSTAĆ ?");
        int punktyMany=sc.nextInt();
        System.out.println("Czy to Twoja nowa POSTAĆ wpisz true or false");
        boolean nowaPostac=sc.nextBoolean();
        Hero postac=new Hero(name,klass,punktySily,punktyMany,nowaPostac);
        System.out.println("Brawo właśnie stworzyłeś nową POSTAĆ     a oto jej specyfikacja :\nName:  " + postac.showName()+
                "\nKlass:  " + postac.showKlass() + "\nSiła:  " +postac.showPunktySily()+"\nSiłaMana:  "+ postac.showPunktyMana()+
                "\nMoc uderzenie:    " + postac.moc_postaci() +"\n"+"Czy to Twoja nowa postać?  "+postac.showNowaPostac())  ;


    }


}

