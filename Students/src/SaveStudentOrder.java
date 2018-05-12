/**
 * Created by n on 08.05.18.
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName ="Alex";
        so.hLastName = "Mook";
        so.wFirstName = "Mary";
        so.wLastName = "Poppins";
        StudentOrder so2;
        so2 = new StudentOrder();
        so2.hFirstName ="Alex";
        so2.hLastName = "Mook";
        so2.wFirstName = "Mary";
        so2.wLastName = "Poppins";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);
        return answer;
    }
}//class
