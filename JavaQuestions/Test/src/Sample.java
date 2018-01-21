import java.io.Serializable;

public class Sample implements Serializable{
	 protected Object readResolve()
	    {
	        return "";
	    }
}
