package fr.linsolas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.linsolas.FooBarQix;

/**
 * Test all values from 1 to 100 using Parameterized JUnit annotation.
 * 
 * @author Romain Linsolas
 */
@RunWith(Parameterized.class)
public class FooBarQixAllTest {

    @Parameters
    public static List<Object[]> getArray() {
        List<Object[]> list = new ArrayList<Object[]>();
        for (int i = 0; i < INDEX.length; i++) {
            list.add(new Object[] { INDEX[i], RESULT[i] });
        }
        return list;
    }

    private static final int[] INDEX = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
            23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
            50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76,
            77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

    private static final String[] RESULT = { "1", "2", "FooFoo", "4", "BarBar", "Foo", "QixQix", "8", "Foo", "Bar",
            "11", "Foo", "Foo", "Qix", "FooBarBar", "16", "Qix", "Foo", "19", "Bar", "FooQix", "22", "Foo", "Foo",
            "BarBar", "26", "FooQix", "Qix", "29", "FooBarFoo", "Foo", "Foo", "FooFooFoo", "Foo", "BarQixFooBar",
            "FooFoo", "FooQix", "Foo", "FooFoo", "Bar", "41", "FooQix", "Foo", "44", "FooBarBar", "46", "Qix", "Foo",
            "Qix", "BarBar", "FooBar", "Bar", "BarFoo", "FooBar", "BarBarBar", "QixBar", "FooBarQix", "Bar", "Bar",
            "FooBar", "61", "62", "FooQixFoo", "64", "BarBar", "Foo", "Qix", "68", "Foo", "BarQixQix", "Qix", "FooQix",
            "QixFoo", "Qix", "FooBarQixBar", "Qix", "QixQixQix", "FooQix", "Qix", "Bar", "Foo", "82", "Foo", "FooQix",
            "BarBar", "86", "FooQix", "88", "89", "FooBar", "Qix", "92", "FooFoo", "94", "BarBar", "Foo", "Qix", "Qix",
            "Foo", "Bar" };

    private int index;

    private String result;

    public FooBarQixAllTest(int index, String result) {
        this.index = index;
        this.result = result;
    }

    @Test
    public void testFooBarQix() {
        assertEquals(result, FooBarQix.getFooBarQix(index));
    }

}
