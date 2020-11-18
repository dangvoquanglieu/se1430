/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lieu.util;

/**
 *
 * @author DELL
 */
public class MathUtility {

    //class này fake class Math của JDK
    //Math của jDK có .abs(), .sqrt(), .sin(), .PI
    //chúng toàn là static, vì là thư viện dùng chung
    public static final double PI = 3.1415;

    // hàm tính giai thừa: n!=1.2.3.4.5..n
    //0! = 1
    //mình khong được tính giai thừa âm
    //21! cực lớn, trnafn kiểu long, không chứa nổi
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//            //ko xai else, co else tru diem
//        }
//        long result = 1;
//        //doan nay n = 2...20
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;  
//    }
    //minh họa khái niệm Refactoring - tối ưu, chỉnh sửa lại code
    //cho tối ưu hơn
    //và minh họa khái niệm Regression Test, test hồi quy, test lại những gì đã test XANH
    //để check xem code còn XANH như ngày xưa không
    //sau khi đã sửa lại
    //đệ quy phải có điểm dừng
    //rất dễ bị lặp vô tận nếu không có dừng
    //1! = 1, quy ước rồi và hồi ngược lên trên
    //kết luận n! = n*(n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 1...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //n>1 & n<=20
        return n * getFactorial(n - 1);

    }
}
