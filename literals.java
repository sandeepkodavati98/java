class literals
{
    public static void main(String args[])
    {
        System.out.println("integer_using_literal");
        int a = 10;
        System.out.print("the decimal literal is : ");
        System.out.println(a);
        System.out.print("the binary literal is: ");
        int b = 0b1010;
        System.out.println(b);
        System.out.print("the hexadecimal literal is: ");
        int c = 0X456;
        System.out.println(c);
        System.out.print("the octal literal is: ");
        float f = 0234f;
        System.out.println(f);
        System.out.println("underscore as a literal");
        int num1 = 1_000_000;
        float num2 = 3.4_345f;
        double num3 = 2.5_456d;    
    }
}
