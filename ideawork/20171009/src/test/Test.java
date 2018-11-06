package test;

import AccpTeacher.AccpJavaTeacher;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class Test {
    public static void main(String[] args) {
        AccpJavaTeacher java=new AccpJavaTeacher("薛煜帅","长安大学");
        java.giveLesson();
        java.introduction();
        int a=1;
        for(int i=0;i<8;i++){
            a*=2;
            System.out.println(a);
        }
        System.out.println(a);
        Scanner sc=new Scanner(System.in);
        String  in=sc.nextLine();
        System.out.println("输入的是"+in);

    }
}
