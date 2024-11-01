package j12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
       Array: One of the objects used in Java to store multiple variables.
       When creating an array, we need to declare two things:
       1- Data type (An array can only contain elements of the same data type.)
       2- Length (The length specifies the maximum number of elements the array can hold; attempting to add more elements will throw a Runtime Exception.)
       Arrays are like trays…
       Arrays can store references to both primitive and non-primitive data.
       The 'names' array does not store name values directly but instead stores references to them.
    */
    public static void main(String[] args) {

        // Declaring an array
        int a; // Declared a primitive data type
        int[] arr; // Declared an int data type array without assigning a value

        //  System.out.println("a = " + a); // Variable 'a' might not have been initialized
        //  System.out.println("arr = " + arr); // Variable 'arr' might not have been initialized

        // Task: Create an array named nameArray to hold names
        String[] nameArray = {"rumeysa", "ahmet", "zeynep", "tommy", "ali", "omer"};
        // Array declaration and assignment combined

        // Task: Create an array to hold numbers
        int[] numArray = {11, 22, 333, 66, 55, 44, 88, 99, 55, 2, 44, 55, 6}; // Allows duplicate elements

        // int[] sayiArr = new int[]; // Array initializer expected

        int[] sayiArr = new int[5]; // Defined an array with a length of 5
        // How they are stored in heap memory

        System.out.println("sayiArr = " + sayiArr); // sayiArr = [I@3498ed reference value

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr)); // Arrays.toString(sayiArr) = [0, 0, 0, 0, 0]

        sayiArr[0] = 35; // Assigned a value of 35 to the 0th index of the array

        System.out.println("Arrays.toString(sayiArr) = " +
                Arrays.toString(sayiArr)); // Arrays.toString(sayiArr) = [35, 0, 0, 0, 0]

        sayiArr[1] = 34; // Assigned a value of 34 to the 1st index of the array
        sayiArr[2] = 9; // Assigned a value of 9 to the 2nd index of the array
        sayiArr[3] = 48; // Assigned a value of 48 to the 3rd index of the array
        sayiArr[4] = 7; // Assigned a value of 7 to the 4th index of the array

        System.out.println("Arrays.toString(sayiArr) = " +
                Arrays.toString(sayiArr)); // Arrays.toString(sayiArr) = [35, 34, 9, 48, 7]

        // Runtime Error - ArrayIndexOutOfBoundsException
        // sayiArr[5] = 77; // Trying to assign a value to an out-of-bounds index

        System.out.println("sayiArr.length = " + sayiArr.length); // sayiArr.length = 5
        System.out.println("nameArray.length = " + nameArray.length); // nameArray.length = 6
        System.out.println("numArray.length = " + numArray.length); // numArray.length = 13

        // Task: Print the last element of each array
        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]); // sayiArr[sayiArr.length-1] = 7
        System.out.println("nameArray[nameArray.length-1] = " + nameArray[nameArray.length - 1]); // nameArray[nameArray.length-1] = omer
        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]); // numArray[numArray.length-1] = 6

        // Task: Update the last element of nameArray
        nameArray[nameArray.length - 1] = "QA Omer";

        System.out.println("nameArray = " + nameArray); // nameArray = [Ljava.lang.String;@73f792cf
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        // Arrays.toString(nameArray) = [rumeysa, ahmet, zeynep, tommy, ali, QA Omer]

        // Using a loop to iterate over array elements
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " "); // rumeysa ahmet zeynep tommy ali QA Omer
        }

        System.out.println();

        // Task: Print the elements at even indices in numArray
        for (int i = 0; i < numArray.length; i += 2) {
            System.out.print(numArray[i] + " "); // 11 333 55 88 55 44 6
        }

        System.out.println();

        // Task: Print elements with 5 letters in nameArray
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length() == 5) {
                System.out.println(nameArray[i]);
            }
        }

        System.out.println(" // sort //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        // Sorting arrays
        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
    }
}
