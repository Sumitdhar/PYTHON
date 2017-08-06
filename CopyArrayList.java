import java.util.ArrayList;
import java.util.Collections;
class CopyArrayList
{
public static void main(String args[])
{
ArrayList <String> arrayList1=new ArrayList <String>();
arrayList1.add("1");
arrayList1.add("2");
arrayList1.add("3");
ArrayList <String> arrayList2=new ArrayList <String>();
arrayList2.add("one");
arrayList2.add("two");
arrayList2.add("three");
arrayList2.add("four");
arrayList2.add("five");
System.out.println(arrayList2);
Collections.copy(arrayList2,arrayList1);
System.out.println(arrayList2);
}
}

