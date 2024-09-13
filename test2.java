   /*  public static void main(String[] args) {
        test1 a = new test1();
        Scanner s = new Scanner(System.in);
        int[] elements_and_leap = new int[2];
        //System.out.println("Number of queries:");
        int queries = s.nextInt(); // Queries

        if (1 > queries || queries > 5000) {
            System.exit(0);
        }

        try {
            FileWriter fileWriter = new FileWriter("outputs.txt"); // Create a FileWriter to write to a file
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int i = 0; i < queries; i++) {
                //System.out.println("Num elements and leap:");
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

               // System.out.println("Enter elements:");

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
            //System.out.println("Output written to outputs.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        s.close(); // Close the scanner after finishing reading all inputs
    }

    public static void main(String[] args) {
        Java_1D_Array_Part2 a = new Java_1D_Array_Part2();
          Scanner s = new Scanner(System.in);
          int[] elements_and_leap = new int[2];
  
          //System.out.println("Number of queries:");
          int queries = s.nextInt(); // Queries
          if(1 > queries || queries > 5000){System.exit(0);}
  
          for(int i = 0; i < queries ; i++){
  
            //System.out.println("Num elements and leap");
              for(int c = 0; c < 2 ; c++){
                int add = s.nextInt();
                elements_and_leap[c] = add;
                }
  
            int size = elements_and_leap[0];
            if(2 > size || size > 100){System.exit(0);}
            int[] game_ell= new int[size];
  
            int leap = elements_and_leap[1]; 
            if(0 > leap || leap > 100){System.exit(0);}
              
            //System.out.println("Enter elements:");
  
              for(int c = 0; c < size ; c++){
                int element = s.nextInt();
                if(element != 0 && element != 1){System.exit(0);}
                game_ell[c] = element;
              }
               
            String res = "";
            if(a.canWin(game_ell , leap) == true){ res = "YES";}
            else{res = "NO";}
            System.out.println(res);
          }
            s.close();
    } */

