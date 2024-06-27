class code21
{
    int x=10;
    private int y=20;

    void fun()
    {
        System.out.println("IN METHOD FUN");
    }
    private void run()
    {
        System.out.println("IN RUN METHOD");
    }
    public static void main(String[]args)
    {

    
    code21 obj=new code21();
    System.out.println(obj.x);
    System.out.println(obj.y);
    obj.fun();
    obj.run();
    }
    



}