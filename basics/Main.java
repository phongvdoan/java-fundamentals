import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main method is working!");

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);
    clock();
  }

  public static String pluralize(String word, int number) {
   
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int num) {
    int counter = 0;
    int headsCounter = 0;
    while (headsCounter != num) {
      double rand = Math.random();
      counter++;
      if (rand < 0.5) {
        System.out.println("tails");
      } else {
        headsCounter++;
        System.out.println("heads");
      }
    }
    System.out.println("It took " + counter + " flips to flip " + headsCounter + " head in a row.");
  }

  // https:/c/stackoverflow.com/questions/20608971/showing-the-time-every-second
  // https://www.journaldev.com/1020/thread-sleep-java
  // https://stackoverflow.com/questions/18025337/fixing-error-unreported-exception-interruptedexception
  public static void clock() {
    try {
      while (true) {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        Thread.sleep(1000);
      }
    } catch (InterruptedException error) {
      System.out.println("Time is broken");
    }
  }

  public static void clockTwo() {
    while (true) {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalDateTime then = LocalDateTime.now();
          if(now.getSecond() != then.getSecond()) {
            System.out.println(time);
          }
      }
  }
}