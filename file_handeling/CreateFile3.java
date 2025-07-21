import java.io.File;
import java.io.IOException;
class CreateFile3 {
public static void main(String[] args)
{
try {
File file = new File("rishh.txt");
if(file.createNewFile())
{
System.out.println("File created : " +file.getName());
}
else {
System.out.println("File already exist");
}
}
catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}
}


