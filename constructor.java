import java.io.*;
class area
{
area(int a,int b)
{
System.out.println("the area of the rectangle "+(a*b));
}
area(int a,int b,int c)
{
System.out.println("area of the cuboid "+(a*b*c));
}
}
class constructor
{
public static void main(String args[])
{
area f=new area(1,2);
area g=new area(1,4,5);
}
}
