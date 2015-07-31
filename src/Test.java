class Test
{
    public static void main(String[] args)
    {
        testSum();
        testDiv();
    }

 private static void tesDiv()
    {
        int a = 30;
        int b = 6;
        int expected = 5;
        BasicMath bm = new BasicMath();
        int result = bm.division(a, b);
        if (result == expected)
        {
            System.out.println("division: OK");
        }
        else
        {
            System.out.println("diviosion: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
