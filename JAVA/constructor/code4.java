class code4
{
    int x=10;
    code4 (int x)
    {
        System.out.println("IN CONSTRUCTOR");
        System.out.println( x);
        System.out.println(this. x);
    }
    public static void main(String[]args)
    {
        code4 obj=new code4(30);
    }
}