class demo11
{
    void fun()
    {
        System.out.println("IN FUN METHOD ");

    }
    static void run()
    {
        System.out.println("IN RUN METHOD");

    }
    public static void main(String[]args)
    {
        demo11 obj= new demo11();
        obj.fun();
        obj.run();
    }
}