public class Silnia {
    double liczba;

    public Silnia(double liczba) {
        this.liczba = liczba;
    }

    Double ObliczSilnia(){

        for(double i=1; i<=liczba; i++)
        {
            liczba=liczba*i;
        }
        return liczba;
    }
}
