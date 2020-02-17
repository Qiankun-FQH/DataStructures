package jww.qk.dataStructures.linked.exercise;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -10:25
 * @title
 **/
public class StudentNode {
    public int id;
    public String name;
    public int age;
    public String classId;

    public StudentNode next;

    public StudentNode(int id, String name, int age, String classId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "StudentNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId='" + classId + '\'' +
                '}';
    }
}
