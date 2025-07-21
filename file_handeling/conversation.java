import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class conversation{

public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
try {
FileWriter fw = new FileWriter("conversation.txt");
String mum;
String me;
for(int i = 0 ; i < 5 ; i++)
{
System.out.print("mum : ");
mum = obj.nextLine();
fw.write(mum);
System.out.print("me : ");
me = obj.nextLine();
fw.write(me);
}
fw.close();
}
catch (IOException e) {
System.out.println("an error occured");
e.printStackTrace();
}
}
} 