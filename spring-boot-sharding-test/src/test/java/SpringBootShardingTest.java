import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import entity.Course;
import mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootSharding.class)
public class SpringBootShardingTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            if (i % 2 == 0) {
                course.setCname("java-" + i);
            } else {
                course.setCname("match-" + i);
            }
            course.setUserId(100L);
            course.setCstatus("normal");
            courseMapper.insert(course);
        }
    }

    @Test
    public void test01() {
        for (int i = 0; i < 10; i++) {
            QueryWrapper<Course> wrapper = new QueryWrapper();
            wrapper.like("cname", "java");
            List<Map<String, Object>> maps = courseMapper.selectMaps(wrapper);
            System.out.println(maps);
        }
    }
}
