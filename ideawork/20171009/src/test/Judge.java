package test;

import AccpTeacher.AccepDoNetTeacher;
import AccpTeacher.AccepTeacher;
import AccpTeacher.AccpJavaTeacher;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/10/13.
 */
public class Judge {
    // 程序的多态性
    public void judge(AccepTeacher t) {
        t.introduction();
        t.giveLesson();
    }


    public static void main(String[] args) {
        Judge judge = new Judge();
        judge.judge(new AccpJavaTeacher("薛煜帅", "长安大学"));
        judge.judge(new AccepDoNetTeacher("xuedashui", "tianda"));
        System.out.printf("111");
        System.out.println("123");
        System.out.printf("456");
        System.out.println("789");
        Class clazz=judge.getClass();
        Method[] dd=clazz.getMethods();
        for(int i=0;i<dd.length;i++){
            System.out.println(dd[i]);

        }

    }

}
