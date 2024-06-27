class femo
{
    int x=10;
    int y=20;
    femo()
    {
        System.out.println("PARENT CONSTRUCTOR");
    }
void fun()
{
    System.out.println("IN FUN PARENT");
}
}
class bebo1 extends femo
{
    int x=30;
    int y=40;
    bebo1()
    {
        System.out.println("CHILD CONSTRUCTOR");
        System.out.println(super.x);
        System.out.println(super.y);
    }
    void fun()
    {
        System.out.println("IN FUN CHILD");
        super.fun();
    }
    public static void main(String[] args) {
        bebo1 obj=new bebo1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
    }

}
