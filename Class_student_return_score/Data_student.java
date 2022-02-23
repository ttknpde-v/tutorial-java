package Lab_oop_basic.ClasS_student_return_score;

public class Data_student {
    private String $name;
    private String $op_str;
    private float $subject_1,$subject_2,$subject_3;
    private double $average_all_subject,$high_all_score;
    protected Data_student ()
    {
        // constructor
        // set default
        $name = " ";
        $subject_1 = 0.0f;
        $subject_2 = 0.0f;
        $subject_3 = 0.0f;

    }
    protected Data_student (Data_student cloning_object)
    {
        // constructor
        // รับชื่อ คะแนน ผ่าน object ของ class Data_student
        $name = cloning_object.$name;
        $subject_1 = cloning_object.$subject_1;
        $subject_2 = cloning_object.$subject_2;
        $subject_3 = cloning_object.$subject_3;
    }
    protected Data_student (String $name , float $subject_1,float $subject_2,float $subject_3)
    {
        this.$name = $name;
        this.$subject_1 = $subject_1;
        this.$subject_2 = $subject_2;
        this.$subject_3 = $subject_3;
    }
    protected void set$name (String $name) {
        this.$name = $name;

        // รับข้อมูล Argument เป็น String
    }
    protected String get$name () {
        return this.$name;
        // read private $name and return is String

    }
    protected void set_Score (int number_subject , float $score) {
        /*

            2 Argument 1. order subject 2.score

         */
        if (number_subject == 1)
        {
            $subject_1 = $score;
        }
        else if (number_subject == 2)
        {
            $subject_2 = $score;
        }
        else if (number_subject == 3)
        {
            $subject_3 = $score;
        }
        else
        {
            $score = 0.0f;
        }
    }
    protected float get_Score (int number_subject) {
        // read private $subject_.. and get Argument order subject
        if (number_subject == 1)
        {
            return $subject_1;
        }
        else if (number_subject == 2)
        {
            return $subject_2;
        }
        else if (number_subject == 3)
        {
            return $subject_3;
        }
        else
        {
         return  0.0f;
        }
    }
    protected double get_Average () {
        // process calculate average and return is double
        $average_all_subject = (($subject_1+$subject_2+$subject_3)/3.0d);
        return (int) $average_all_subject;
    }
    protected double get_high () {
        // process high score and return is double
        $high_all_score = $subject_1;
        if ($subject_2 > $high_all_score) // check all condition
        {
            $high_all_score = $subject_2;
        }
        if ($subject_3 > $high_all_score)
        {
            $high_all_score = $subject_3;
        }
        return (int)$high_all_score;
    }
    public String toString () {
        $op_str =
               "Name. : "+$name+"\n"+
               "Physics. : "+$subject_1+"\n"+
               "Mathematics. : "+$subject_2+"\n"+
               "Programming language. : "+$subject_3+"\n"+
               "Average score. = "+get_Average()+"\n"+
               "High score. = "+get_high()+"\n";
        return $op_str;
    }



}
