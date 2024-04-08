package remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("========== 메뉴 관리 ==========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 삭제");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1 :
                    employeeController.selectAllEmployee();
                    break;
                case 2 :
                    employeeController.selectEmployeeById(inputEmployeeId());
                    break;
                case 3 :
                    employeeController.registEmployee(inputEmployee());
                    break;
                case 4 :
                    employeeController.modifyEmployee(inputModifyEmployee());
                    break;
                case 5 :
                    employeeController.deleteEmployee(inputEmployeeId());
                    break;
                default :
                    System.out.println("번호를 다시 입력하세요. (1 ~ 5)");
            }

        } while(true);

    }



    private static Map<String, String> inputEmployeeId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 ID를 입력하세요 : ");
        String id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("id", id);

        return parameter;
    }
    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("등록하실 직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("직원의 주민등록번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("등록하실 EMAIL을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("등록하실 연락처를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("부서코드를 입력하세요 : ");
        String departmentCode = sc.nextLine();
        System.out.print("직업코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("급여코드를 입력하세요 : ");
        String salaryLevel = sc.nextLine();
        System.out.print("급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("담당관리자를 입력하세요 : ");
        String managerID = sc.nextLine();
        System.out.print("입사일을 입력하세요 : ");
        String hireDate = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("departmentCode", departmentCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salaryLevel", salaryLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerID", managerID);
        parameter.put("hireDate", hireDate);


        return parameter;
    }
    private static Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정하실 직원 ID를 입력하세요 : ");
        String id = sc.nextLine();
        System.out.print("수정하실 직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정하실 직원 주민등록번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("수정하실 EMAIL을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("수정하실 연락처를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("수정하실 부서코드를 입력하세요 : ");
        String departmentCode = sc.nextLine();
        System.out.print("수정하실 직업코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("수정하실 급여코드를 입력하세요 : ");
        String salaryLevel = sc.nextLine();
        System.out.print("수정하실 급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("수정하실 보너스를 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("수정하실 담당관리자를 입력하세요 : ");
        String managerID = sc.nextLine();
        System.out.print("수정하실 입사일을 입력하세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("수정하실 퇴사일을 입력하세요 : ");
        String entDate = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("id", id);
        parameter.put("name", name);
        parameter.put("no", no);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("departmentCode", departmentCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salaryLevel", salaryLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("managerID", managerID);
        parameter.put("hireDate", hireDate);
        parameter.put("entDate", entDate);

        return parameter;

    }

}
