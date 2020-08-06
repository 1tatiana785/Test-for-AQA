package Test3;

public class Test3 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 8, 23, 21, 54};
            for (int n : myArray)
            if (n % 3 == 0)
                System.out.println(n + " кратное 3");
    }
}