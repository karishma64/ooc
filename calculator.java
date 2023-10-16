//Code: (for Calculator using java)
Class Calculator {
Public int add(int a, int b) {
  Return a + b;
}

Public int subtract(int a, int b) {
  Return a – b;
}

Public int multiply(int a, int b) {
  Return a * b;
}

Public int divide(int a, int b) {
  If (b == 0) {
    System.out.println(“Error! Dividing by zero is not allowed.”);
  Return 0;
  }
Else 
  Return a / b;

}
  Public int modulo(int a, int b) {
    If (b == 0) {
      System.out.println(“Error! Dividing by zero is not allowed.”);
      Return 0;
    } 
    Else
      Return a % b;
  }
 }

Class Main{ 
    Public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
      System.out.println(myCalculator.multiply(40,11));
      System.out.println(myCalculator.divide(40,2));
      System.out.println(myCalculator.modulo(20,2));
    }
}


Output:
12
34
440
20
0




Name: Karishma Salgaonkar
Class: Sy BCA
Roll no.: 2205013
