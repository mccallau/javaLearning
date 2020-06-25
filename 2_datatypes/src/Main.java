public class Main {

    public static void main(String[] args) {

        // Byte, short, int, long

        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println(minbyte);
        System.out.println(maxbyte);

        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println(minshort);
        System.out.println(maxshort);

        long minlong = Long.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        System.out.println(minlong+maxshort);
        System.out.println(maxlong);

        long longlit = 3000000000L;

        byte newbyte = (byte) (minbyte / 2); // Casting

        // Challenge

        byte cbyte = 53;
        short cshort = 12312;
        int cint = 34235435;
        long clong = (long) (50000+(10*(cbyte+cshort+cint)));
        System.out.println(clong);

        // Float and double

        float minfloat = Float.MIN_VALUE;
        float maxfloat = Float.MAX_VALUE;
        System.out.println(minfloat);
        System.out.println(maxfloat);

        double mindouble = Double.MIN_VALUE;
        double maxdouble = Double.MAX_VALUE;
        System.out.println(mindouble);
        System.out.println(maxdouble);

        // Char, boolean

        char newchar = 'c';
        char newunicode = '\u0DA4';
        System.out.println(newchar);
        System.out.println(newunicode);

        boolean newbool = true;
        newbool = false;
        System.out.println(newbool);

        // String

        String newstr = "string";
        System.out.println(newstr);
    }
}
