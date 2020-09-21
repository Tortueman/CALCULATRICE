import java.util.Scanner;

class calculatrice {

  Scanner sc = new Scanner(System.in);
 
  int nb1 = 0, nb2 = 0;
  
  String operation; 
  String[] tableauDonnées;
  int result;
  
  String reponse = "";

  public void calcul() {
  
    while (!reponse.equals("n")) {

      try {
        
        System.out.print("Ton opération : ");

        operation = sc.nextLine();
        tableauDonnées = operation.split("\\s");

        nb1 = Integer.parseInt(tableauDonnées[0]);
        String coeff = tableauDonnées[1];
        nb2 = Integer.parseInt(tableauDonnées[2]);

        // je dois reccupérer le premier carractère = nb1 
        // ensuite le deuxieme carractère = l'opérateur 
        // et le troisieme carractère = nb2
        
  
        switch (coeff) {
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
        }
        System.out.println("Résultat de l'opération: " + result);      
        
        
        System.out.println(util.QUESTION);
        reponse = sc.nextLine();
  
      } catch (Exception exception) {
          if (sc.hasNextLine()) {
            sc.nextLine();
        }
      }
    }
    System.out.println(util.END);
    sc.close();
  }
}

/*System.out.println(util.ERROR_ENTIER);
  System.out.println(util.ERROR_ESPACE); */
