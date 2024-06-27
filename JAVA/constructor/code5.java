class code5
{
    int x=10;
    code5 (int x)
    {
        System.out.println("IN CONSTRUCTOR");
        System.out.println( x);
        System.out.println(this. x);
    }
    public static void main(String[]args)
    {
        code5 obj=new code5 (30);
        code5 obj2=new code5 (50);
        System.out.println(obj.x);
        System.out.println(obj2.x);
    }
}