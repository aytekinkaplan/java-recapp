### Improved Code with Detailed Explanation:

```java
package ch02_DataTypes_WrapperClass;

public class C05_RegexExpressions {

    public static void main(String[] args) {

        String str = "Java 12345 ? | >< $!";

        // \\d is a regular expression that matches any digit (0-9).
        System.out.println(str.replaceAll("\\d", "*"));  // Replaces all digits with *
        // Output: Java ***** ? | >< $!

        System.out.println("str = " + str);
        // Output: Java 12345 ? | >< $!
        // Note: The original string remains unchanged because String is immutable in Java.

        // \\D matches any character that is not a digit (non-digit).
        System.out.println(str.replaceAll("\\D", "*"));
        // Output: *****12345**********
        // Non-digit characters, including spaces, are replaced with *.

        // \\S matches any non-whitespace character.
        System.out.println(str.replaceAll("\\S", "*"));
        // Output: **** ***** * * ** **
        // Only spaces are kept, everything else is replaced with *.

        // \\s matches any whitespace character (like spaces).
        System.out.println(str.replaceAll("\\s", "*"));
        // Output: Java*12345*?*|*><*$!
        // All spaces are replaced with *.

        // \\w matches any word character (letters, digits, or underscores) [a-zA-Z0-9_].
        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));
        // Output: **** ***** ? | >< $!
        // Letters and digits are replaced, but special characters and spaces are kept.

        // \\W matches any character that is not a word character.
        System.out.println(str.replaceAll("\\W", "*"));
        // Output: Java*12345**********
        // All special characters are replaced with *, leaving only letters and digits.

        // Demonstrating immutability of strings: the original string remains unchanged.
        System.out.println("str = " + str);
        // Output: Java 12345 ? | >< $!

        // Store the result of replacing non-word characters in a new string.
        String str2 = str.replaceAll("\\W", "*****");
        System.out.println("str2 = " + str2);
        // Output: Java*****12345**************************************************

    }
}
```

### **Explanation of Regular Expressions (Regex) in Java**:

1. **`\\d`**:

   - This is used to match **digits** (0-9).
   - For example, `str.replaceAll("\\d", "*")` replaces all digits in the string with `*`.
   - **Example**:
     ```java
     String example = "abc123";
     System.out.println(example.replaceAll("\\d", "*"));
     // Output: abc***
     ```

2. **`\\D`**:

   - Matches **non-digit** characters. This includes letters, special characters, and spaces.
   - **Example**:
     ```java
     String example = "abc123";
     System.out.println(example.replaceAll("\\D", "*"));
     // Output: ***123
     ```

3. **`\\s`**:

   - Matches **whitespace** characters (spaces, tabs, etc.).
   - **Example**:
     ```java
     String example = "Hello World";
     System.out.println(example.replaceAll("\\s", "*"));
     // Output: Hello*World
     ```

4. **`\\S`**:

   - Matches **non-whitespace** characters. This will replace everything except spaces.
   - **Example**:
     ```java
     String example = "Hello World";
     System.out.println(example.replaceAll("\\S", "*"));
     // Output: ***** *****
     ```

5. **`\\w`**:

   - Matches **word characters** which include **letters, digits, and underscores** [a-zA-Z0-9_].
   - **Example**:
     ```java
     String example = "Hello 123!";
     System.out.println(example.replaceAll("\\w", "*"));
     // Output: ***** ***!
     ```

6. **`\\W`**:
   - Matches **non-word characters** (anything that's not a letter, digit, or underscore), including special characters and spaces.
   - **Example**:
     ```java
     String example = "Hello 123!";
     System.out.println(example.replaceAll("\\W", "*"));
     // Output: Hello*123*
     ```

### **Java's String Immutability**:

- The `String` class in Java is **immutable**, meaning once a string is created, it cannot be changed. Operations such as `replaceAll()` return a **new string** with the modifications, but the original string remains the same.
- For example:
  ```java
  String original = "Java";
  String modified = original.replace("a", "o");
  System.out.println("Original: " + original);  // Output: Java
  System.out.println("Modified: " + modified);  // Output: Jovo
  ```

### **Error Handling Example**:

If you try to use an invalid regex or a string that contains unexpected data, you could face a **runtime exception** like `PatternSyntaxException`. This error happens when the regex pattern provided is not valid.

```java
try {
    String invalidPattern = "[";
    str.replaceAll(invalidPattern, "*");
} catch (PatternSyntaxException e) {
    System.out.println("Invalid regex pattern: " + e.getMessage());
}
```

### **Additional Examples**:

1. **Replacing Letters with Special Characters**:

   ```java
   String text = "Hello123";
   String result = text.replaceAll("[a-zA-Z]", "#");
   System.out.println(result);
   // Output: ######123
   ```

2. **Removing Special Characters**:
   - If you want to remove all special characters from a string, you can use `\\W`.
   ```java
   String specialText = "Hello$%World@123!";
   String cleanText = specialText.replaceAll("\\W", "");
   System.out.println(cleanText);
   // Output: HelloWorld123
   ```

### **Key Takeaways**:

- **Regular Expressions (Regex)** allow for powerful pattern matching and replacement in Java strings.
- **Common Regex Patterns**:
  - `\\d`: Digits (0-9)
  - `\\D`: Non-digits
  - `\\s`: Whitespace
  - `\\S`: Non-whitespace
  - `\\w`: Word characters (letters, digits, underscores)
  - `\\W`: Non-word characters (special characters, spaces)
- **Immutability**: Strings in Java cannot be changed once they are created. Any modification results in a new string.

By using regex efficiently, you can perform complex string manipulations with minimal code.
