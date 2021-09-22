package com.datastructure.datastructures;
import java.io.*;
import java.util.*;
/*
 * class to search word in a file
 */
public class BinarySearch {
    /* binary search method to check if word is present or not
     * array is a string array
     * find is a word needs to be searched
     *  index position of word
     */
    public static int binarySearch(String[] array, String find)
    {
        int l = 0, r = array.length - 1;
        while (l <= r)
        {
            int m = l + (r - l) / 2;
            int res = find.compareTo(array[m]);
            // Check if word find is present at mid
            if (res == 0)
                return m;
            // If word find greater, ignore left half
            if (res > 0)
                l = m + 1;
            // If find is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Shrivya Shetty\\eclipse-workspace\\datastructures\\src\\main\\java\\com\\datastructure\\datastructures\\binary"));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = br.readLine()) != null) {
          String[] array = line.split(",");
          Arrays.sort(array);
          System.out.println("Enter the word to be searched");
          String key = sc.next();
          sc.close();
          int result = binarySearch(array, key);
          if (result == -1)
              System.out.println("Element not present");
          else
              System.out.println("Element found at index " + result);
        }
        br.close();
      }
}
