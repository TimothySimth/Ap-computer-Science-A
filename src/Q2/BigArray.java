package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv=0;lcv< array.length; lcv++) {
            array[lcv] = (int) (Math.random() * (91-20) + 20);
        }
        for (int i=0;i<array.length;i++) System.out.print(array[i] + "");
        System.out.println();
        for (int temp : array) System.out.print(temp + " ");
        System.out.println();

        System.out.println("The middle number is: " + array[array.length/2]);

        double avg = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of first, middle, and last numbers is: " + (avg/3));

        int smallest = array[0];
        int largest  = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest ) largest  = num;
         }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: "  + largest);

        int smallIndext = -1;
        int largeIndext = -1;
        for (int i=0; i <array.length; i++) {
            if (array[i] == smallest) smallIndext = i;
            if (array[i] == largest)  largeIndext = 1;
        }

        int tempswap = array[smallIndext];
        array[smallIndext] = array[largeIndext];
        array[largeIndext] = array[smallIndext];

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        int randnum = (int) (Math.random() * 10 + 1);
        array[array.length/2] = randnum;
        for (int x : array) System.out.print(x + " ");
        System.out.println();

        for (int i=0;i<array.length; i++) array[i] += 10;
        for (int x : array) System.out.print(x + " ");
        System.out.println();

        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is: " + myThird);

        for (int num : array)
            if (num>=50 && num<60)
                System.out.print(num + " ");
        System.out.println();

        for (int i = 0; i < array.length; i++)
            if (array[i]%4==0)
                        System.out.print(i + " ");
        System.out.println();

        boolean sixty = false;
        for (int n : array) if (n==60) sixty = true;
        System.out.println("Is 60 in the list: " + sixty);

        boolean same = true;
        for (int lcv=0;lcv<array.length;lcv++)
            if (array[lcv]!=array[(array.length-1)-lcv])
                same = false;
        System.out.println("Is the array palindromic: " +same);

        double average = 0;
        for (int x : array)
            average += x;
        average /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x>average) avgCount++;
        System.out.printf("There are %d numbers greater than the average\n", avgCount);

        int evens = 0;
        for (int num : array)
            if (num%2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);

        int[] array2 = new int[array.length];
        for (int i=0;i<array.length;i++)
            array2[i] = array[(array.length-1)-i];

        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        int[] shiftArr = cSR(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0){
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements: " + sum);

    }

    public static int[] cSR(int[] arr) {
        int temp = arr[arr.length-1];
        int[] shifted = new int[arr.length];
        for (int lcv=1;lcv< arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
/*
88324678574434778983368962267084762651
88 32 46 78 57 44 34 77 89 83 36 89 62 26 70 84 76 26 51
The middle number is: 83
Average of first, middle, and last numbers is: 74.0
Smallest number: 26
Largest number: 89
88 32 46 78 57 44 34 77 89 83 36 89 62 26 70 84 76 32 51
88 32 46 78 57 44 34 77 89 3 36 89 62 26 70 84 76 32 51
98 42 56 88 67 54 44 87 99 13 46 99 72 36 80 94 86 42 61
The number that was ousted is: 56
54
3 6 12 13 14
Is 60 in the list: false
Is the array palindromic: false
There are 10 numbers greater than the average
There are 12 even numbers
61 42 86 94 80 36 72 99 46 13 99 87 44 54 67 88 5 42 98
61 98 42 5 88 67 54 44 87 99 13 46 99 72 36 80 94 86 42
Sum of all digits of all elements: 205
*/