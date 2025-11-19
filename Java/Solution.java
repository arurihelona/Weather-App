/*
Smallest integer with double the digit sum
------------------------------------------------------
Write a function 

class Solution { public int solution(int N);}

that, given an integer N, returns the smallest integer greater than N  where the sum of its digits 
is twice as big as the sum of the digits of N.

Examples:
---------
1.Given N=14, the function should return 19. The sum of digits of 19 (1+9=10) is twice as big as 
the sum of digits of 14 (1+4=5).

2.Given N=10, the function should return 11.

3.Given N=99, the function should return 9999.

Assumption:
-----------
N is an integer within the range [1..500].

In your solution, focus on correctness; the performance of the solution will not be the focus of
the assessment.
Sample input=99
Sample output=9999
*/
import java.util.Scanner;
class Solution {
    public int solution(int N) {
        int target = 2 * digitSum(N);
        for (int x = N + 1; ; x++) {
            if (digitSum(x) == target) {
                return x;
            }
        }
    }
    
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.solution(N));
    }
}