public class TestDynamic {

    @SuppressWarnings( "unchecked" )

    public static void main(String[] args) {
        DynamicArrayStack test = new DynamicArrayStack(30);
        for (int i = 0; i<41; i++) {
            test.push(i*2);
        }

        System.out.println("size is " + test.getCapacity());

        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }

        System.out.println("size is " + test.getCapacity());

        for (int i = 0; i<41; i++) {
            test.push(i*3);
        }

        System.out.println("size is " + test.getCapacity());

        test.clear();

        System.out.println("size is " + test.getCapacity());

    }
}
