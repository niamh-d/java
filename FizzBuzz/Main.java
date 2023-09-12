public class Main {
    public static void main(String[] args) {

        for(int num = 1; num <= 100; num++) {
            StringBuilder output = new StringBuilder("");
            if(num % 3 == 0) output.append("Fizz");
            if(num % 5 == 0) output.append("Buzz");
            if(output.length() == 0) output.append(num);
            System.out.println(output);
        }
    }
}



