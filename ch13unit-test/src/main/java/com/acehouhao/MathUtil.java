package com.acehouhao;

/**
 * Created by Hao HOU on 2017/5/16.
 */
public class MathUtil {
    private MathHelper mathHelper;
    public MathUtil(MathHelper mathHelper) {
        this.mathHelper = mathHelper;
    }

    public MathUtil() {}

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 1; i <= a; i++){
            result = mathHelper.add(result, b);
        }
        return result;
    }
}
