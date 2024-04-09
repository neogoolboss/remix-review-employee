package remix;

import remix.common.EmployeeDTO;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeById(int id);

    int insertEmployee(EmployeeDTO employee);


    int deleteEmployee(String id);

    int modifyEmployee(EmployeeDTO employee);
}
