import java.util.Arrays;

/**
 * <p>Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code><em> if </em><code>ransomNote</code><em> can be constructed by using the letters from </em><code>magazine</code><em> and </em><code>false</code><em> otherwise</em>.</p>
 *
 * <p>Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <pre><strong>Input:</strong> ransomNote = "a", magazine = "b"
 * <strong>Output:</strong> false
 * </pre>
 * <p><strong class="example">Example 2:</strong></p>
 * <pre><strong>Input:</strong> ransomNote = "aa", magazine = "ab"
 * <strong>Output:</strong> false
 * </pre>
 * <p><strong class="example">Example 3:</strong></p>
 * <pre><strong>Input:</strong> ransomNote = "aa", magazine = "aab"
 * <strong>Output:</strong> true
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters.</li>
 * </ul>
 *
 * <div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>计数</li></div></div><br><div><li>👍 630</li><li>👎 0</li></div>
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int chars_count[] = new int[26];
        Arrays.fill(chars_count, 0);
        char chars[] = magazine.toCharArray();
        for (char c : chars) {
            chars_count[c - 'a']++;
        }
        chars = ransomNote.toCharArray();
        for (char c : chars) {
            chars_count[c - 'a']--;
        }
        for (int count : chars_count) {
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
