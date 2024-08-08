
public class Fectorial {
 public static int Fectorial(int x){
  if (x == 0) {
   return 1;
  }
  int fn  = Fectorial(x)*Fectorial(x-1);
  return fn;
 }

 public static void main(String[] args) {
  System.out.println(Fectorial(5));
 }
}
