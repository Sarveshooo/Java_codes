class demo
{
    int x=10;
    int y=20;
    demo()
    {
        System.out.println("PARENT CONSTRUCTOR");
    }
void fun()
{
    System.out.println("IN FUN PARENT");
}
}
class bebo extends demo
{
    int x=30;
    int y=40;
    bebo()
    {
        System.out.println("CHILD CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println("IN FUN CHILD");
    }
    public static void main(String[] args) {
        bebo obj=new bebo();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
    }

}
