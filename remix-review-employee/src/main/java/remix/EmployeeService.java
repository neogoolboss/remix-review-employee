package remix;

import org.apache.ibatis.session.SqlSession;
import remix.common.EmployeeDTO;

import java.util.List;
import java.util.Map;

import static remix.common.Template.getSqlSesstion;

public class EmployeeService {

    private EmployeeMapper mapper;

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSesstion();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeDTOList = employeeMapper.selectAllEmployee();

        sqlSession.close();

        return employeeDTOList;

    }

    public EmployeeDTO selectEmployeeById(int id) {

        SqlSession sqlSession = getSqlSesstion();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO employee = employeeMapper.selectEmployeeById(id);

        sqlSession.close();

        return employee;

    }

    public boolean registEmployee(EmployeeDTO employee) {

        SqlSession sqlSession = getSqlSesstion();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.insertEmployee(employee);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyEmployee(EmployeeDTO employee) {

        SqlSession sqlSession = getSqlSesstion();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.modifyEmployee(employee);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;

    }

    public boolean deleteEmployee(String id) {

        SqlSession sqlSession = getSqlSesstion();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = employeeMapper.deleteEmployee(id);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

//    public void modifyEmployee(Map<String, String> parameter) {
//
//        SqlSession sqlSession = getSqlSesstion();
//
//        mapper = sqlSession.getMapper(EmployeeMapper.class);
//
//        int result = mapper.modifyEmployee(parameter);
//
//        if(result > 0) {
//            System.out.println("직원 정보 변경에 성공함");
//            sqlSession.commit();
//        } else {
//            System.out.println("직원 정보 변경에 실패함 ㅠㅠ");
//            sqlSession.rollback();
//        }
//
//        sqlSession.close();
//
//    }
}
