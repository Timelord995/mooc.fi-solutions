
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numSize = 1;
        while (numSize <= size) {
            printSpaces(size - numSize);
            printStars(numSize);
            numSize++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        int j = height-1;
        while(i <= height*2 && j >= 0){
            printSpaces(j);
            printStars(i);
            i=i+2;
            j--;
            if (j == -1){
                printSpaces(height-2);printStars(3);
                printSpaces(height-2);printStars(3);
            }
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
