package HW2;

public class Task3 {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(CheckPair(number));
    }

        public static String CheckPair(int number)
        {
            String answer;
            if (number % 2 == 0) {
                answer = "Число четное";

            } else {
                answer = "Число нечетное";
            }

            return answer;
        }


}
