package lrf.spring.duty;

import java.util.List;

/**
 * @Author lrf
 * @Date 2019/04/17 22:16:28
 * @Version 1.0.0
 **/
public class ChineseImpl implements Chinese {

    private List<String> poetry;

    /**
     * 第一种方法：构造器注入字面量
     * @param poetry
     */
//    public ChineseImpl(List<String> poetry) {
//        this.poetry = poetry;
//    }

    /**
     * 第二种方法：属性注入字面量
     * @param poetry
     */
    public void setPoetry(List<String> poetry) {
        this.poetry = poetry;
    }

    @Override
    public void poetry() {
        for (String str: poetry) {
            System.out.println("我现在教 "+str+" 的诗");
        }
    }
}
