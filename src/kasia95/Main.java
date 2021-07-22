package kasia95;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("enter the number of numbers ");
    List<Integer> list = new ArrayList<>();

    int howmanynumbers = in.nextInt();

    for (int i = 0; i < howmanynumbers; i++) {
      System.out.print("Enter a number: ");

      list.add(in.nextInt());
    }
    System.out.println("list without duplicates sorted ");
    list.stream().distinct().sorted().forEach(System.out::println);

    long count = list.stream().count();
    System.out.println("number of numbers" + " " + count);

    long countdistinct = list.stream().distinct().count();
    System.out.println("Number of numbers without duplicates" + " " + countdistinct);
    Optional<Integer> optional = list.stream().max(Integer::compareTo);

    if (optional.isPresent()) {
      Integer maxValue = optional.get();
      System.out.println("Maximum Value = " + maxValue);
    }

    Optional<Integer> optionalmin = list.stream().min(Integer::compareTo);

    if (optionalmin.isPresent()) {
      Integer minValue = optionalmin.get();
      System.out.println("Minimum  Value = " + minValue);
    }
    ;
  }
}
