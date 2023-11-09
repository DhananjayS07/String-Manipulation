package com.stringA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="Java";  // By using String Literal
         String s2="Java"; // It will not create new instance inside heap
         
         System.out.println(s1);
         
         String s=new String("C++"); // By using new Keyword
                                     //It will create two objects and one refernce variable "C++" --> string constnt pool
                                     //JVM will create one object, String S will referobject ---> inside heap
         System.out.println(s); 
         
         // String charAt();
         char ch=s.charAt(2);  // It will give char value at the 4th Index
         System.out.println(ch);
         
         //String length();
         s1.length();
         System.out.println(s1.length());  //It will give length of String
         
         //Equals();
         System.out.println(s1.equals(s2)); // It will // Returns true because content is same
         
         //Contains();
         //Checks whether a string contains a sequence of characters    Hello ---> He  ,ll, el
         System.out.println(s1.contains("Ja"));  //It will returns True because Ja is insequence of java
         
         //replace();
        // Searches a string for a specified value, and returns a new string where 
        // the specified values are replaced.  In Java   we want to replace v with w
         System.out.println(s1.replace("v","w"));
         
         //concat();
         //Append (add) a string to the end of another string.
         // s1=abc s2=def   ---> abcdef
         System.out.println(s2.concat(s));
         
         //equalsIgnoreCase ();
         //s1=ABC s2=abc   ---->it will ignore lowercase and uppercase and match the string
         String s3="DHANANJAY";
         String s4="dhananjay";
         System.out.println(s3.equalsIgnoreCase(s4));
         
         //indexOf ();
         //Returns the position of the first found occurrence of specified characters  in a string.
         //Return Type is int
         // My name is Dhananjay ---> Indexof(Dhananjay) ---> 11 
         String s5="My name is Dhananjay";
         System.out.println(s5.indexOf("Dhananjay"));
         
         //lastIndexOf ();
         //Returns the position of the last found occurrence of specified characters in a string.
         //Daught why to be used lastIndexof  we get same output for indexof
         System.out.println(s5.lastIndexOf("Dhananjay"));
         
         //isEmpty ()
         //Checks whether a given string is empty or not.
         //Return type of this method is “boolean”
           String s6="";
           String s7="Dj";
           System.out.println(s6.isEmpty());  // if it is empty it will give true
           System.out.println(s7.isEmpty());
           
          //trim()
          //Removes the spaces from both ends (leading and trailing) of a string
           //first space before sentence and space after sentences
          //"     Basic Of Java     "-----> "Basic of Java"
           //Return type is string 
           String s8=" Basic Of Java";
           System.out.println(s8.trim());
           
           //split()
           //Split a string into an array of substrings.
           //"Basic of Java" --> Ba ic of sub tring
           String s9 = "Basic of Substring";
           String[] a = s9.split("s"); //splits the string based on s
           //using java foreach loop to print elements of string array
           for(String x:a){
           System.out.println(x);
           }
           
           //compareTo ():
           //Compare two strings lexicographically.
           String c = "Dhananjay";
           String b = "Dhananjay";
           System.out.println(c.compareTo(b)); // Returns 0 because they are equal
           String d = "Dhananjay";
           String e = "Dhananjayd";
           System.out.println(d.compareTo(e)); // Daught // it will lexical -->ASCII value
           
          
           String p = "Hello";
           String q = "Hella";
           System.out.println(p.compareTo(q));
           
           String x="xyz";
           String y="xyh";
           System.out.println(x.compareTo(y));
          
           
          // substring ():
         //  Returns a new string which is the substring of a specified string.
          
           System.out.println(c.substring(1,6));//returns hanan
           System.out.println(c.substring(2));//returns ananjay
           
           // toCharArray ()
          // Converts this string to a new character array
           String f="Sawant";
           char[] g=f.toCharArray();
           System.out.println(g);
           
           //toLowerCase ():
           //Convert string to lowercase   ABC-->abc
           System.out.println(f.toLowerCase());   //Sawant-->sawant
           
           //toUpperCase ():
           //Convert string to Uppercase   aBc-->ABC
           System.out.println(f.toUpperCase());
	}

}
