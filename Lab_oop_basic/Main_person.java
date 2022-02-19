package Lab_oop_basic;

public class Main_person {
    public static void main(String[] args) {

        // create new object one
        Person $person_one = new Person();
        $person_one.$name("Jon Snow");
        $person_one.$age(22);
        $person_one.get_print();
        $person_one.get_sayhi();

        // create new object two
        Person $person_two = new Person();
        $person_two.$name("Van Snow");
        $person_two.$age(30);
        $person_two.get_print();
        $person_two.get_sayhi();

        // create new object one and new class
        Person_basic $person_1 = new Person_basic();
        $person_1.set_name("Stone Clod");
        $person_1.set_age(52);
        System.out.println("Name "+$person_1.$name+" Age "+$person_1.$age);

    }
}
