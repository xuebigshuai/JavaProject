package AccpTeacher;

import interfacePackage.AccpCenter;

/**
 * Created by Administrator on 2017/10/13.
 */
public class TeacherDep implements AccpCenter {
    private  String count;

    public TeacherDep(String count) {
        this.count = count;
    }

    @Override
    public String detail() {
        return count;
    }
}
