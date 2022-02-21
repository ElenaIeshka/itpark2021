package lesson21;


import junit.framework.Assert;
import lesson21.Calc.Calc;
import org.junit.jupiter.api.Test;




public class CalculatorTest {

    @Test
    public void shouldCalculatorCanCalculatorSumma() {
        Calc calc = new Calc(10, 15);
//        int result = calc.summa();
        org.junit.Assert.assertEquals(25,calc.summa());

        Calc calc2= new Calc(-10, 15);
        org.junit.Assert.assertEquals(5,calc2.summa());

        Calc calc3 = new Calc(0, 15);
        org.junit.Assert.assertEquals(15,calc3.summa());

    }
    @Test
    public void shouldCalculatorCanCalculateDivision() {
        Calc calc = new Calc(15, 3);
        org.junit.Assert.assertEquals(5,calc.divisidion());

        Calc calc2 = new Calc(49, 7);
        org.junit.Assert.assertEquals(7,calc2.divisidion());

    }

    @org.junit.Test (expected = ArithmeticException.class,timeout = 1000)
//    так должно быть, но у меня не работает
    public void shouldCalculatorCanCalculateDivision1() {
        Calc calc = new Calc(15, 0);
        calc.divisidion();

//        try {
//            calc.divisidion();
//            Assert.fail();
//        }catch (ArithmeticException e){
//            Assert.assertTrue(true);
//        } так не очень, лучше не делать

    }
}
