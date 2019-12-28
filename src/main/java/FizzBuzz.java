public class FizzBuzz {

    public static String of(int number) throws Exception {
        if (number <= 0) {
            throw new Exception("Invalid input");
        }
        String result = "";
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            result = "FizzBuzzWhizz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 5 == 0 && number % 7 == 0) {
            result = "BuzzWhizz";
        } else if (number % 3 == 0 && number % 7 == 0) {
            result = "FizzWhizz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else if (number % 7 == 0) {
            result = "Whizz";
        }

        if (result.equals("")) {

            return String.valueOf(number);
        }

        return result;
    }
}
