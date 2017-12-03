package ch1.fundamentals;

import java.util.Stack;

/**
 * Dijkstra 双栈算术表达式求值算法 O(N)
 * 1. 将操作数压入操作数栈
 * 2. 将运算符压入运算符栈
 * 3. 忽略左括号
 * 4. 在遇到右括号时，弹出一个运算符，弹出所需数量的操作数，并将运算符和操作数的运算结果压入操作数栈
 */
public class Evaluate {

    public static double evaluate(String string) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        for (int i = 0; i < string.length(); i++) {
            String s = String.valueOf(string.charAt(i));

            //运算符压入 操作符栈
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals(")")) {
                //遇到右括号开始计算
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                if (op.equals("-")) v = vals.pop() - v;
                if (op.equals("*")) v = vals.pop() * v;
                if (op.equals("/")) v = vals.pop() / v;

                vals.push(v);
            } else {
                //数字压入 操作数栈
                vals.push(Double.parseDouble(s));
            }

        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String s = "(1+((2+3)*(4*5)))";
        double ret = evaluate(s);
        System.out.println(ret);
    }
}