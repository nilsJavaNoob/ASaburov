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
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Children check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студены проверяются");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){
        System.out.println("Почта отправлена");
    }

}//class
