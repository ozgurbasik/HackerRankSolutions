import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class test1 {
    public boolean canWin(int[] arr , int lep){
    int leap = lep;
    int[] game = arr;
    ArrayList<Integer> list = new ArrayList<>();
    int altr_path_count = 0; 
    int current_step = 0;
    boolean ans = false;
    try{        
    while (true) {
    //Check For Win
    if((current_step + 1) >= game.length-1 || (current_step + leap) >= game.length-1){ans = true;break;}
    
    //Set Alteernate Path
    if(game[current_step + leap] == 0 && game[current_step+1] == 0){
      //System.out.println("Altr Path found index: " + current_step);
      list.add(current_step);altr_path_count+=1;}

    //Step
    if(game[current_step+1] == 0){
      //System.out.println("Step");
      current_step+=1;continue;}

    //Jump
    if(game[current_step + leap] == 0){
      //System.out.println("Jump");
      current_step+=leap;continue;}

    //Look for Alternate Path
    if(altr_path_count > 0){
      //Show Altr List before jump
      /*System.out.println("Altr path found");
      System.out.print("Altr path list:");
      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i) + " / ");
    }
    System.out.println("");*/
    //Choose Alternate Path
    //System.out.println("Current step set to: "+list.get(altr_path_count-1));
    current_step = list.get(altr_path_count-1);list.remove(altr_path_count-1);altr_path_count-=1;

    /*System.out.print("Altr path updated list:");
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i) + " / ");
  }*/

  //System.out.println("");
    //Jump
    //System.out.println("Jump");
    current_step+=leap;continue;
  }
    // NO Step - Jump - Altr Path
    //System.out.println("NO Step - Jump - Altr Path");
    break;  
        }
      }
        catch(ArrayIndexOutOfBoundsException e){}
        return ans;
    }


    public static void main(String[] args) {
        test1 a = new test1();
        Scanner s = new Scanner(System.in);
        int[] elements_and_leap = new int[2];
        System.out.println("Number of queries:");
        int queries = s.nextInt(); // Queries

        if (1 > queries || queries > 5000) {
            System.exit(0);
        }

        try {
            FileWriter fileWriter = new FileWriter("outputs.txt"); // Create a FileWriter to write to a file
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < queries; i++) {
                System.out.println("Num elements and leap:");
                for (int c = 0; c < 2; c++) {
                    int add = s.nextInt();
                    elements_and_leap[c] = add;
                }

                int size = elements_and_leap[0];
                if (2 > size || size > 100) {
                    System.exit(0);
                }
                int[] game_ell = new int[size];

                int leap = elements_and_leap[1];
                if (0 > leap || leap > 100) {
                    System.exit(0);
                }

                System.out.println("Enter elements:");

                for (int c = 0; c < size; c++) {
                    int element = s.nextInt();
                    if (element != 0 && element != 1) {
                        System.exit(0);
                    }
                    game_ell[c] = element;
                }

                // Processing the input and writing the result to the file
                String res = a.canWin(game_ell, leap) ? "YES" : "NO";
                printWriter.println(res); // Write the result to the file
            }

            printWriter.close(); // Close the PrintWriter
            fileWriter.close(); // Close the FileWriter
            System.out.println("Output written to outputs.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        s.close(); // Close the scanner after finishing reading all inputs
    }
}