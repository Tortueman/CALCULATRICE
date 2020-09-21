import java.util.Scanner;

class calculatrice {

  Scanner sc = new Scanner(System.in);
 
  private int nb1 = 0, nb2 = 0;
  
  private String operation = "";
  
  private String reponse = "";

  calculatrice(Scanner pScanner) {
  
    this.sc = pScanner;
  }

  public void calcul() {
  
    mainLoop: while (!reponse.equals("n")) {

      try {
        
        System.out.print("Ton opération : ");

        operation = sc.nextLine();
        // je dois reccupérer le premier carractère = nb1 
        // ensuite le deuxieme carractère = l'opérateur 
        // et le troisieme carractère = nb2
        
        int result = 0;
  
        switch (operation) {
          case "+":
            result = nb1 + nb2;
            break;
            case "-":
              result = nb1 - nb2;
              break;
            case "/":
              result = nb1 / nb2;
              break;
            case "*":
              result = nb1 * nb2;
              break;
            case "%":
              result = nb1 % nb2;
              break;
            default:
              System.out.println(util.ERROR_LOGIQUE);

              System.out.println(util.ERROR_ENTIER);
              System.out.println(util.ERROR_ESPACE);
              continue mainLoop;
          }
          System.out.println("Résultat de l'opération: " + result);       
          System.out.println(util.QUESTION);
          reponse = sc.nextLine();
  
        }
        catch (Exception exception) {
          if (sc.hasNextLine()) {
              sc.nextLine();
          }
        }
      }
      System.out.println(util.END);
      sc.close();
    }
  }
