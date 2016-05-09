package HumanResource;

/**
 * Created by Tnecesoc on 2016/5/8.
 */
public class HumanResourceDepartment {

    public static class visual_info {
        public String index;
        public String name;
        public int contribution;
        public int level;

        visual_info(Employee who) {
            this.index = who.index;
            this.name = who.name;
            this.contribution = who.contribution;
            this.level = who.level;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Employee> T hire(Class EmployeeType,String name,String index) {
        T fresher = null;

        try {
            fresher = (T) EmployeeType.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(fresher != null) {
            fresher.name = name;
            fresher.index = index;
        }

        return fresher;
    }

    public static void promoteTo(Employee who,int level) {
        who.level = level;
    }

    public static void evaluateContributionAs(Employee who,int value) {
        who.contribution = value;
    }

    public static void giveNewTitle(Employee who,Class TitleType) {
        Employee it = who;
        while(it.sub_title != null)
            it = it.sub_title;

        it.sub_title = hire(TitleType,who.name,who.index);
    }

    public static visual_info giveInfo(Employee who) {
        return new visual_info(who);
    }

    public static String giveTitleInfo(Employee who) {
        if(who.sub_title == null)
            return who.getClass().getSimpleName();

        String ans = giveTitleInfo(who.sub_title);

        return who.getClass().getSimpleName() + " and " + ans;
    }

    public static Employee getSubTitleOf(Employee who) {
        return who.sub_title;
    }
}
