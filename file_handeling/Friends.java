import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class Friends{

public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
String a[] = new String[5];
try {
FileWriter fw = new FileWriter("Friends.txt");
for(int i = 0;i<5;i++){
a[i]=obj.nextLine();
fw.write(a[i]+"\n");
}
fw.close();
}
catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}

}