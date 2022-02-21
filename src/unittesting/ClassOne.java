package unittesting;

import java.lang.reflect.Field;

public class ClassOne{

    public static void main(String []args){
        /*System.out.println("Accessing private fields through public methods!");
        MyClass mc = new MyClass();
        mc.setNumber(99);
        mc.setName("BanuManoharan");
        System.out.println(mc.getNumber());
        System.out.println(mc.getName());*/

        System.out.println("Accessing private fields through reflection!");
        MyClass mc = new MyClass();
        try {
            Field f1 = MyClass.class.getDeclaredField("number");
            f1.setAccessible(true);
            mc.setNumber(5005);
            int n = (Integer)f1.get(mc);
            System.out.println("Number :"+n);

            Field f2 = MyClass.class.getDeclaredField("name");
            f2.setAccessible(true);
            mc.setName("MAS");
            String s = (String)f2.get(mc);
            System.out.println("Name :"+s);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

class MyClass
{
    //private fields
    private int number;
    private String name;

    //Accessing private fields through public methods
    public void setNumber(int n)
    {
        number = n;
    }

    public void setName(String pname)
    {
        name = pname;
    }

    public int getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }
}