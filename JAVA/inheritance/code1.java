class parent
{
    int x =10;
    void fun()
    {
        System.out.println("IN FUN METHOD");
    }
}
class child extends parent
{

}
class client
{
    public static void main(String[] args) 
    {
        child obj=new child();
        System.out.println(obj.x);
        obj.fun();

        
    }




}