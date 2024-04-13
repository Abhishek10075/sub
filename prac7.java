public class prac7 {
    
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows here
        
        System.out.println("1. Pattern:");
        printPattern1(rows); // Output of Pattern 1
        /*
        *
        **
        ***
        *****
        */
        
        System.out.println("\n2. Pattern:");
        printPattern2(rows); // Output of Pattern 2
        /*
        *****
        ****
        ***
        **
        *
        */

        System.out.println("\n3. Pattern:");
        printPattern3(rows); // Output of Pattern 3
        /*
             *
            **
           ***
          ****
         *****
        */

        System.out.println("\n4. Pattern:");
        printPattern4(rows); // Output of Pattern 4
        /*
        *******
         ******
          *****
           ****
            ***
             *
        */
    }
    
    // Pattern 1: Simple Triangle
    public static void printPattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // Pattern 2: Inverted Triangle
    public static void printPattern2(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3: Right-aligned Triangle
    public static void printPattern3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 4: Upside-down Right-aligned Triangle
    public static void printPattern4(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
