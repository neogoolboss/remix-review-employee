package remix.common;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import remix.EmployeeMapper;

public class Template {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/employee";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSesstion() {
        if(sqlSessionFactory == null) {
            Environment environment =
                    new Environment("dev",
                                     new JdbcTransactionFactory(),
                                     new PooledDataSource(DRIVER, URL, USER, PASSWORD));

            Configuration configuration = new Configuration(environment);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

            configuration.addMapper(EmployeeMapper.class);
        }

        return sqlSessionFactory.openSession(false);

    }

}