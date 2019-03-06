package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FormulasTest {

    private Formulas formulas;

    @Before
    public void setUp() throws Exception {
        formulas = new Formulas();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void perimeter() {
        int result = formulas.perimeter(1, 1);
        Assert.assertEquals(4 ,result);
    }

    @Test
    public void area() {
        int result = formulas.area(1, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void volume() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }
}
