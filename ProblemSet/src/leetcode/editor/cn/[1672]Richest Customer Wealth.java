import java.lang.reflect.Array;

/**
<p>You are given an <code>m x n</code> integer grid <code>accounts</code> where <code>accounts[i][j]</code> is the amount of money the <code>i​​​​​<sup>​​​​​​th</sup>​​​​</code> customer has in the <code>j​​​​​<sup>​​​​​​th</sup></code>​​​​ bank. Return<em> the <strong>wealth</strong> that the richest customer has.</em></p>

<p>A customer's <strong>wealth</strong> is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum <strong>wealth</strong>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[1,2,3],[3,2,1]]
<strong>Output:</strong> 6
<strong>Explanation</strong><strong>:</strong>
<span><code>1st customer has wealth = 1 + 2 + 3 = 6
</code></span><span><code>2nd customer has wealth = 3 + 2 + 1 = 6
</code></span>Both customers are considered the richest with a wealth of 6 each, so return 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[1,5],[7,3],[3,5]]
<strong>Output:</strong> 10
<strong>Explanation</strong>: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[2,8,7],[7,1,3],[1,9,5]]
<strong>Output:</strong> 17
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>m ==&nbsp;accounts.length</code></li> 
 <li><code>n ==&nbsp;accounts[i].length</code></li> 
 <li><code>1 &lt;= m, n &lt;= 50</code></li> 
 <li><code>1 &lt;= accounts[i][j] &lt;= 100</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li></div></div><br><div><li>👍 165</li><li>👎 0</li></div>
*/

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        for (int account[]:accounts) {
            for (int i = 1; i < account.length; i++) {
                account[0]+=account[i];
            }
            if (account[0]>max_wealth){
                max_wealth=account[0];
            }
        }
        return max_wealth;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
