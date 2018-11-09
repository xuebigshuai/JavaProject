package AccpTeacher;

/**
 * Created by Administrator on 2017/10/13.
 */
public class AccpJavaTeacher extends AccepTeacher {

    public AccpJavaTeacher(String name, String school) {
        super(name, school);
    }

    @Override
    public void introduction() {
        super.introduction();
    }

    @Override
    public void giveLesson() {
        System.out.println("启动eclipse");
        super.giveLesson();
    }

    //    public void giveLesson(){
//        System.out.println("启动Idea");
//    }

}
