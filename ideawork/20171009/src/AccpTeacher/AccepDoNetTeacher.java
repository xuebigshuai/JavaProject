package AccpTeacher;

/**
 * Created by Administrator on 2017/10/13.
 */
public class AccepDoNetTeacher extends AccepTeacher {
    public AccepDoNetTeacher(String name, String school) {
        super(name, school);
    }

    @Override
    public void giveLesson() {
        System.out.println("开始讲课！！！");
        super.giveLesson();
    }

}
