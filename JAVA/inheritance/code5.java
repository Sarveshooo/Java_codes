class Parent5
{
    int x=10;
    int y=20;
    Parent5()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
}
class Child5 extends Parent5
{
    int x=30;
    int y=40;
    Child5()
    {
        System.out.println("IN CHILD CONSTRUCTOR");
        System.out.println(super.x);
        System.out.println(super.y);

    }
    public static void main(String[]args)
    {
        Child5 obj=new Child5();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}