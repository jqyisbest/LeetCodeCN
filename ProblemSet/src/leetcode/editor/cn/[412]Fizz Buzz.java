import java.util.ArrayList;
import java.util.List;

/**
<p>Given an integer <code>n</code>, return <em>a string array </em><code>answer</code><em> (<strong>1-indexed</strong>) where</em>:</p>

<ul> 
 <li><code>answer[i] == "FizzBuzz"</code> if <code>i</code> is divisible by <code>3</code> and <code>5</code>.</li> 
 <li><code>answer[i] == "Fizz"</code> if <code>i</code> is divisible by <code>3</code>.</li> 
 <li><code>answer[i] == "Buzz"</code> if <code>i</code> is divisible by <code>5</code>.</li> 
 <li><code>answer[i] == i</code> (as a string) if none of the above conditions are true.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p> 
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["1","2","Fizz"]
</pre>
<p><strong class="example">Example 2:</strong></p> 
<pre><strong>Input:</strong> n = 5
<strong>Output:</strong> ["1","2","Fizz","4","Buzz"]
</pre>
<p><strong class="example">Example 3:</strong></p> 
<pre><strong>Input:</strong> n = 15
<strong>Output:</strong> ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
</pre> 
<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li> 
</ul>

<div><div>Related Topics</div><div><li>数学</li><li>字符串</li><li>模拟</li></div></div><br><div><li>👍 267</li><li>👎 0</li></div>
*/

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0&&i%5==0){
                result.add("FizzBuzz");
            } else if (i%3==0) {
                result.add("Fizz");
            }else if (i%5==0) {
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(i));
            }
        }
        return  result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
