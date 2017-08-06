import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
public class ArraySet
  {
public static void main(String args[])
{
 ArraySet <String> myMap=new ArraySet <String>();
myMap.add("1");
myMap.add("2");
myMap.add("3");
myMap.add("4");
myMap.add("5");
myMap.add("6");
System.out.println("CopyOnWriteArraySet before iterator :"+myMap);
Iterator<String>it= myMap.iterator();
while(it.hasNext())
{
  String Key=it.next();
if(Key.equals("3"))
myMap.add(Key + "new");
}
 System.out.println("CopyOnWriteArraySet after iterator :"+myMap);
myMap=new HashSet<String>();
myMap.add("1");
myMap.add("2");
myMap.add("3");
myMap.add("4");
myMap.add("5");
myMap.add("6");
System.out.println("HashSet before iterator: "+myMap);
Iterator<String>it1=myMap.iterator();
while(it1.hasNext())
{
String Key= it1.next();
if(Key.equals("3"))
myMap.add(Key+"new");
}
System.out.println("HashSet after iterator : "+myMap);
       }
}