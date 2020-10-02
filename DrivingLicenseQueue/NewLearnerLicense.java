import java.util.Scanner;

public class NewLearnerLicense

{

  public static void main(String[] args)

  {

    Scanner scan = new Scanner(System. in );
    Scanner scan2 = new Scanner(System. in );
    Scanner scan3 = new Scanner(System. in );

    String me = scan.nextLine();

    int numberOfAgent = scan2.nextInt();

    String otherFour = scan3.nextLine();

    int myPosition = getMyPosition(otherFour, me);

    int minutes = getJobDoneMinutes(numberOfAgent, myPosition);

    System.out.println(minutes * 20);

  }

  public static int getMyPosition(String otherFour, String me)

  {

    String temp;

    String[] str = new String[5];

    int count = 5;

    otherFour = otherFour + " " + me;

    str = otherFour.split(" ");

    //Sorting the names

    for (int i = 0; i < count; i++)

    {

      for (int j = i + 1; j < count; j++) {

        if (str[i].compareTo(str[j]) > 0)

        {

          temp = str[i];

          str[i] = str[j];

          str[j] = temp;

        }

      }

    }

    return calculatePosition(str, me);

  }

  public static int calculatePosition(String[] str, String me) {

    int pos = 1;

    for (String val: str) {

      if (val.equals(me)) {

        return pos;

      } else {
        pos++;
      }

    }

    return 0;

  }

  public static int getJobDoneMinutes(int numberOfAgent, int myPosition) {

    int round = 1;

    if (myPosition <= numberOfAgent) {

      return round;

    }

    int posRemainder = myPosition % numberOfAgent;

    int roundInterger = myPosition / numberOfAgent;

    if (posRemainder == 0) {

      return roundInterger;

    } else {

      return roundInterger + 1;

    }

  }

}