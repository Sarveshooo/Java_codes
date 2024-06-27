class Parent4
{
    int x=10;
    int y=20;
    Parent4()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
}
class Child4 extends Parent4
{
    int x=30;
    int y=40;
    Child4()
    {
        System.out.println("IN CHILD CONSTRUCTOR");
        //System.out.println(super.x);
        //System.out.println(super.y);

    }
    public static void main(String[]args)
    {
        Child4 obj=new Child4();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}