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

    Double ObliczSilnia(){
        double X=0;
        double j=0;
            while(j<liczba) {
                j++;
                if (liczba == j) {
                    for (double i = 1; i <= liczba; i++) {
                        liczba = liczba * i;
                    }
                    return liczba ;
                }
                if(liczba<j)
                    return X;
            }
            return X ;
    }
}
