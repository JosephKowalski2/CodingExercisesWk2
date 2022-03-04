public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i >= 5; i -5){
      System.out.println(i);
    }
  }
  
  void soln2() {
    for (int i = 100; i >= 5; i -5){

    }
  }
  
  void soln3() {
    int sum = 0;
    for (int i = 9; i <= 17; i++){
      sum += i;
    }
    System.out.println(sum);
  }
  
  void soln4() {
    int smallest = a[0];
    For (int i = 1; i<a.length; i++) {

      If (a[i] > smallest) smallest = a[i];
    }

    System.out.println(smallest);

}
  
  void soln5() {
    int largest = a[0];
    For (int i = 1; i<a.length - 1; i++) {

      If (a[i] > largest) largest = a[i];
    }
    System.out.println(largest);

}
  
  void soln6() {
    for (int i = 0; i < a.length; i++){
      if (a[i] == true)
        System.out.println(i);
        break;
    }


  }
  
  void soln7() {
    int i = 0;
    while (a[i] == false){
      i++;
      }
    System.out.println(i);

  }
  
  void soln8() {
    for (int i = 0;i < a.length; i++) {
      a[i] = a[i] + 5;
    }
  }
  
  void soln9() {
    for (int i = 0;i < a.length; i++) {
      a[i] = a[i] / 1.3;
    }

  }
  
  void soln10() {
    for (i = 0; i < a.length; i++){
      Math.pow(a[i], 3) - a[i] / 3);
    }

  }
  
  void soln11() {
  // zero out a 4 by 6 integer array
    for (int row = 0; i < array.length; row++){
      for(int column = 0; i <array[row].length; column++){
            array[row][column] = 0;
      }
    }
  }
  
  void soln12() {
  // multiply each element of a 5 by 5 array of intergers by 7
    for (int row = 0; i < array.length; row++) {
      for (int column = 0; i < array[row].length; column++) {
        array[row][column] *= 7;
      }
    }
  
  void soln13() {
  // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans
      // each element in the result should be true if the value in the argument array is even, else it's false
        boolean [][] result = new boolean[array.length][array[0].length];
        for (int row = 0; i < array.length; row++) {
          for (int column = 0; i < array[row].length; column++) {
              if (array[row][column % 2] == 0){
                result [row][column] = true;
              }
              else
                result[row][column] = false;
          }
        }
  
  void soln14() {
  // create a method that takes two doubles and returns the first parameter
    //raised to the second parameter's value
    return Math.pow(firstParm, secondParm);
  }
  
  void soln15() {
  // create a method that returns a boolean if the Object passed to it is a Fish or not
      if (Object instanceOf Fish){
        return true;
      }
      else return false;
  }
  
  void soln16() {
  // There is an object x which has a method (double)Balance().
    //Build an IF statement that prints "Paid Off" if the result of the balance call is less than of equal to 1.0,
    //else it prints the balance as a Dollar figure (2 decimal places)
        if (balance <= 1.0){
          System.out.println("Paid Off");
        }
        else
          System.out.println(String.format(".2f", Balance));
  }
  
  void soln17() {
  // Build a WHILE loop that turns on the heat
    //if the thermo.getTemp() is less than 72.0 else it turns on the A/C
    //if thermo.getTemp() is greater than 76.0
      while (true){
            if (thermo.getTemp() > 76){
              return acOn;
            }
            else if (thermo.getTemp() < 72){
              return heatOn;
            }
        }
  }
  
  void soln18() {
  // Find a number greater than Pi in a double array, print number and its index.
          int pi = Math.PI;
          For (int i = 0; i < a.length; i++) {

          If (a[i] > pi) {
            System.out.println(a[i]);
            System.out.println(i);

          }
        }
  }
  
  void soln19() {
  // Given an array of objects (of class Xaction) w/ nulls,
    //sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.
          int sum = 0;
          for (int i = 0; i < array.length; i++) {
          if (array[i] == null) {
              sum += array[i];
          }
        }
        System.out.println(sum);
  }
  
  void soln20() {
  // reverse an array of objects of type Xaction
        String [] reverse = new String[array.length];
        for (int i = 0; i <= array.length / 2; i++){
          reverse[i] = array[array.length - i - 1];
          reverse[reverse.length - i - 1] = array[i]
        }
        return reverse;
  }
  
  void soln21() {
  // print a 5's times table
    String table = "";
    if (int i = 0; i < 6; i++){
        if (int j = 0; i < 6; i++){
          table = I*j;
          } table += "\n";
        }
    return table;
  }
  
  void soln22() {
  // determine the hyponenause of a 9 by 7 right triangle, assign it to a double
    return math.pow(9,2) + math.pow(7,2);
  }
  
}
