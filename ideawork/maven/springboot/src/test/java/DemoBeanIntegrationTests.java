import com.smart.config.devTestBean;
import com.smart.domain.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/3/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {devTestBean.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected="from production profile";
        String actual=testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
