package lrf.spring;

import lrf.spring.handle.TeacherInter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lrf
 * @Date 2019/04/17 22:09:43
 * @Version 1.0.0
 **/
public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring.xml");
        TeacherInter teacherInter = context.getBean(TeacherInter.class);
        teacherInter.teacher();
    }
}
