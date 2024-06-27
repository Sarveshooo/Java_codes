class demo5
{
    int x=10;
    String str1 ="kanha";
    static String str2="kanha";
    String str3= new String("kanha");
    static String str4=new String("kanha");
    public static void main(String[]args)
    {
        demo5 obj=new demo5();
        System.out.println(obj.x);
        System.out.println(obj.str1);
        System.out.println(obj.str3);
        System.out.println(str2);
        System.out.println(str4);
    }
}
