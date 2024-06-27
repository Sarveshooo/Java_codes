////MULTIPLE INHERITANCE

import javax.sound.sampled.SourceDataLine;

class PARENT
{
    PARENT()
    {
        System.out.println("IN PARENT CONSTRUCTOR 1");
    }
}
class PARENT1
{
    PARENT1()
    {
        System.out.println("PARENT CONSTRUCTOR 2");
    }
}
class CHILD extends PARENT,PARENT1
{
    CHILD()
    [
        System.out.println("CHILD CONSTRUCTOR")

    ]

}
