package fr.linsolas;

import static fr.linsolas.FooBarQix.getFooBarQix;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Basic JUnit tests.
 * 
 * @author Romain Linsolas
 */
public class FooBarQixTest {

    @Test
    public void value_unchanged() {
        assertEquals("1", getFooBarQix(1));
        assertEquals("2", getFooBarQix(2));
        assertEquals("4", getFooBarQix(4));
        assertEquals("8", getFooBarQix(8));
        assertEquals("11", getFooBarQix(11));
    }

    @Test
    public void return_foo_for_modulo_3() {
        assertEquals("Foo", getFooBarQix(6));
        assertEquals("Foo", getFooBarQix(12));
        assertEquals("Foo", getFooBarQix(18));
        assertEquals("Foo", getFooBarQix(24));
    }

    @Test
    public void return_bar_for_modulo_5() {
        assertEquals("Bar", getFooBarQix(10));
        assertEquals("Bar", getFooBarQix(20));
        assertEquals("Bar", getFooBarQix(40));
    }

    @Test
    public void return_qix_for_modulo_7() {
        assertEquals("Qix", getFooBarQix(14));
        assertEquals("Qix", getFooBarQix(28));
        assertEquals("Qix", getFooBarQix(49));
    }

    @Test
    public void return_foo_for_starting_with_3() {
        assertEquals("Foo", getFooBarQix(31));
        assertEquals("Foo", getFooBarQix(32));
        assertEquals("Foo", getFooBarQix(34));
        assertEquals("Foo", getFooBarQix(38));
    }

    @Test
    public void return_bar_for_starting_with_5() {
        assertEquals("Bar", getFooBarQix(52));
        assertEquals("Bar", getFooBarQix(58));
        assertEquals("Bar", getFooBarQix(59));
    }

    @Test
    public void return_qix_for_starting_with_7() {
        assertEquals("Qix", getFooBarQix(71));
        assertEquals("Qix", getFooBarQix(74));
        assertEquals("Qix", getFooBarQix(76));
    }

    @Test
    public void test_mixed() {
        assertEquals("FooFoo", getFooBarQix(3));
        assertEquals("BarBar", getFooBarQix(5));
        assertEquals("QixQix", getFooBarQix(7));
        assertEquals("FooBarBar", getFooBarQix(15));
        assertEquals("FooQix", getFooBarQix(21));
    }

}
