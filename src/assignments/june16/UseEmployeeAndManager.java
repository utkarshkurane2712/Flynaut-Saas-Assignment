package assignments.june16;

public class UseEmployeeAndManager {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.work();  // Calls Employee's work()

        Manager mgr = new Manager();
        mgr.work();  // Calls Manager's overridden work()
    }

}
