/* 1. public class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("* ");
}
System.out.println("* ");
}
}
}

Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *  */



/* 2. public class Patterns
{
public static void main (String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" ");
}
System.out.println( );
}
}
}

Output:
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5 */



/* 3. public class Patterns
{
public static void main (String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}

Output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

/* 4. public class Patterns
{
public static void main (String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}

Output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25 */


/* 5. public class Patterns
{
public static void main (String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+"  ");
n++;
if(n>9){
n=1;
}
}
System.out.println( );
}
}
} 

Output:
1  2  3  4  5
6  7  8  9  1
2  3  4  5  6
7  8  9  1  2
3  4  5  6  7  */



/* 6. public class Patterns
{
public static void main (String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+" ");
n+=2;
}
System.out.println();
}
}
} 

Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49 */


/* 7. public class Patterns
{
public static void main (String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
if(j%2==0){
System.out.print(0+" ");
}else{
System.out.print(1+" ");
}
}
System.out.println(" ");
}
}
}


Output:
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1 */


/* 8. public class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}

Output:
     *
    * *
   * * *
  * * * *
 * * * * *   */


/* 9. public class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print((2 * k)+ " ");
}
System.out.println();
}
}
}

Output:

     2
    2 4
   2 4 6
  2 4 6 8
 2 4 6 8 10  */
       

/* 10. public class Patterns{
public static void main(String[] args){
String word="INDIA";
for(int i=1;i<=word.length();i++)
{
System.out.println(word.substring(0,i));
}
}
}

Output:
I
IN
IND
INDI
INDIA */


/* 11. public class Patterns{
public static void main(String[] args){
for(int i=0;i<6;i++){
for(int j=1;j<6-i;j++){
System.out.print("  ");
}
for(int k=0;k<(2 * i - 1);k++){
System.out.print("* ");
}
System.out.println();
}
}
}

Output:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *   */

/* 12. public class Patterns{
public static void main(String[] args){
int n=4;
for (int i = 1; i <= n; i++){
for (int j = i; j < n; j++)
System.out.print(" ");
for(int j = 1; j <= (2 * i - 1); j++)
System.out.print("*");
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = n; j > i; j--)
System.out.print(" ");
for (int j = 1; j <= (2 * i - 1); j++)
System.out.print("*");
System.out.println();
}
}
} 

Output:
   *
  ***
 *****
*******
 *****
  ***
   * */ 


/*  13. public class Patterns {
public static void main(String[] args) {
int n = 4; 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" "); 
}
System.out.print("*");
if (i != 1) {
for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
System.out.print(" ");
}
System.out.print("*");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) {
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
System.out.print("*");
if (i != 1) {
for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
System.out.print(" ");
}
System.out.print("*");
}
System.out.println();
}
}
}

Output:
   *
  * *
 *   *
*     *
 *   *
  * *
   *    
*/


/* 14. public class Patterns{
public static void main(String[] args) {
int rows = 5;
int cols = 5; 
for (int i = 1; i <= rows; i++) {
if (i == 1 || i == rows) {
for (int j = 1; j <= cols; j++) {
System.out.print("* ");
}
} else {
System.out.print("*");
for (int j = 1; j <= (2 * cols - 3); j++) {
System.out.print(" ");
}
System.out.print("*");
}
System.out.println();
}
}
}

Output:
* * * * *
*       *
*       *
*       *
* * * * *

*/


/* 15.
public class Patterns{
public static void main(String[] args) {
int n = 7; 
int mid = n / 2 + 1; 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
if (i == mid || j == mid) {
System.out.print("* ");
} 
else{
System.out.print("  "); 
}
}
System.out.println();
}
}
}


Output:
      *
      *
      *
* * * * * * *
      *
      *
      *
*/


/* 16. public class Patterns {
public static void main(String[] args) {
int n = 7; 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
if (j == i || j == (n - i + 1)) {
System.out.print("*");
} 
else {
System.out.print(" "); 
}
}
System.out.println();
}
}
}


Output:
*     *
 *   *
  * *
   *
  * *
 *   *
*     *
  */

/* 19. public class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<=5;i++)
{
for(int j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}


Output:
0
*1
**2
***3
****4
*****5 */


