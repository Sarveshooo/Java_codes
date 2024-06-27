class code18
{
    int x=10;
    static int y=20;
    void fun()
    {
        System.out.println("IN FUN METHOD");
    }
    static void run() {
        System.out.println("IN RUN METHOD");

    }
        }
    class code101
    {
        public static void main(String[]args)
        {
            System.out.println(code18.y);
            code18.run();
        }
    }
