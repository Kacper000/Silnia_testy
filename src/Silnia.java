public class Silnia {
    double liczba;

    public Silnia(double liczba) {
        this.liczba = liczba;
    }

    /*Fraza "nie istnieje" jest zastąpiona przez zmienną X=0,
     ponieważ nie umiem umieścić String w funkcji Double
     ale chociaż DZIAŁA*/

    /*Ponadto nie wiem dlaczego test1 sie nie odpala tzn.
    nie może się dokonać zupełnie jakby miał robić
    to w nieskończoność. Double.MAX_VALUE nie dawałem
    bo komputer uległby autodestruckji*/

    /*POZDRO 600*/

    double ObliczSilnia(double liczba) {

        if (liczba > 0) {
            return liczba*ObliczSilnia(liczba-1);
        }
        else if( liczba==0)
            return Double.valueOf(1);
        else
            return Double.valueOf(0);

    }
}
