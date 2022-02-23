package Lab_oop_basic.ClasS_student_return_score;

public class Main_student_test_basic {
    public static void main(String[] args) {
        String $inherit_data1;
        Data_student nisit_1,nisit_2,nisit_3;
        nisit_1 = new Data_student();
        nisit_2 = new Data_student();
        nisit_3 = new Data_student();
        nisit_1.set$name("Java, Language");
        nisit_1.set_Score(1,83.72f);
        nisit_1.set_Score(2,87.93f);
        nisit_1.set_Score(3,91.98f);
        $inherit_data1 = nisit_1.toString();


        nisit_3.set$name("Python, Language");
        nisit_3.set_Score(1,86.62f);
        nisit_3.set_Score(2,27.03f);
        nisit_3.set_Score(4,32.78f);


        nisit_2 = nisit_3; // object nisit_2 ชี้ไปยัง object nisit_3

        /*
            เมื่อต้องการค่าใน ตัวแปรมาคำนวณ
            float a,b,c;
            a = nisit_1.get_Score();

         */
        System.out.println($inherit_data1);
        System.out.println(nisit_1.get$name()+" subject 1.Physics score = "+nisit_1.get_Score(1));
        System.out.println("***************************************");

        System.out.println(nisit_2.toString());
        System.out.println("***************************************");

        System.out.println(nisit_3.toString());
        System.out.println(nisit_3.get$name()+" high score "+nisit_3.get_high());




    }
}
