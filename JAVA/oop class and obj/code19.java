class code19
{
    int x=10;
    static int y=20;
    void fun()
    {
        System.out.println("IN FUN METHOD");

    }
    static void run()
    {
        System.out.println("IN RUN METHOD");
    }

}
class code102
{
    public static void main(String[]args)
    {
        System.out.println("IN MAIN METHOD");
        code19 obj=new code19();
        obj.fun();
        obj.run();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}