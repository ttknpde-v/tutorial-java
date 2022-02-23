import java.util.Random;
public class Dice {
    private int $number_dice;
    private Random $random_dice;
    public Dice () {
        // constructor set default
        $number_dice = 1;
        $random_dice = new Random(); // สร้าง object เพื่อเรียกใช้ Attribute random
    }
    protected Dice (int $number_dice) {
        // constructor set private int $number_dice ผ่าน Argument
        this.$number_dice = $number_dice;
        $random_dice = new Random(); // สร้าง object เพื่อเรียกใช้ Attribute random
    }
    protected int rolling_Dice ()
    {
        // method random dice
        // ใช้ Attribute ใน library util.Random ช่วย
        // สร้างตัวแปร integer กำหนดเป็นค่า 0 => เก็บผลรวม random
        // keyword Attribute Random => .nextInt(กำหนดจำนวนที่ต้องการสุ่ม)
        int sum_rolling = 0;
        for (int i = 1 ; i <= $number_dice ; i ++)
        {
            sum_rolling = 1 + sum_rolling + $random_dice.nextInt(6);
        }
        return sum_rolling;
    }
    protected void set_number_dice (int number_dice) {
        // method รับจำนวน dice
        $number_dice = number_dice;
    }
    protected int get_number_dice () {
        // read and return int
        return $number_dice;
    }
}
class Main_dice {
    public static void main(String[] args) {
        int number$dice_1 = 1,number$dice_2 = 5;

        Dice $dice_1 = new Dice();
        Dice $dice_2 = new Dice(number$dice_2); // max 30

        System.out.println("ลูกเต๋า "+$dice_2.get_number_dice()+" ลูก");

        for (int round = 1 ; round <= 10 ; round ++)
        {
            System.out.println($dice_2.rolling_Dice() + " ผลรวมลูกเต๋า");
        }
        // ******************

        System.out.println("ลูกเต๋า "+$dice_1.get_number_dice()+" ลูก");

        for (int round = 1 ; round <= 10 ; round ++)
        {
            System.out.println($dice_1.rolling_Dice() + " ผลรวมลูกเต๋า");
        }


    }
}
