
public class Print_1toN{
 // print number in increasing order
 public static int Printdec(int n){
  if(n == 0){
   return 0;
  }
  System.out.print(n + " ");
  return Printdec(n-1);
 }
 // print numer in decreasing order

 public static void Printaec(int n){
  if(n == 0){
   return ;
  }
  Printaec(n-1);
  System.out.println(n);
 }
 public static void main(String[] args) {
  Printaec(10);
 }
}