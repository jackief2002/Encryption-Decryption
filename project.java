class project {
    public static void main(String[] args) {
      System.out.println("What is the name of your text file?");
      String name = Input.readString();
      String msg= Input.readFile(name + ".txt" );
      System.out.println("Original Message: " + msg);
      
      //Reverse string
      char letter = ' ';
      String build ="";
      if(msg.length()%2 != 0){
        msg = msg + " ";
      }
      for (int x = msg.length()- 1; x>=0; x--){
        letter = msg.charAt(x);
        build += letter;
      }
  
      //Cypher
      char letter2 = ' ';
      String build2 = "";
      for(int x = 0; x < build.length(); x+=2){
        //Add five to every other letter 
          letter = build.charAt(x);
          letter = (char)((int)(letter) + 5);
          build2 += letter;
        //Subtract five to every other (starting from pos 1)
          letter2 = build.charAt(x+1);
          letter2 = (char)((int)(letter2) - 5);
          build2 += letter2;
      }
  
      //Binary
      int intletter;
      String build3 = "";
      int y;
      for(int x = 0; x < build2.length(); x++){
          intletter = (int)(build2.charAt(x));
          String build4 = "";
            while(intletter > 0){
                y = intletter % 2;
                build4 = y + build4;
                intletter = intletter / 2;
            }
            build3 += build4 + " ";
        }
      System.out.println("\n" + "Encrypted Message: " + build3);
      
      /////////////////////////////////////////////Decryption////////////////////////////////////////////
      
      //Binary back to decimal, then char
      String[] binary;
      binary = build3.split(" ");
      String build5 = "";
      for (String portion : binary) {
         char decimal = (char)(Integer.parseInt(portion, 2));
         build5 += decimal;
      }

      //Cypher
      String build6 = "";
      for(int x = 0; x < build5.length(); x+=2){
        //Add five to every other letter 
        letter = build5.charAt(x);
        letter = (char)((int)(letter) - 5);
        build6 += letter;
      //Subtract five to every other (starting from pos 1)
        letter2 = build5.charAt(x+1);
        letter2 = (char)((int)(letter2) + 5);
        build6 += letter2;
    }

      //Reversing
      String build7 = "";
      for (int x = build6.length()- 1; x>=0; x--){
        letter = build6.charAt(x);
        build7 += letter;
      }
      System.out.println("\n" + "Decrypted Message: " + build7);
      }
    }
  