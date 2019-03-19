public class TextPost extends Post {

    private String message;

    public TextPost(String user, String mess) {
      super(user);
      this.message = mess;
    }

    public String getMessage() {
	     return message;
    }

    public String toString() {
    	String str = new String();
    	str = super.toString() + ", " + message;
    	return  str;
    }

  	public boolean isPopular() {
  		return (super.getLikes() > 50);
  	}

}
