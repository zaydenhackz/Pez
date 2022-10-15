import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //asking for the name of the name Pez instance
    Scanner user = new Scanner(System.in);
    System.out.println("Enter the name for the new Pez Object");
    String pezName;
    pezName = user.nextLine();
    
    // asking if it wants to set a specifix pez count, and if not have a default value
    Scanner questionCount = new Scanner(System.in);
    System.out.println("Type y for yes and n for no, if you want to set your count manually");
    String outcome;
    outcome = user.nextLine();


    //if yes then it will ask for the amount and pass it in when initializing the pez object
    if( outcome.equals("y")){
       Scanner pickCount = new Scanner(System.in);
       System.out.println("Add the amount of pez you want");
       String outcome1;
       outcome1 = user.nextLine();
          pez Yoda = new pez(pezName, Integer.parseInt(outcome1));
          System.out.println(String.format("The Pez name is %s, and the current count is %d",Yoda.currentName(), Yoda.currentCount()));

    }
          //if no then it will set the default when initializing the pez object

    else{
          pez Yoda = new pez(pezName);
          System.out.println(String.format("The Pez name is %s, and the current count is %d",Yoda.currentName(), Yoda.currentCount()));

    }
       
    
  }
}
