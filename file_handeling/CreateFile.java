import java.util.*;
import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main (String[] args) {
try {
File file = new Fie("rishit");
if(file.createNewFile()) {
System.out.println("File created : " +file.getName());
}
else {
System.out.println("file already exists");
}
} catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}
}