class code3
{
    code3(int x)
    {
        System.out.println("IN CONSTRUCTOR");
        System.out.println(x);
        
    }
    public static void main(String[]args)
    {
        code3 obj=new code3(20);
        System.out.println(obj);
    }
}