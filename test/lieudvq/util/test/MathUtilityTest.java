/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lieudvq.util.test;

import java.sql.SQLException;
import lieu.util.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    //@Test bien ham nay thanh public static void main()
    //cach dat ten ham se noi len muc tieu test ham, co nhieu quy tac dat ten
    @Test
    public void getFactorial_RunsWell_IfValidArgument() {
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }

    //cần test oci co snems về ngaoij lệ hay ko???
    //nếu đúng là m ném về ngoại lệ IlegalArgumentException trong tình huống giai thừa -5 thì tao có màu xanh
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowException_IfValidArgument() {
        MathUtility.getFactorial(-5);
    }
}
