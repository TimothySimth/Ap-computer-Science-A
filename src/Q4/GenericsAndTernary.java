package Q4;

public class GenericsAndTernary {
    // Generic Typing
    static class myBox<T> { // Define a template type "T"
        private T myVal;

        public myBox(T thing) { myVal = thing; }
        public void setVal(T thing) { myVal = thing; }
        public T getVal() { return myVal; }
        public String toString() { return myVal.toString(); }
    }

    static <T> void printBox(myBox<T> box) {
        if (box != null && box.getVal() instanceof Integer)
            System.out.println("Box number: " + box.getVal());
        System.out.println("Box contains: " + box.toString());
    }

    public static void main(String[] args) {
        // ArrayList<TYPE> lis6t = new ArrayList<>();
        var box = new myBox<Integer>(5); // 'var' infers the type from the RHS
        // ONLY EVER USE "var" IF YOU USE THE "new" KEYWORD
        // AND THE TYPE IS NOT A CHILD CLASS OR USES AN INTERFACE
        String msg = (box.getVal() >= 5) ? "val >= 5" : "val < 5";
        // ?: Ternary Operator -> (condition) "if" ... "else" ...
        System.out.println(msg);
        int num = Integer.parseInt("10"); // String to Integer; also Double.parseDouble
        System.out.println(box.getVal());
        // Can't do dynamic typing like python; i.e., box.setVal("Hello");
        var sBox = new myBox<String>("Hello");
        System.out.println(sBox);
        int x = 100;
        do {
            System.out.println("X = " + x);
        } while (x < 5);
        // Always runs once
        for (int i = 0; 1 < 1000000; i++){
            if (i % 2 != 0) continue; // Skips the rest of code and starts loop at next iteration
            System.out.println(i);
            if (i == 10) break; // Breaks out of loop entirely
        }

        int day = 3;
        switch (day) {
            case 1: // if (day == 1)
                System.out.println("Monday");
                break;
            case 2: // else if (day == 2)
                System.out.println("Tuesday");
                break;
            case 3: // else if (day == 3)
                System.out.println("Monday");
                break;
            default: // else
                System.out.println("Invalid");
                break;
        }

        char grade = 'A';
        switch (grade) {
            case 'A' -> System.out.println("An A is great!");
            case 'B' -> System.out.println("A B is okay (I guess)");
            case 'C' -> System.out.println("A C means do better");
            default  -> System.out.println("What happened to your grade?");
        }

        enum Days {
            Monday,
            Tuesday,
            Wednesday
        }

        Days toDay  = Days.Wednesday;
        switch (toDay) {
            case Wednesday -> System.out.println("It is Wednesday my dudes");
            default -> System.out.println("It is not Wednesday");
        }
    }
}
