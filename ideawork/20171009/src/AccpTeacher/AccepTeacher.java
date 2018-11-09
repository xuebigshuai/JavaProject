package AccpTeacher;

/**
 * Created by Administrator on 2017/10/13.
 */
public class AccepTeacher {
    private String name;
    private String school;

    public AccepTeacher(String name, String school) {
        this.name = name;
        this.school = school;
    }

    /**
     * 授课方法
     */
    public void  giveLesson(){
        System.out.println("讲解知识点");
        System.out.println("总结提问");
        name.equals("1");
        System.out.println();
    }
    /**
     * 自我介绍
     */
    public void  introduction(){
        System.out.println("大家好，我是"+name+",来自"+school);
    }
}
