import java.util.Objects;

/**
 * Created by Administrator on 2017/10/10.
 */
public class MyFirst {

    private  String  name;
    private  int  age;
    private  boolean falg;
    private  double number;

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<22){
           throw  new IllegalArgumentException("输入的年龄应该大于等于22岁");

        }else{
            this.age = age;
        }



    }



    @Override
    public String toString() {
        return "MyFirst{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", falg=" + falg +
                ", number=" + number +
                '}';
    }
}
