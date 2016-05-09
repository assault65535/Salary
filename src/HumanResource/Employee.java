package HumanResource;

/**
 * Created by Tnecesoc on 2016/5/7.
 */
public abstract class Employee {
    public String index;
    public String name;
    int contribution;
    int level;

    Employee sub_title;

    protected Employee() {
        this.level = 1;
        this.contribution = 100;
    }

    protected Employee(String name,String index) {
        this.name = name;
        this.index = index;
        this.level = 1;
        this.contribution = 100;
    }
}
