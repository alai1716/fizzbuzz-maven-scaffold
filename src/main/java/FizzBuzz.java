public class FizzBuzz {

    public static String of(int number) {
        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        }

        if (result.equals("")) {

            return String.valueOf(number);
        }
        return result;
    }
}
