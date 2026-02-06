//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

class main {
  public static void main(String[] args) {

    System.out.println("Hello, user! Welcome to the Valorant Randomizer!");

    System.out.println("Select a role:");

    System.out.println("1 - Controller");
    System.out.println("2 - Duelist");
    System.out.println("3 - Initiator");
    System.out.println("4 - Sentinel");

    Scanner userInput = new Scanner(System.in);
    String firstInput = userInput.next();

    switch(firstInput){
      case "1":
        List<String> controllerList = Arrays.asList("Astra", "Brimstone", "Clove", "Harbor", "Omen", "Viper");
        Random controller = new Random();
        int randomController = controller.nextInt(controllerList.size());
        String finalController = controllerList.get(randomController);

        System.out.println("You selected CONTROLLER. The sorted random agent is: " + finalController);

        break;
      case "2":
        List<String> duelistList = Arrays.asList("Iso", "Jett", "Neon", "Phoenix", "Raze", "Reyna", "Waylay", "Yoru");
        Random duelist = new Random();
        int randomDuelist = duelist.nextInt(duelistList.size());
        String finalDuelist = duelistList.get(randomDuelist);

        System.out.println("You selected DUELIST. The sorted random agent is: " + finalDuelist);
        break;
      case "3":
        List<String> initiatorList = Arrays.asList("Breach","Fade","Gekko","KAY/O","Skye","Sova","Tejo");
        Random initiator = new Random();
        int randomInitiator = initiator.nextInt(initiatorList.size());
        String finalInitiator = initiatorList.get(randomInitiator);

        System.out.println("You selected INITIATOR. The sorted random agent is: " + finalInitiator);
        break;
      case "4":
        List<String> sentinelList = Arrays.asList("Chamber","Cypher","Deadlock","Killjoy","Sage","Veto","Vyse");
        Random sentinel = new Random();
        int randomSentinel = sentinel.nextInt(sentinelList.size());
        String finalSentinel = sentinelList.get(randomSentinel);

        System.out.println("You selected SENTINEL. The sorted random agent is: " + finalSentinel);
        break;
    default:
      System.out.println("The number you typed is invalid. Please input a valid number." );
    }
  }
}