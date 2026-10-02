import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen(res, n, n, new StringBuilder());

        return res;
    }

    void gen(List<String> res, int o, int c, StringBuilder cur) {
        if (o == 0 && c == 0) {
            res.add(cur.toString());
        }
        if (o > 0) {
            cur.append('(');
            gen(res, o - 1, c, cur);
            cur.setLength(cur.length() - 1);
        }
        if (c > 0 && c > o) {
            cur.append(')');
            gen(res, o, c - 1, cur);
            cur.setLength(cur.length() - 1);
        }
    }
}