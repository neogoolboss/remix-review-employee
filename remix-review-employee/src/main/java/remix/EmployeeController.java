package remix;

import remix.common.EmployeeDTO;
import remix.common.PrintResult;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> employeeDTOList = employeeService.selectAllEmployee();

        if(employeeDTOList != null) {
            printResult.printEmployeeList(employeeDTOList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeById(Map<String, String> parameter) {

        int id = Integer.parseInt(parameter.get("id"));

        EmployeeDTO employee = employeeService.selectEmployeeById(id);

        if(employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

    public void registEmployee(Map<String, String> parameter) {

        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String departmentCode = parameter.get("departmentCode");
        String jobCode = parameter.get("jobCode");
        String salaryLevel = parameter.get("salaryLevel");
        int salary = Integer.parseInt(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerID = parameter.get("managerID");
        String hireDate = parameter.get("hireDate");
        java.sql.Date changeHireDate = java.sql.Date.valueOf(hireDate);

//        String entDate = parameter.get("entDate");
//        String endYn = parameter.get("entYn");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setName(name);
        employee.setNo(no);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartmentCode(departmentCode);
        employee.setJobCode(jobCode);
        employee.setSalaryLevel(salaryLevel);
        employee.setSalary(salary);
        employee.setBonus(bonus);
        employee.setManagerID(managerID);
        employee.setHireDate(changeHireDate);

        if(employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyEmployee(Map<String, String> parameter) {

        String id = parameter.get("id");
        String name = parameter.get("name");
        String no = parameter.get("no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String departmentCode = parameter.get("departmentCode");
        String jobCode = parameter.get("jobCode");
        String salaryLevel = parameter.get("salaryLevel");
//        String salaryString = parameter.get("salary");
//        Integer salary = (salaryString != null) ? Integer.parseInt(salaryString) : null;
//        String bonusString = parameter.get("bonus");
//        Double bonus = (bonusString != null) ? Double.parseDouble(bonusString) : null;
        String salaryString = parameter.get("salary");
        Integer salary = null;
        if (salaryString != null && !salaryString.isEmpty()) {
            try {
                salary = Integer.parseInt(salaryString);
            } catch (NumberFormatException e) {
                // 예외 처리
                e.printStackTrace(); // 예외 처리 방법을 결정해야 함
            }
        }
        String bonusString = parameter.get("bonus");
        Double bonus = null;
        if (bonusString != null && !bonusString.isEmpty()) {
            try {
                bonus = Double.parseDouble(bonusString);
            } catch (NumberFormatException e) {
                // 예외 처리
                e.printStackTrace(); // 예외 처리 방법을 결정해야 함
            }
        }

        String managerID = parameter.get("managerID");
//        String hireDate = parameter.get("hireDate");
//        java.sql.Date changeHireDate = java.sql.Date.valueOf(hireDate);
        String hireDate = parameter.get("hireDate");
        java.sql.Date changeHireDate = null;
        if (hireDate != null && !hireDate.isEmpty()) {
            try {
                changeHireDate = java.sql.Date.valueOf(hireDate);
            } catch (IllegalArgumentException e) {
                // 예외 처리
                e.printStackTrace(); // 예외 처리 방법을 결정해야 함
            }
        }
//        String entDate = parameter.get("entDate");
//        java.sql.Date changeEntDate = java.sql.Date.valueOf(entDate);
        String entDate = parameter.get("entDate");
        java.sql.Date changeEntDate = null;
        if (entDate != null && !entDate.isEmpty()) {
            try {
                changeEntDate = java.sql.Date.valueOf(entDate);
            } catch (IllegalArgumentException e) {
                // 예외 처리
                e.printStackTrace(); // 예외 처리 방법을 결정해야 함
            }
        }

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);
        employee.setName(name);
        employee.setNo(no);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartmentCode(departmentCode);
        employee.setJobCode(jobCode);
        employee.setSalaryLevel(salaryLevel);
        employee.setSalary(salary);
        employee.setBonus(bonus);
        employee.setManagerID(managerID);
        employee.setHireDate(changeHireDate);
        employee.setEntDate(changeEntDate);

        if(employeeService.modifyEmployee(employee)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }

    }

    public void deleteEmployee(Map<String, String> parameter) {

        String id = parameter.get("id");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(id);

        if(employeeService.deleteEmployee(id)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }
}
