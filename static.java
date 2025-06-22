/*  1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method. 

class Static{
static int w=3;
static int x=2;
int y=4;
int z=6;
static {
System.out.println("static block3");
}
static {
System.out.println("static block4");
}
{
System.out.println("instance block3");
}
{
System.out.println("instance block4");
}
static void add1(){
System.out.println(w+x);
}
static void sub1(){
System.out.println(w-x);
}
void mul1(){
System.out.println(y*z);
}
void div1(){
System.out.println(z/y);
}
public static void main(String[] args){
Static s=new Static();
s.add1();
s.sub1();
s.mul1();
s.div1();
}
}

Output:
static block3
static block4
instance block3
instance block4
5
1
24
1  */



/*  2.Print instance variables in static methods
class Static 
{
int a = 2;
int b = 3;
static void method() 
{
Static s = new Static();  
System.out.println(s.a);     
System.out.println(s.b);         
}
public static void main(String[] args)
{   
System.out.println("Main Method");
method(); 
}
}

Output:
Main Method
2
3  */


/* 3.Print static variables in Instance methods 



class Static 
{ 
static int a=56;
static int b=68;
void ins()
{
System.out.println(a);
}
void inst()
{
System.out.println(b);
}
public static  void main(String[]  args)
{
System.out.println("Static  Main Method");
Static s= new Static();
s.ins();
s.inst();
}
}

Output:
Static  Main Method
56
68 */



/* 4.Call instance methods in static methods


class Static
{
void instance() 
{
System.out.println("Instance method ");
}
static void staticmethod() 
{
Static s = new Static();
s.instance();
}
public static void main(String[] args) {
System.out.println(" Main Method");
staticmethod();  
}
}

Output:
 Main Method
Instance method */

/* 5. Call static methods in instance methods 


class Static{
static void method()
{
System.out.println("Static Method");
}
void ins() 
{
method();
}
public static void main(String[] args) {
Static s = new Static();
s.ins(); 
}
}

Output:
Static Method */


/* 6. Print all the static, instance variables in main method 



class Static
{    
static int a = 10;
static int b = 20;
int c = 30;
int d = 40;
public static void main(String[] args) {
System.out.println("Static Variables:");
System.out.println( a);
System.out.println(b);
Static s = new Static();
System.out.println("Instance Variables:");
System.out.println(s.c );
System.out.println(s.d);
}
}


Output:

Static Variables:
10
20
Instance Variables:
30
40

*/


/*  7. Call static methods and instance methods in main method. 



class Static
{
static void a()
{
System.out.println("static method");
}
void ins()
{
System.out.println("instance method");
}
public static void main(String[] args)
{
System.out.println("Main method");
a();
Static s=new Static();
s.ins();
}
}

Output:
Main method
static method
instance method  */

