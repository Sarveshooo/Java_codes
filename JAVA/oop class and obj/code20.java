class code20
{
    private int x=10;
    int y=20;
    private void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    void run()
    {
        System.out.println("IN RUN METHOD");
    }

}
class code111
{
    public static void main(String[]args)
    {
        code20 obj=new code20();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        obj.run();
    }
}