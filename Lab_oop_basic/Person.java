package Lab_oop_basic;
class Person {
    private String $name;
    private int $age;

    void get_print () {
        for (int index = 0 ; index <= 1 ; index ++) {
            System.out.println("Hi "+$name+" i wish you good health ");
            System.out.println("Your age "+$age+" year old");
        }
    }

    void get_sayhi () {
        System.out.println("Hello There!!");
    }

    public String $name(String $name) {
         this.$name = $name;
        return $name;
    }
    public int $age(int $age) {
         this.$age = $age;
        return $age;
    }
}

class Person_basic {

    String $name;
    int $age;
    protected String set_name (String $name) {
        //
        return this.$name = $name;
    }
    protected int set_age (int $age) {
        //
        return this.$age = $age;
    }
}

