import java.io.File;
import java.io.IOException;
public class CreateFile2 
{
public static void main(String[] args)
{
File file = new File("Rish.txt");
try {
if(file.createNewFile()){
System.out.println("File created : " +file.getName());
}
else {
System.out.println("file already exists:)");
}
}
catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}
}
