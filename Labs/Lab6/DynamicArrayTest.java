public class DynamicArrayTest {

    public static void main( String[] args ) {

        Stack<String> s;

        s = new DynamicArrayStack<String>( 10 );
		System.out.println(((DynamicArrayStack)s).getCapacity());
        for ( int i=0; i<30; i++ ) {
            s.push( "Elem-" + i );
        }
		System.out.println(((DynamicArrayStack)s).getCapacity());
		System.out.println(s.pop());

		for ( int i=0; i<10; i++ ) {
            s.pop();
        }

        s.clear();

        while ( ! s.isEmpty() ) {
            System.out.println( s.pop() );
        }
		System.out.println(((DynamicArrayStack)s).getCapacity());

        /*for ( int i=0; i<10; i++ ) {
            s.push( "** Elem-" + i );
        }*/

        while ( ! s.isEmpty() ) {
            System.out.println( s.pop() );
        }

    }

}
