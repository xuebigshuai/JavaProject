package AccpTeacher;

import interfacePackage.AccpCenter;

/**
 * Created by Administrator on 2017/10/13.
 */
public class CenterDep implements AccpCenter {
    private  Printer printer=new Printer();
    private String count;

    public CenterDep(String count) {
        this.count = count;
    }

    @Override
    public String  detail() {
        return count;
    }
    public void print(AccpCenter a){
        System.out.println("开始打印...........");
        System.out.println(ACCp);
        printer.print(a.detail());
    }

    public static void main(String[] args) {
        CenterDep center=new CenterDep("创新中心");
        TeacherDep teacherDep=new TeacherDep("我是一名Accp老师");
        center.print(center);
        center.print(teacherDep);
    }
}
