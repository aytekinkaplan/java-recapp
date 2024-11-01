package j11_Debugger;

// Defines the package `j11_Debugger`, grouping related classes together.

public class C01_Debugger {
    // Declares a public class named `C01_Debugger`.
    // The `public` modifier allows other classes to access this class.

    /*
    Debugging philosophy: Debugging often shows a lack of full understanding of the code.
    If you need to debug, it might indicate missing a complete mental model of the code.
    A goal in coding is to minimize debugging by building a clear, structured code approach.

    Cases where debugging is useful:
    * When inheriting unfamiliar code.
    * When developing new code.

    Aim: Build applications that need minimal debugging.
    */

    public static void main(String[] args) {
        // Declares the `main` method, the entry point of the application.
        // `static` allows it to run without creating an instance of the class.
        // `void` means it returns no value, and `String[] args` lets the program accept command-line arguments.

        String str = "bunu ilerde kullanin hocam “korku iyidir diri tutar ";
        // Declares a `String` variable `str` with a value.
        // This text can be accessed and manipulated in the program.

        System.out.println(str.substring(10));
        // Prints a substring of `str` starting from index 10 to the end of the string.
        // `substring(10)` captures characters from the 10th position onward.
        // Expected output: "e kullanin hocam “korku iyidir diri tutar"

        System.out.println(str.substring(str.length() - 6));
        // Prints the last 6 characters of `str`.
        // `substring(str.length() - 6)` calculates the starting index to capture the final part of the string.
        // Expected output: "tutar"
    }
}
