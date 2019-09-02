import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SilniaTest {

    @Test
    public void  test1 () {
        Silnia liczba =new Silnia (3);
        Assertions.assertEquals(liczba.ObliczSilnia(),6 );

    }
}