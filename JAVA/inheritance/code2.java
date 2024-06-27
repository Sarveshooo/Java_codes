class parent1
{
    parent1()
    {
        System.out.println("IN PARENT CONSTRUCTOR");
    }
}
class child1 extends parent1
{
    child1()
    {
        System.out.println("IN CHILD CONSTRUCTOR");
    }
}
class client1
{
    public static void main(String[] args) 
    {
        child1 obj1=new child1();
        System.out.println("END MAIN");
        
    }
}