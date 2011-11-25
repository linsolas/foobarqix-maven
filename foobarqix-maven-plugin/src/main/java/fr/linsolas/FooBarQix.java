package fr.linsolas;

/**
 * Utility class to calculate FooBarQix.
 * 
 * @author Romain Linsolas
 */
public final class FooBarQix {

    private static final String FOO = "Foo";

    private static final String BAR = "Bar";

    private static final String QIX = "Qix";

    public static String getFooBarQix(int nb) {
        String val = String.valueOf(nb);
        StringBuffer sb = new StringBuffer();
        sb.append(nb % 3 == 0 ? FOO : "");
        sb.append(nb % 5 == 0 ? BAR : "");
        sb.append(nb % 7 == 0 ? QIX : "");

        for (char c : val.toCharArray()) {
            switch (c) {
                case '3':
                    sb.append(FOO);
                    break;
                case '5':
                    sb.append(BAR);
                    break;
                case '7':
                    sb.append(QIX);
                    break;
            }
        }
        sb.append(sb.length() == 0 ? val : "");
        return sb.toString();
    }

}