import com.yuyu.classAdapterMode.VoltAdapter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yuyu on 2017/7/5.
 */
public class ClassAdapterTest {

    @Test
    public void test5(){
        VoltAdapter adapter = new VoltAdapter();
        Assert.assertEquals(5,adapter.getVolt5());
    }

    @Test
    public void test220(){
        VoltAdapter adapter = new VoltAdapter();
        Assert.assertEquals(220,adapter.getVolt220());
    }

}
