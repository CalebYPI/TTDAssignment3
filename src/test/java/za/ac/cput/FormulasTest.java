package za.ac.cput;

import org.junit.*;

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
    public void volumeEquality() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void volumeIdentity() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertSame(1, result);
    }

    @Test
    public void volumeFail() {
        Assert.fail("This test serves as a failure test");
    }

    @Test (timeout = 200)
    public void volumeTimeout() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertSame(1, result);
    }

    @Ignore
    @Test
    public void volumeDisable() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }

}
