import com.mybatis.MapperApplication;
import com.mybatis.entity.Goods;
import com.mybatis.entity.GoodsExample;
import com.mybatis.entity.GradeWithStudents;
import com.mybatis.entity.StudentWithAddress;
import com.mybatis.mapper.GoodsMapper;
import com.mybatis.mapper.GradeMapper;
import com.mybatis.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
//https://blog.csdn.net/qq_20610631/article/details/81671997  链接地址如下：
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MapperApplication.class)
public class TestMapper {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private GradeMapper gradeMapper;

    @Test
    public void test() {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andIdGreaterThan(4);
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        System.out.println(goods);
        System.out.println("1");
    }
    @Test
    public void testStudentMapper() {
        StudentWithAddress studentWithAddress = studentMapper.selectStudentAndAddressByPrimaryKey(1);
        System.out.println(studentWithAddress);
    }
    @Test
    public void testGradeMapper() {
        GradeWithStudents gradeWithStudents = gradeMapper.selectGradeWithStudentsByPrimaryKey(2);
        System.out.println(gradeWithStudents);
    }
}
