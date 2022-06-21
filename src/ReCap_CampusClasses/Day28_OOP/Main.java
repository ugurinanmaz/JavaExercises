package ReCap_CampusClasses.Day28_OOP;

public class Main {

    public static void main(String[] args) {

        Register student1 = new Register();
        student1.Name = "Ugur";
        student1.LastName = "Inanmaz";
        student1.batchNum= 6;
        student1.role = "Student";

        Register student2 = new Register();
        student2.Name = "Alex";
        student2.LastName = "Joshua";
        student2.batchNum= 6;
        student2.role = "Student";
        student2.groupCode = "Group 8";

        Register teacher1 = new Register();
        teacher1.Name= "Halit";
        teacher1.LastName= "Kocaaga";
        teacher1.role = "Java Class Teacher";

        RegisterManager registerManager = new RegisterManager();
        registerManager.addToSystem(student1);
        registerManager.addToSystem(teacher1);





    }
}
