import java.io.File;
import java.io.IOException;
class CreateFile6{
public static void main(String[] args)
{
try {
File file = new File("rishita_saini.txt");
if(file.createNewFile()) {
System.out.println("file created : "+file.getName());
}
else
System.out.println("file already exists");
}
catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}

}