package lrf.spring.handle;

import lrf.spring.duty.Chinese;
import lrf.spring.duty.MathImpl;

/**
 * @Author lrf
 * @Date 2019/04/17 22:12:10
 * @Version 1.0.0
 **/
public class TeacherImpl implements TeacherInter {

    private MathImpl math;
    private Chinese chinese;

    /**
     * 构造器注入bean
     * @param math
     * @param chinese
     */
//    public TeacherImpl(MathImpl math,Chinese chinese) {
//        this.math = math;
//        this.chinese = chinese;
//    }

    /**
     * 属性注入,其实并不定是setter方法，方法名可以随便起
     * 但是每个方法只能有一个参数
     * @param chinese
     */
    public void setChinese(Chinese chinese) {
        this.chinese = chinese;
    }
    public void setMath(MathImpl math) {
        this.math = math;
    }

    @Override
    public void teacher() {
        System.out.println("现在开始教数学");
        math.algorithm();

        System.out.println("\n");
        System.out.println("现在开始教语文");
        chinese.poetry();
    }
}
