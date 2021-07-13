//Write a program in java to print the sum of two numbers

 class Program2{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int num1 = input.nextInt();
    System.out.print("Input the second number: ");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println();
    System.out.println("Sum: "+sum);
  }
}