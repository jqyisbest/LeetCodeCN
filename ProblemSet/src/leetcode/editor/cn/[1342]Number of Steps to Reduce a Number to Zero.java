/**
<p>Given an integer <code>num</code>, return <em>the number of steps to reduce it to zero</em>.</p>

<p>In one step, if the current number is even, you have to divide it by <code>2</code>, otherwise, you have to subtract <code>1</code> from it.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> num = 14
<strong>Output:</strong> 6
<strong>Explanation:</strong>&nbsp;
Step 1) 14 is even; divide by 2 and obtain 7.&nbsp;
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.&nbsp;
Step 4) 3 is odd; subtract 1 and obtain 2.&nbsp;
Step 5) 2 is even; divide by 2 and obtain 1.&nbsp;
Step 6) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> num = 8
<strong>Output:</strong> 4
<strong>Explanation:</strong>&nbsp;
Step 1) 8 is even; divide by 2 and obtain 4.&nbsp;
Step 2) 4 is even; divide by 2 and obtain 2.&nbsp;
Step 3) 2 is even; divide by 2 and obtain 1.&nbsp;
Step 4) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> num = 123
<strong>Output:</strong> 12
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>0 &lt;= num &lt;= 10<sup>6</sup></code></li> 
</ul>

<div><div>Related Topics</div><div><li>位运算</li><li>数学</li></div></div><br><div><li>👍 169</li><li>👎 0</li></div>
*/

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSteps(int num) {
        String s = Integer.toBinaryString(num);
        int result = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                result += 1;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
