package String_details;
// string is a class which consist of methods

public class String_part1 {

    //string in non-primitive data type
    //String is immutable
    //string is a sequence of character or collection of more than one character
    //string is represented in double quotes " "

    //in java heap memory is used to store the new objects

    public static void main(String  args[]){

            String name="krish";

            //length()-returns the length of string
        int x=name.length();//it also returns length of string
        System.out.println(name.length());

           //charAt()-returns character at specific index
        System.out.println(name.charAt(0));
        char c=name.charAt(1);
       // int x=name.length();
        char n=name.charAt(x-1);
        System.out.println(n);

           //equals() method is used to check whether two strings are equal or not
        String name2="kriSh";
        System.out.println(name.equals(name2));

          //equalsIgnoreCase() ignore the case of letters in upper and lower and checks for equality
        System.out.println(name.equalsIgnoreCase(name2));

         //compareTo() returns ASCII value by comparing character from both strings one by one
        String str1="remote";
        String str2="car";
        System.out.println(str1.compareTo(str2));

        //compareToIgnoreCase() method return the ASCII value by ignoring case of letter(upper or lower)
        String s1="krish";
        String s2="KRISH";
        System.out.println(s1.compareToIgnoreCase(s2));

        //substring() or subSequence() method is used to return specific part of string
        String s="Krish Patel";
        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(0,6));
        //toUpperCase() and toLowerCase() is used to convert string to upper case and lower case
        System.out.println(s.substring(0,6).toLowerCase());
        System.out.println(s.substring(6).toUpperCase());

        //trim() method returns string by removing unwanted spaces from left and right side of string
        String n1="    krish patel      ";
        System.out.println(n1.trim());

        //replace() method is used to replace a specific part of string with another part
        String s3="Hello my name is krish";
        System.out.println(s3.replace("krish","Kalpesh").toUpperCase());

        //contains() method wll returns true if string contains specific part of substring or character in itself
        boolean s4=s3.contains("krish");
        boolean s5=s3.contains("H");
        System.out.println(s4);
        System.out.println(s5);

        //startsWith() and endsWith() used to know whether string starts or ends with specific character or substring
        boolean s6=s3.startsWith("h");
        boolean s7=s3.endsWith("sh");
        System.out.println(s6+" "+s7);

        //isEmpty()
        String s8="";
        System.out.println(s8.isEmpty());

        //isBlank()
        String s9="    ";
        System.out.println(s9.isBlank());

        // indexOf() and lastIndexOf method return index of specific character
        String s10="krishna patel";
        System.out.println(s10.indexOf("i"));
        System.out.println(s10.indexOf("patel"));//return index of p
        System.out.println(s10.indexOf("a",8));

        //lastIndexOf()
        System.out.println(s10.lastIndexOf("a"));
        System.out.println(s10.lastIndexOf("patel"));//return index of p starting of last moves to first

        //valueOf() method is used to convert any data type into string type
        int x1=10;
        String x2=String.valueOf(x1);
        System.out.println(x2);

        //format() method formats the values of placeholders
        String s11=String.format("hello my name is %s and i am %d years old","krrish",18);
        System.out.println(s11);



    }
}

/*
length()

charAt(int index)

equals(Object anObject)

equalsIgnoreCase(String anotherString)

compareTo(String anotherString)

compareToIgnoreCase(String str)

substring(int beginIndex, int endIndex)

toUpperCase()

toLowerCase()

trim()

replace(CharSequence target, CharSequence replacement)

contains(CharSequence s)

startsWith(String prefix)

endsWith(String suffix)

isEmpty()

isBlank()

indexOf(String str)

lastIndexOf(String str)

valueOf(int i)

format(String format, Object... args)

*/
