/**
 * Created by n on 12.05.18.
 */
public class StudentOrderValidator {

    static void checkAll(){
        while(true){
            StudentOrder so = readStudentOrder();
            System.out.println("start");
            if(so == null){
                break;
            }
            System.out.println("finish");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success){
                break;

            }
        }//while
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so){
        return CityRegisterValidator.checkCityRegister(so);
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cw = new ChildrenValidator();
        cw.checkChildren(so);
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        return  new StudentValidator().checkStudent(so);;
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }

}//class
