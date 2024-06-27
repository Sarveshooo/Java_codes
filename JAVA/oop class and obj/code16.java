class code16
{
    void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    static void run()
    {
        System.out.println("IN RUN METHOD");
    }

}
class code99
{
    public static void main(String[]args)

    {
        System.out.println("IN MAIN METHOD");
        code16.run();
        code16 obj =new code16();
        obj.fun();
    }
}