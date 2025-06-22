/*1.
import java.util.Scanner;
class Arrays2{
public static void main(String[] args) {
int[] a={2,5,6,9,1,6,3};
int target = 2;
int low = 0, high = a.length - 1, mid;
boolean found = false;
while (low <= high) {
mid = (low + high) / 2;
if (a[mid] == target) {
System.out.println("Element found at index: " + mid);
found = true;
break;
} 
else if (a[mid] < target) {
low = mid + 1;
} 
else {
high = mid - 1;
}
}
if (!found)
System.out.println("Element not found.");
}
}


Output:
Element found at index: 0  
*/



/* 2.
public class Arrays2{
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
Second largest number is: 15
*/


/* 3.
import java.util.Scanner;
public class Arrays2{
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
21 34 38 64 59
Minimum value: 21
Maximum value: 64  
*/



/* 5.
public class Arrays2{
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
7
*/


/* 6.
import java.util.Scanner;
public class Arrays2{
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
Number of odd numbers: 4 
 */

/* 8.
import java.util.Scanner;
public class Arrays2
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
12   
*/

/* 9.
import java.util.Scanner;
public class Arrays2
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
32  

*/

/* 10.
class Arrays2{
public static void main(String[] args) {
int[] arr = {1, 2, 3, 2, 1};
boolean isPalindrome = true;
for (int i = 0; i < arr.length / 2; i++) {
if (arr[i] != arr[arr.length - 1 - i]) {
isPalindrome = false;
break;
}
}
if (isPalindrome){
System.out.println("The array is a palindrome.");
}else{
System.out.println("The array is not a palindrome.");
}
}
}

Output:
The array is a palindrome.
*/



class Arrays2{
public static void main(String[] args) {
int[] arr = {34,45,8,13,52};
int sum = 0;
for (int num : arr) {
if (num % 2 == 0)
sum += num;
}
System.out.println("Sum of even numbers: " + sum);
}
}


/* 15. 
public class Arrays2{
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
Average is:3.0
*/
