class code1
{
    int x=10;
    int y=20;
    code1()
    {
        System.out.println("IN CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
class demo
{
    public static void main(String[]args)
    {
        code1 obj=new code1();
        obj.fun();
    }
}