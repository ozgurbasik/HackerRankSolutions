import java.util.*; 


class Main {

  public static int FirstFactorial(int num) {
    int res = 1;
    for(int i = 1; i <= num; i++){
      res = i * res;} 
      num = res; 
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    System.out.print(FirstFactorial(a));
    s.close(); 
  }

}