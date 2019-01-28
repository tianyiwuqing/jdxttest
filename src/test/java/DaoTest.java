
import java.util.Date;import com.lynu.bean.TableEmployee;
import com.lynu.dao.TableEmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 28449
 * @since 2019-01-21 16:22
 */
public class DaoTest {

    @Test
    void daoTest() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        TableEmployeeMapper mapper = context.getBean(TableEmployeeMapper.class);
        TableEmployee employee=new TableEmployee();
        employee.setEmployeename("testMB");
        employee.setUsername("MB");
        employee.setPassword("123");
        employee.setSex(0);
        employee.setTelephone("");
        employee.setAddress("");
        employee.setIsValid(0);
        employee.setIsLeader(0);
        employee.setDescription("");
        employee.setType(0);
        employee.setDelFlag(0);
        employee.setPhotograph("");
        employee.setCreateTime(new Date());
        employee.setUpdateTime(new Date());
        int insert = mapper.insert(employee);
        if (insert>0)
        {
            System.out.println("OK");
        }


    }

}
