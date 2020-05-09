import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Employee {

    public static void main(String[] args) throws IOException{

        ArrayList<Employee_Info> ar_emp = new ArrayList<Employee_Info>();
        BufferedReader br = null;
        Employee_Info e = null;
        br = new BufferedReader(new FileReader("C:/Users/home/Desktop/Emp_Details.txt"));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                String data[] = line.split("\t");
                 e = new Employee_Info();
                 e.setDept_id(Integer.parseInt(data[0]));
                 e.setEmp_name(data[1]);
                 e.setCity(data[2]);
                 e.setSalary(Integer.parseInt(data[3]));

                 ar_emp.add(e);
            }
            for(Employee_Info i : ar_emp){
                System.out.println(i.getDept_id()+","+i.getEmp_name()+","+i.getCity()+","+i.getSalary());

            }
            br.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
public class Employee_Info {

    private static int dept_id;
    private static String emp_name;
    private static String city;
    private static int salary;

    public static int getDept_id() {
        return dept_id;
    }
    public static void setDept_id(int dept_id) {
        Employee_Info.dept_id = dept_id;
    }
    public static String getEmp_name() {
        return emp_name;
    }
    public static void setEmp_name(String emp_name) {
        Employee_Info.emp_name = emp_name;
    }
    public static String getCity() {
        return city;
    }
    public static void setCity(String city) {
        Employee_Info.city = city;
    }
    public static int getSalary() {
        return salary;
    }
    public static void setSalary(int salary) {
        Employee_Info.salary = salary;
    }


}
