# Problem Solving Log

Welcome to my problem-solving log!  
Here are the problems I've solved categorized by platform.

---
# May 2025


### Codeforces
- [A. Square Year](squareyear.java)
- ⭐[B. Not Quite a Palindromic String](notquitepalindrome.java)
 
----
### LeetCode 

*1. Two Sum*
<details>
 <summary>Solution
</summary>

``` 
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int i = 0, j; // pointers
        int ans = 0;
        // [1,1,1] ->
        // i,j
        for (; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {

                if (sum >= k) {
                    sum -= nums[i];
                }
                if (sum < k) {
                    sum += nums[i] + nums[j];
                }
                if (sum == k)
                    ans++;

                System.out.print(sum + " ,");
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = {1, 2, 3}, k = 3;
        int a = obj.subarraySum(nums, k);
        System.out.println(a);


    }
}

```

</details>

*560. Subarray Sum Equals K*
<details>
 <summary>Solution</summary>

``` 

class Solution {
    public int subarraySum(int[] nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target)
                    ans++;
            }

        }
        return ans;
    }
}
```
</details>


*128. Longest Consecutive Sequence*
<details>
 <summary>Solution</summary>

``` 

class Solution {
    public int subarraySum(int[] nums, int target) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target)
                    ans++;
            }

        }
        return ans;
    }
}
```
</details>

*217. Contains Duplicate*
<details>
 <summary>Solution</summary>

``` 
 
```
</details>

---

---

### CodeChef
- [Bit Flip](Solutions/CodeChef/bit_flip.cpp)
- [Starters Problem](Solutions/CodeChef/starters_problem.cpp)
