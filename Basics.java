/* 1. class Basics
{
public void sign()
{
System.out.println("Yeshoda Gantyada");
}
public static void main(String[] args)
{
Basics b=new Basics();
b.sign();
}
}

Output:
Yeshoda Gantyada  */


/* 2. public class Basics
 {
public static void main(String[] args)
{
System.out.println("G.Yeshoda");
}
}

Output:
G.Yeshoda  */

/* 3. class Basics
{
       /**void sign()
	{
	   System.out.println("G.Yeshoda");
	}*/
	/*public static void main(String[] args)
	{
	   /* Basics b=new Basics();
                    b.sign();*/
	 /*System.out.println("3rd Year");
                    /*System.out.println("ECE");
	}
}

 Output:
3rd Year
ECE   */



/* 4. class Basics
{
    public static void main(String[] args)
    {
        int a=24;
        boolean b=true;
        char c='A';
        float d= 3.14f;   
        double e= 99.99;
        
        System.out.println("Integer value: "+a);
        System.out.println("Boolean value: "+b);
        System.out.println("Character value: "+c);
        System.out.println("Float value: " +d);
        System.out.println("Double value: " +e);
    }
}

Output:
Integer value: 24
Boolean value: true
Character value: A
Float value: 3.14
Double value: 99.99  */

/* 5. public class Basics 
{
int x = 3;
public void local() {
int x = 7;
System.out.println("Local variable : " + x);   
}
public static void main(String[] args) 
{
Basics b = new Basics();
b.local();
System.out.println("Global Variable: "+b.x);
}
}

Output:
Local variable : 7
Global Variable: 3  */

/* 6. class Basics
{
public void hello()
{
System.out.println("Yeshoda");
}
public static void main(String[] args) 
{
Basics b=new Basics();
b.hello();
}
}

Output:
Yeshoda */