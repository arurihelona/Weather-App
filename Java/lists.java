import java.util.*;
public class lists {
    public static void main(String[] args) {

        // 1. Remove Duplicates from List
        // Given an ArrayList of integers, remove all duplicate elements and return the updated list.
        // Example: Input: [1, 2, 2, 3, 1, 4]  Output: [1, 2, 3, 4]
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4));
        List<Integer> noDuplicates = new ArrayList<>(new LinkedHashSet<>(list1));
        System.out.println("1. Remove Duplicates: " + noDuplicates);

        // 2. Find Maximum in List
        // Write a method that takes a List of integers and returns the maximum element.
        // Example: Input: [5, 1, 8, 3]  Output: 8
        List<Integer> list2 = Arrays.asList(5, 1, 8, 3);
        int max = Collections.max(list2);
        System.out.println("2. Maximum Element: " + max);

        // 3. Reverse a List (without using Collections.reverse)
        // Example: Input: [10, 20, 30, 40]  Output: [40, 30, 20, 10]
        List<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> reversed = new ArrayList<>();
        for (int i = list3.size() - 1; i >= 0; i--) {
            reversed.add(list3.get(i));
        }
        System.out.println("3. Reversed List: " + reversed);

        // 4. Merge Two Sorted Lists
        // Example: Input: [1, 3, 5] and [2, 4, 6]  Output: [1, 2, 3, 4, 5, 6]
        List<Integer> list4a = Arrays.asList(1, 3, 5);
        List<Integer> list4b = Arrays.asList(2, 4, 6);
        List<Integer> merged = new ArrayList<>(list4a);
        merged.addAll(list4b);
        Collections.sort(merged);
        System.out.println("4. Merged Sorted List: " + merged);

        // 5. Find Second Largest Element
        // Example: Input: [7, 2, 9, 4, 9]  Output: 7
        List<Integer> list5 = Arrays.asList(7, 2, 9, 4, 9);
        Set<Integer> unique = new TreeSet<>(list5);
        List<Integer> sorted = new ArrayList<>(unique);
        int secondLargest = sorted.get(sorted.size() - 2);
        System.out.println("5. Second Largest: " + secondLargest);

        // 6. Check if List is Palindrome
        // Example: Input: [1, 2, 3, 2, 1]  Output: true
        List<Integer> list6 = Arrays.asList(1, 2, 3, 2, 1);
        boolean isPalindrome = true;
        for (int i = 0; i < list6.size() / 2; i++) {
            if (!list6.get(i).equals(list6.get(list6.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("6. Is Palindrome: " + isPalindrome);

        // 7. Remove Element from List
        // Example: Input: [1, 2, 3, 2, 4] and x = 2  Output: [1, 3, 4]
        List<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4));
        int x = 2;
        list7.removeIf(n -> n == x);
        System.out.println("7. After Removing " + x + ": " + list7);

        // 8. Find Intersection of Two Lists
        // Example: Input: [1, 2, 3, 4] and [3, 4, 5, 6]  Output: [3, 4]
        List<Integer> list8a = Arrays.asList(1, 2, 3, 4);
        List<Integer> list8b = Arrays.asList(3, 4, 5, 6);
        List<Integer> intersection = new ArrayList<>();
        for (int n : list8a) {
            if (list8b.contains(n) && !intersection.contains(n)) {
                intersection.add(n);
            }
        }
        System.out.println("8. Intersection: " + intersection);

        // 9. Move Zeros to End
        // Example: Input: [0, 1, 0, 3, 12]  Output: [1, 3, 12, 0, 0]
        List<Integer> list9 = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
        List<Integer> result9 = new ArrayList<>();
        int zeroCount = 0;
        for (int n : list9) {
            if (n != 0) result9.add(n);
            else zeroCount++;
        }
        for (int i = 0; i < zeroCount; i++) result9.add(0);
        System.out.println("9. Zeros Moved to End: " + result9);

        // 10. Rotate List
        // Example: Input: [1, 2, 3, 4, 5] and k = 2  Output: [4, 5, 1, 2, 3]
        List<Integer> list10 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list10.size();
        k = k % n;
        List<Integer> rotated = new ArrayList<>(list10.subList(n - k, n));
        rotated.addAll(list10.subList(0, n - k));
        System.out.println("10. Rotated by " + k + ": " + rotated);
    }
}
