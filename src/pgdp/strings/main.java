package pgdp.strings;

public class main {

    public static void main(String[] args) {
        MyString str1 = new MyString(new char[] {'a','b','c','d'});
        str1.concat(new char[]{'e','f'});
//        str1.concat(new char[]{'g','f'});
        MyString str2 = new MyString(new char[]{'a','b','c','d','e','f'});
//        MyString str3 = new MyString(new char[]{'a','b','c','d','e','f'});
        //System.out.print(str1.lastIndexOf('d'));
        System.out.println(str1.equals(str2));
//        System.out.println(str2.equals(str3));
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equals(str1));
    }
}