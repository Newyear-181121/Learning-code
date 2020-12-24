package ny.base.annotation.解析注解;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 20:33
 * @version: 0.0.1
 * @description: Student
 */
@StxTable("tb_student")
public class Student {
    @StxField(columnName = "id",type = "int",length = 10)
    private int id ;
    @StxField(columnName = "studentName",type = "varchar",length = 10)
    private String studentName;
    @StxField(columnName = "age",type = "int",length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
