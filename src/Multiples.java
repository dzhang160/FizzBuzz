public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 1000) {
            boolean MultipleOf3 = i % 3 == 0;
            boolean MultipleOf5 = i % 5 == 0;
            if (MultipleOf3 || MultipleOf5) {
                count += 1;
            }
            i += 1;
        }
        System.out.println(count);
    }
}
