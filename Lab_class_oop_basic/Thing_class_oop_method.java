package Lab_oop_basic.return_method_oop;

class Thing_class_oop_method {
    public static int count = 1; // ระดับ static <<<= call method นี้ได้โดยไม่ต้องสร้าง object
    protected static String description; // ระดับ static <<<=
    public String $name;
    public int $id;

    public Thing_class_oop_method () {
        $id = count;
        count++;
    }
    public void show_name_id () {

        System.out.println("Object all ("+count+") id : "+$id+" , "+description+" name : "+$name);

    }
    public static void show_info () {

        System.out.println("Description : "+description);

    }

}
class Main_thing {
    public static void main(String[] args) {

        Thing_class_oop_method.description = "I Love Mobile";

        Thing_class_oop_method.show_info();
        // นับเป็น 1 object (ไม่สมบูรณ์) ใน class Thing_class_oop_method ที่เรียกใช้ได้แค่ static
        System.out.println("Before creating objects method count = "+Thing_class_oop_method.count);

        // create new object in class Thing_class_oop_method

        Thing_class_oop_method $thing_one = new Thing_class_oop_method();
        Thing_class_oop_method $thing_two = new Thing_class_oop_method();
        System.out.println("After creating objects method count = "+Thing_class_oop_method.count);

        Thing_class_oop_method.description = "Apple";
        $thing_one.$name = "I Phone 8 Plus";

        $thing_two.$name = "Macbook air 2013";
        $thing_one.show_name_id();

        $thing_two.show_name_id();




    }
}
