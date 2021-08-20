import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split(",");
    if(inputs[0].equals("p1")){
    int pop =Integer.parseInt(inputs[1]);
    System.out.println(Population.getInitialStartTimeForMoose1(pop));
    }
    if(inputs[0].equals("p2")){
        int pop =Integer.parseInt(inputs[1]);
    System.out.println(Population.getInitialStartTimeForMoose2(pop));
    }
    if(inputs[0].equals("p3")){
       int moose =Integer.parseInt(inputs[1]);
       int wolf =Integer.parseInt(inputs[1]);
       int year =Integer.parseInt(inputs[1]);
     System.out.println(Population.getMoosePopulationWithWolves(moose,wolf,year));
    }
    if(inputs[0].equals("p4")){
     int moose =Integer.parseInt(inputs[1]);
       int wolf =Integer.parseInt(inputs[1]);
       int year =Integer.parseInt(inputs[1]);
      System.out.println(Population.getStartingMoosePopulationWithWolves(moose,wolf,year));
    }
  }
