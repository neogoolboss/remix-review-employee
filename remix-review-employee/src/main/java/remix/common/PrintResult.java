package remix.common;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeDTOList) {

        for(EmployeeDTO employee : employeeDTOList) {
            System.out.println(employee);
        }

    }


    public void printErrorMessage(String errorCode) {

        String errorMessage ="";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "직원 전체 조회를 실패하셨습니다.";
                break;
            case "selectOne" :
                errorMessage = "직원 상세 조회를 실패하셨습니다.";
                break;
            case "insert" :
                errorMessage = "신규 직원 등록을 실패하셨습니다.";
                break;
            case "modify" :
                errorMessage = "직원 정보 수정에 실패하셨습니다.";
                break;
            case "delete" :
                errorMessage = "직원 정보 삭제에 실패하셨습니다.";
                break;
        }

        System.out.println(errorMessage);

    }
    public void printEmployee(EmployeeDTO employee) {

        System.out.println(employee);

    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "insert" :
                successMessage = "신규 직원 등록을 성공했습니다.";
                break;
            case "modify" :
                successMessage = "직원 정보 수정을 성공했습니다.";
                break;
            case "delete" :
                successMessage = "직원 정보 삭제를 성공했습니다.";
                break;
        }

        System.out.println(successMessage);
    }
}
