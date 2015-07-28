import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetriveUser(){
    	//crear usuario y guardar nuevo usuario
    	new User("cguanoluisa02@hotmail.com","secret","David").save();
    	//recuperar el usuario con el email direccion del cguanoluisa02@hotmail.com
    	User david=User.find("byEmail","cguanoluisa02@hotmail.com").first();
    	
    	//test
    	assertNotNull(david);
    	assertEquals("David",david.fullname);
    	
    	
    }
    @Test 
    public void tryConnectAsUser(){
    	new User("cguanoluisa02@hotmail.com","secret","David").save();
    	
    
    //test
    	assertNotNull(User.connect("cguanoluisa02@hotmail.com","secret"));
    	assertNull(User.connect("cguanoluisa02@hotmail.com","badpassword"));
    	assertNull(User.connect("oguanoluisa02@hotmail.com","secret"));
    }
    
   
    

}
