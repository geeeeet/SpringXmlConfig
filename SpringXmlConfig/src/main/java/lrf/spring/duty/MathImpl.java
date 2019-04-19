package lrf.spring.duty;

/**
 * @Author lrf
 * @Date 2019/04/17 22:19:23
 * @Version 1.0.0
 **/
public class MathImpl implements Math {

    private String algorithm;

    /**
     * 第一种方法：构造器注入字面量
     * @param algorithm
     */
//    public MathImpl(String algorithm) {
//        this.algorithm = algorithm;
//    }


    /**
     * 第二种方法：属性注入字面量
     * @param algorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void algorithm() {
        System.out.println("我现在教 "+algorithm+" 算法");
    }
}
