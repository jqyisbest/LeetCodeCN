/**
<p>Given the <code>head</code> of a singly linked list, return <em>the middle node of the linked list</em>.</p>

<p>If there are two middle nodes, return <strong>the second middle</strong> node.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist1.jpg" style="width: 544px; height: 65px;" /> 
<pre>
<strong>Input:</strong> head = [1,2,3,4,5]
<strong>Output:</strong> [3,4,5]
<strong>Explanation:</strong> The middle node of the list is node 3.
</pre>

<p><strong class="example">Example 2:</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist2.jpg" style="width: 664px; height: 65px;" /> 
<pre>
<strong>Input:</strong> head = [1,2,3,4,5,6]
<strong>Output:</strong> [4,5,6]
<strong>Explanation:</strong> Since the list has two middle nodes with values 3 and 4, we return the second one.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li>The number of nodes in the list is in the range <code>[1, 100]</code>.</li> 
 <li><code>1 &lt;= Node.val &lt;= 100</code></li> 
</ul>

<div><div>Related Topics</div><div><li>链表</li><li>双指针</li></div></div><br><div><li>👍 784</li><li>👎 0</li></div>
*/

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> listNodes=new ArrayList<ListNode>();
        while (head!=null){
            listNodes.add(head);
            head=head.next;
        }
        int mid_index=listNodes.size()/2;
        return listNodes.get(mid_index);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
