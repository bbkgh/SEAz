class Test
{
    public static void main(String[] args)
    {
        testSum();
        testMul();
        
    }
 private static void testMul()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.mul(a, b);
        if (result == expected)
        {
            System.out.println("mul: OK");
        }
        else
        {
            System.out.println("mul: Failed, expected = " + expected + ", result = " + result);
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
