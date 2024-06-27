class Parent3
{
    int x=10;
    int y=20;
    Parent3()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
}
class Child3 extends Parent3
{
    Child3()
    {
        System.out.println("IN CHILD CONSTRUCTOR");

    }
    public static void main(String[]args)
    {
        Child3 obj=new Child3();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}