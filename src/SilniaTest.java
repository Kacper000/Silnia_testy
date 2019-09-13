import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SilniaTest {

    @Test
    public void test1 () {
        Silnia liczba =new Silnia (3);
        Assertions.assertEquals(liczba.ObliczSilnia(3),6 );

    }
    @Test
    public void  test2 () {
        Silnia liczba =new Silnia (0);
        Assertions.assertEquals(liczba.ObliczSilnia(0),1 );

    }
    @Test
    public void test3 () {
        Silnia liczba =new Silnia (0.5);
        Assertions.assertEquals(liczba.ObliczSilnia(0.5),0);

    }
    @Test
    public void  test4 () {
        Silnia liczba =new Silnia (-1);
        Assertions.assertEquals(liczba.ObliczSilnia(-1),0 );

    }@Test
    public void  test5 () {
        Silnia liczba =new Silnia (-0.000000000002);
        Assertions.assertEquals(liczba.ObliczSilnia(-0.000000000002),0);

    }
    @Test
    public void  test6 () {
        Silnia liczba =new Silnia (0.00000000000002);
        Assertions.assertEquals(liczba.ObliczSilnia(0.00000000000002),0);

    }
    @Test
    public void  test7 () {
        Silnia liczba =new Silnia (-0.02);
        Assertions.assertEquals(liczba.ObliczSilnia(-0.02),0);

    }
    @Test
    public void  test8 () {
        Silnia liczba =new Silnia (3.5);
        Assertions.assertEquals(liczba.ObliczSilnia(3.5),0 );

    }
    @Test
    public void  test9 () {
        Silnia liczba =new Silnia (-4.5);
        Assertions.assertEquals(liczba.ObliczSilnia(-4.5),0 );

    }

}