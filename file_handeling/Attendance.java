import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class Attendance{

public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
String date = obj.nextLine();
String a[] = new String[5];
try {
FileWriter fw = new FileWriter("Attendance.txt");
fw.write(date+"\n");

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