package Day05;

import org.junit.Assert;
import org.junit.Test;

public class Main {


    @Test
    public void test(){
        String str="Volkan";
        String ilkHarg=str.substring(0,1);
        String beklenen= "S";
       // Assert.assertEquals(beklenen,ilkHarg);
        boolean bb=str.contains("h");
        Assert.assertTrue(bb);
    }
}
