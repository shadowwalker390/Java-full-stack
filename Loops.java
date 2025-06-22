/* 1. class Loops {
public static void main(String[] args) {
for (int i=0;i<10;i++) {
System.out.println("Bright IT Career");
}
}
}

Output:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career */


/* 2. public class Loops {
public static void main(String[] args) {
int i = 1;
while (i <= 20) {
System.out.println(i);
i++;
}
}
}

Output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20 */

/* 3.  public class Loops{
public static void main(String[] args){
int a = 6;
int b = 5;
int c = 6;
System.out.println("a is equal to b :" + (a==b));
System.out.println("a is equal to c :" + (a==c));
System.out.println("a is not equal to b :" + (a!=b));
System.out.println("a is not equal to c :" + (a!=c));
}
}

Output:
a is equal to b :false
a is equal to c :true
a is not equal to b :true
a is not equal to c :false */



/* 4. import java.util.Scanner;
public class Loops{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter the value of n:");
n=s.nextInt();
System.out.println("Even Numbers are:");
for(int i=0;i<n;i++){
if(i%2==0){
System.out.println(i+ " ");
}
}
System.out.println("Odd numbers are:");
for(int i=0;i<n;i++){
if(i%2!=0){
System.out.println(i+ " ");
}
}
}
}


Output:
Enter the value of n:
20
Even Numbers are:
0
2
4
6
8
10
12
14
16
18
Odd numbers are:
1
3
5
7
9
11
13
15
17
19 */


/* 5. public class Loops{
public static void main(String [] args){
int a=27;
int b=54;
int c=32;
if((a>b)&&(a>c)) {
System.out.println("a is largest");
}
else if((b>a)&&(b>c)){
System.out.println("b is largest");
}
else{
System.out.println("c is largest");
}
}
}

Output:
b is largest */


/* 6. import java.util.Scanner;
public class Loops{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the values of n between 10 to 100:");
n=s.nextInt();
while(n<100){
if(n%2==0){
System.out.print(n +" ");
}
n++;
}
}
}


Output:
Enter the values of n between 10 to 100:50
50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 */


/* 7. public class Loops{
public static void main(String[] args){
int i=1;
do{
System.out.print(i+ " ");
i++;
}while(i<=10);
}
}


Output:
1 2 3 4 5 6 7 8 9 10 */



/* 8.import java.util.Scanner;
public class Loops{
public static void main(String[] args){
int n,sum=0,rem,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n>0){
rem=n%10;
sum+=(rem*rem*rem);
n/=10;
}
if(i==sum){
System.out.println(i+" is an Armstrong Number");
}
else{
System.out.println(i+" is not an Armstrong Number");
}
}
}


Output:
Enter the value of n:
371
371 is an Armstrong Number
Enter the value of n:
234
234 is not an Armstrong Number */




/* 9. import java.util.Scanner;
public class Loops{
public static void main(String args[])
{
int n ,i,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if(n % i==0){
count++;
}
}
if(count==2)
{
System.out.println( n+  " is a prime");
}
else{
System.out.println(n+  " is not a prime");
}
}
} 


Output:
Enter the value of n:2
2 is a prime
Enter the value of n:1
1 is not a prime  */




/* 10. import java.util.Scanner;
public class Loops{
public static void main(String[] args){
int n,rev=0,i,digit;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n>0){
digit=n%10;
rev=(rev*10)+digit;
n=n/10;
}
if(i==rev){
System.out.println(i+ " is a Palindrome");
}
else{
System.out.println(i+ " is not a Palindrome");
}
}
} 


Output:
Enter the value of n:
1551
1551 is a Palindrome
Enter the value of n:
567
567 is not a Palindrome */



/* 11. import java.util.Scanner;
public class Loops{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n = s.nextInt();
switch(n%2){
case 0:
System.out.println( n + " is an even number ");
break;
case 1:
System.out.println( n + " is an odd number ");
break;
default:
System.out.println("Invalid input");
}
}
}

Ouput:
Enter the value of n:
4
4 is an even number
Enter the value of n:
7
7 is an odd number */


/* 12.  import java.util.Scanner;
public class Loops{
public static void main(String args[])
{
char gender;
Scanner s=new Scanner(System.in);
System.out.print("Enter the gender(M/F):");
char genderChar=s.next().charAt(0);
switch(genderChar)
{
case 'M':
case 'm':
System.out.println("Male");
break;
case 'F':
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Transgender");
}
}
}

Output:
Enter the gender(M/F):m
Male
Enter the gender(M/F):f
Female */

/* 13. public class Loops{
public static void main(String[] args) {
int a = 10;
int b = 20;
int c = 30;
int largest;

if (a>=b && a>=c) {
largest=a;
} 
else if (b>=a && b>=c) {
largest=b;
} 
else {
largest=c;
}
System.out.println("The largest number is: " + largest);
}
} 


Output:
The largest number is: 30 */

