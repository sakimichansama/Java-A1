public class HealthProfessional {
    private int ID;
    private String name;
    private String basicInfo;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 第二个构造函数初始化所有实例变量
    public HealthProfessional(int ID, String name, String basicInfo) {
        this.ID = ID;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }

    // 主方法用于测试HealthProfessional类
    public static void main(String[] args) {
        HealthProfessional hp = new HealthProfessional(1, "Dr. Smith", "Specializes in cardiology");
        hp.printDetails();
    }
}
