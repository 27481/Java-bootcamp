public class tut_22_String_methods{
    public static void main(String[] args) {
     String name ="utkarsh";
     String a1=new String("utkarsh"); //! Here we are creating a object of class String
                                //! Just like we created a object (sc) of Scanner class 
     System.out.println(name);
     System.out.println(a1);

     System.out.println(name.length());
     System.out.println(name.toLowerCase());
     System.out.println(name.toUpperCase());
     System.out.println(name.toUpperCase());
     System.out.println(name.trim());
     System.out.println(name.substring(1,4));
     System.out.println(name.replace('u', 't'));
     System.out.println(name.replace("ut", "tt"));
     System.out.println(name.startsWith("ut"));
     System.out.println(name.endsWith("rsh"));
     System.out.println(name.charAt(2));
     System.out.println(name.indexOf("u"));

     String modifiedName ="Utkarshrsh";
     System.out.println(modifiedName.indexOf("h", 4));
     System.out.println(modifiedName.lastIndexOf("rsh", 4));

     System.out.println(name.equals("utkarsR"));
     System.out.println(name.equalsIgnoreCase("UTKARSH"));
    }
}