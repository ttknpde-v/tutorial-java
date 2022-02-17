package Lab_inheritance_basic;

class Process_array_all extends Process_integer {
    protected void get_display (String [] arr) {
        //
        set_array_string(arr);
    }
    private void set_array_string (String [] arr) {
        System.out.print("Cpu in array => ");
        for (int index = 0 ; index < arr.length ; index ++) {
            System.out.print(arr[index]);
            if (index <= 2)
            {
                System.out.print(",");
            }
        }
        System.out.println();
    }

}
class Process_integer {
    private double $average_integer;
    private int $summary_multiply;
    private int more, less;
//
//    void set_datatype () {
//    $average_integer = 0.0d;
//    $summary_multiply = 0;
//    }

    protected void get_display(int[] arr) {

        set_array_and_calculate(arr);
        set_array_and_mirror(arr);
        set_integer_moreandless(arr);
    }

    private void set_array_and_calculate(int[] arr) {

        System.out.print("[");
        for (int index = 0; index <= 4; index++) {
            $summary_multiply = $summary_multiply+arr[index];
            System.out.print(arr[index]);
            if (index <= 3) {
                System.out.print(",");
            }
        }
        $average_integer = (double) $summary_multiply / 5;

        System.out.print
                ("] result multiply = $" + $summary_multiply + " result average = $" + $average_integer);

    }

    private void set_array_and_mirror(int[] arr) {
        System.out.print("\n[");
        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index]);
            if (index >= 1) {
                System.out.print(",");
            }
        }
        System.out.print
                ("] result multiply = $" + $summary_multiply + " result average = $" + $average_integer);
    }

    private void set_integer_moreandless(int[] arr) {
        more = arr[0];
        less = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > more) {
                more = arr[index];
            }
            if (arr[index] < less)
            {
                less = arr[index];
            }
        }
        System.out.println("\n*******************************");
        System.out.println("integer in array maximum "+more);
        System.out.println("integer in array minimum "+less);
    }
}
