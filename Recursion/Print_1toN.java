
public class Print_1toN{
 public static int Printdec(int n){
  if(n == 0){
   return 0;
  }
  System.out.print(n + " ");
  return Printdec(n-1);
 }
 public static void main(String[] args) {
  Printdec(10);
 }
}