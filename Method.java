class Simpleinheritance{
int a=10;
int b=20;
void add(){
System.out.println(a+b);
}
void add(int a){
System.out.println(a+b);
}
}
class Simpleinheritance1 extends Simpleinheritance{
void add(){
int b=30;
System.out.println(a+b);
}
void sub(){
int a=20,b=40;
System.out.println(b-a);
}
}
public class Method{
public static void main(String[] args){
 Simpleinheritance1 s1=new Simpleinheritance1();
s1.add();
s1.sub();
s1.add(60);
}
}






