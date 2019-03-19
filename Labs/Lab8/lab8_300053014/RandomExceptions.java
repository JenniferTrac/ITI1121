import java.io.IOException;

public class RandomExceptions {

    public static void main(String args[]) {

        int exceptionNumber = randomNumber();

        try{
            throwException(exceptionNumber);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The exception type is: ArrayOutOfBoundsException, the exception number is " + exceptionNumber);
        } catch(IOException e) {
            System.out.println("The exception type is: IOException, the exception number is " + exceptionNumber);
        } catch(IllegalArgumentException e) {
            System.out.println("The exception type is: IllegalArgumentException, the exception number is " + exceptionNumber);
        } catch(NullPointerException e) {
            System.out.println("The exception type is: NullPointerException, the exception number is " + exceptionNumber);
        } catch(Exception e) {
            System.out.println("The exception type is: Exception, the exception number is " + exceptionNumber);
        }
    }

    public static int randomNumber() {
        return (int)(Math.random()*5) + 1;
    }

    public static void throwException(int exceptionNumber) throws Exception, IOException{

        if(exceptionNumber==1){
	        // Your code here
            throw new Exception();
        }
        if(exceptionNumber==2){
	        // Your code here
            throw new ArrayIndexOutOfBoundsException();
        }
        if(exceptionNumber==3){
	        // Your code here
            throw new IOException();
        }
        if(exceptionNumber==4){
	        // Your code here
            throw new IllegalArgumentException();
        }
        if(exceptionNumber==5){
	        // Your code here
            throw new NullPointerException();
        }
    }
}
