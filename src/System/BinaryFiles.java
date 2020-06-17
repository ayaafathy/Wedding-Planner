
package System;
import Users.WeddingPlanner;
import java.io.*;
import java.util.ArrayList;



public class BinaryFiles implements Serializable {
    
    
    public static void writeInFile (String path, Object o) throws FileNotFoundException, IOException
    {
        ObjectOutputStream writeObj = new ObjectOutputStream (new FileOutputStream(path));
        writeObj.writeObject(o);
        writeObj.close();
    }
    
   public static Object readFromFile (String path)
   {        
       Object obj = null;

       try {
            ObjectInputStream readObj = new ObjectInputStream (new FileInputStream (path));
            obj = readObj.readObject();
            readObj.close();
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
   }

    
}
