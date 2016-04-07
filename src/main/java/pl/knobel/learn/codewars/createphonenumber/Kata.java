package pl.knobel.learn.codewars.createphonenumber;

public class Kata {

  public static String createPhoneNumber(int[] numbers) {
    StringBuilder sb = new StringBuilder("(");
    sb.append(numbers[0]);
    sb.append(numbers[1]);
    sb.append(numbers[2]);
    sb.append(") ");
    sb.append(numbers[3]);
    sb.append(numbers[4]);
    sb.append(numbers[5]);
    sb.append("-");
    sb.append(numbers[6]);
    sb.append(numbers[7]);
    sb.append(numbers[8]);
    sb.append(numbers[9]);
    return sb.toString();
  }

  public static String createPhoneNumber2(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }

}