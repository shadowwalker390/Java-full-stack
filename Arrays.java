/* 1. 
public class Arrays{
public static void main(String[] args){
int a[]={1,2,3,4,5};
int sum=0;
for( int i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("Sum is:"+sum);
}
}

Output:
Sum is:15  */


/* 2. 
public class Arrays{
public static void main(String[] args){
int a[]={1,2,3,4,5};
int sum=0;
float avg;
for( int i=0;i<a.length;i++){
sum=sum+a[i];
}
avg=sum/a.length;
System.out.println("Average is:"+avg);
}
}

Output:
Average is:3.0  */




/* 3. 
import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the value of an array:");
int n;
n=s.nextInt();
int a[]={40,50,80,10,90};
for(int i=0;i<a.length;i++){
if(a[i]==n){
System.out.println("Index value of " +a[i] + " is:" +i);
}
}
}
}

Output:
Enter the value of an array:80
Index value of 80 is:2

Enter the value of an array:50
Index value of 50 is:1  */


/* 4. 
import java.util.Scanner;
public class Arrays{
public static void main(String args[])
{
int n;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={10,20,30,40,50};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
found = true;
}
}
if(found)
{
System.out.println("found a specified value ");
}
else {
System.out.println(" not found a specified value");
}
}
}

Output:
Enter the value of n:30
found a specified value
Enter the value of n:5
not found a specified value  */





/* 5. 
import java.util.Scanner;
public class Arrays
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
int a[]={67,5,98,32,21};
System.out.print("Enter the value of n to remove from an array:");
n=s.nextInt();
int arr[]=new int[a.length-1];
for(int i=0,k=0;i<a.length;i++)
{
if(a[i]!=n)
{
 arr[k]=a[i];
 k++;
}
}
System.out.println("Array after removal:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}

Output:
Enter the value of n to remove from an array:21
Array after removal:
67
5
98
32  */



/* 6. 
import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
int i,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Display the values of array a:");
for(i=0;i<n;i++){
System.out.println(a[i]);
}
System.out.println("Display the values of array b:");
for(i=0;i<n;i++){
System.out.println(b[i]=a[i]);
}
s.close();
}
}


Output:
Enter the size of an array:
5
Enter the values of an array:34 76 89 43 21
Display the values of array a:
34
76
89
43
21
Display the values of array b:
34
76
89
43
21  */


/* 7. 
import java.util.Scanner;
public class Arrays
{
public static void main(String args[])
{
int n,position;
Scanner s=new Scanner(System.in);
int a[]={23,17,3,14,12};
System.out.print("Enter the value of n to insert into an array:");
n=s.nextInt();
System.out.print("Enter the position (0 to " + a.length + ") to insert n: ");
position=s.nextInt();
int arr[]=new int[a.length+1];
for(int i=0,k=0;i<arr.length;i++)
{
if(i == position)
{
 arr[i]=n;
}
else{
arr[i]=a[k];
k++;
}
}
System.out.println("Array after insertion:"); 
for(int val: arr )
{
System.out.println(val+ " ");
}
}
}


Output:
Enter the value of n to insert into an array:5
Enter the position (0 to 5) to insert n: 3
Array after insertion:
23
17
3
5
14
12   */


/* 8. 
import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of array:");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("Enter " + n + " values:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int min=a[0];
int max=a[0];
for(int i=1;i<n;i++){
if(a[i]<min){
min=a[i];
}
if(a[i]>max){
max=a[i];
}
}
System.out.println("Minimum value: " + min);
System.out.println("Maximum value: " + max);
s.close();
}
}


Output:
Enter the size of array:5
Enter 5 values:
37
62
17
21
23
Minimum value: 17
Maximum value: 62  */


/* 9. 
import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of array:");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("Enter " + n + " values:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Reversed Array:");
for(int i=n-1;i>=0;i--){
System.out.print(a[i]+ " ");
}
s.close();
}
}

Output:
D:\myjava>java Arrays
Enter the size of array:5
Enter 5 values:
4 7 8 3 1
Reversed Array:
1 3 8 7 4  */


/* 10. 
public class Arrays{
public static void main(String[] args){
int a[]={3,5,2,3,8,5,6};
System.out.println("Duplicate elements are:");
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]==a[j]){
System.out.println(a[i]);
}
}
}
}
}

Output:
Duplicate elements are:
3
5  */

/* 11. 
public class Arrays{
public static void main(String[] args){
int a1[]={1,3,5,7,9};
int a2[]={2,3,6,7,10};
System.out.println("Common elements are:");
for(int i=0;i<a1.length;i++){
for(int j=0;j<a2.length;j++){
if(a1[i]==a2[j]){
System.out.println(a1[i]);
}
}
}
}
}

Output:
Common elements are:
3
7  */


/* 12. 
import java.util.Scanner;
class Arrays{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}

Output:
Enter size: 10
Enter elements:
1 2 4 2 3 6 2 1 7 9
Array without duplicates: 1 2 4 3 6 7 9  */

/* 13. 
public class Arrays{
public static void main(String[] args){
int a[]= {5,10,20,8,15};
int largest = a[0];
int secondLargest = a[0];
for (int i = 1; i < a.length; i++){
if (a[i]>largest){
secondLargest = largest;
largest=a[i];
}
else if (a[i]>secondLargest && a[i]!=largest){
secondLargest=a[i];
}
}
System.out.println("Second largest number is: " + secondLargest);
}
}

Output:
Second largest number is: 15  */

/* 14.
public class Arrays{
public static void main(String[] args){
int a[]= {5,10,20,8,15};
int largest = a[0];
int secondLargest = a[0];
for (int i = 1; i < a.length; i++){
if (a[i]>largest){
secondLargest = largest;
largest=a[i];
}
else if (a[i]>secondLargest && a[i]!=largest){
secondLargest=a[i];
}
}
System.out.println("Second largest number is: " + secondLargest);
}
}

Output:
Second largest number is: 15  */

/* 15. 
import java.util.Scanner;
public class Arrays{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of array:");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int evenCount=0,oddCount=0;
for(int i=0;i<n;i++){
if(a[i]%2==0){
evenCount++;
}
else{
oddCount++;
}
}System.out.println("Number of even numbers: " + evenCount);
System.out.println("Number of odd numbers: " + oddCount);
s.close();
}
}

Output:
Enter the size of array:6
Enter the elements:
3 1  6 8 9 7
Number of even numbers: 2
Number of odd numbers: 4  */


/* 16.  
import java.util.Scanner;
class Arrays
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{
arr[i] = sc.nextInt();
}
int min = arr[0], max = arr[0];
for(int i=1; i<n; i++) {
if(arr[i]<min) {
min = arr[i];
}
if(arr[i]>max) 
{
max = arr[i];
}
}
System.out.println("Difference between max and min: " + (max - min));
}
}

Output:
Enter size: 5
Enter elements:
34 22 78 43 67
Difference between max and min: 56  */ 

/* 17.
public class Arrays{
public static void main(String[] args){
int a[]={10,12,5,23,7};
boolean found12=false;
boolean found23=false;
for(int i=0;i<a.length;i++){
if(a[i]==12){
found12=true;
}
if(a[i]==23){
found23=true;
}
}
if(found12 && found23){
System.out.println("Array has both 12 and 23");
}
else{
System.out.println("Array does not have both 12 and 23");
}
}
}


Output:
Array has both 12 and 23  */


/* 18.
import java.util.Scanner;
class Arrays{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}

Output:
Enter size: 10
Enter elements:
1 2 4 2 3 6 2 1 7 9
Array without duplicates: 1 2 4 3 6 7 9   */



/* 19. 
class Arrays{
public static void main(String[] args){
int[] a = {5,87,34,1,96,56};
int c;
for (int i = 0; i < a.length; i++) 
{
for (int j = i + 1; j < a.length; j++) 
{
if (a[i] < a[j]) 
{
c = a[i];
a[i] = a[j];
a[j] = c;
}
}
}
System.out.println("Second largest number is: " + a[1]);
}
}

Output:
Second largest number is: 87  */
