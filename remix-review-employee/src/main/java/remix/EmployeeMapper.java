package remix;

import remix.common.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int insertEmployee(EmployeeDTO employee);

    int modifyEmployee(EmployeeDTO employee);

    int deleteEmployee(String id);
}
