package two.ex;

public class Ex1103 {
    /**
     * 0 - 9 弹栈 压栈不可能存在的数值
     * 4 3 2 1 0 9 8 7 6 5  +01234 -43210 +56789 -98765
     * 4 6 8 7 5 3 2 9 0 1
     * 2 5 6 7 4 8 9 3 1 0
     * 4 3 2 1 0 5 6 7 8 9
     * 1 2 3 4 5 6 9 8 7 0
     * 0 4 6 5 3 8 1 7 2 9
     * 1 4 7 9 8 6 5 3 0 2
     * 2 1 4 3 6 5 8 7 9 0
     * 规律:下一个值最小为上一个未出现的值的最大值
     */
}