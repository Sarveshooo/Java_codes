class code15
{
    static void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    public static void main(String[]args)
    {
        fun();////type1



        code15.fun();//type2


        code15 obj=new code15();
        obj.fun();


    }
}