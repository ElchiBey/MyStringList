package pgdp.strings;

public class MyString {
    private char[] data;
    private MyString next;

    public MyString(char[] data) {
        this.data = data;
        next = null;
    }

    public int length() {
        MyString curElement = this;
        int size = 0;
        while (curElement != null) {
            size += curElement.data.length;
            curElement = curElement.next;
        }
        return size;
    }

    public void concat(char[] data) {
        MyString newElement = this;
        while (newElement.next != null) {
            newElement = newElement.next;
        }
        newElement.next = new MyString(data);
    }

    public boolean equals(MyString other) {
        if (length() != other.length()) return false;
        MyString newElement1 = this;
        int i = 0;
        char[] str1 = new char[length()];
        while (newElement1 != null) {
            while (i < this.length()) {
                for (int j = 0; j < newElement1.data.length; j++) {
                    str1[i] = newElement1.data[j];
                    i++;
                }
                newElement1 = newElement1.next;
            }
        }

        char[] str2 = new char[other.length()];
        MyString newElement2 = new MyString(other.data);
        int x=0;
        while(newElement2!=null) {
            while (x < newElement2.length()) {
                for (int j = 0; j < newElement2.data.length; j++) {
                    str2[x] = newElement2.data[j];
                    x++;
                }
            }
            newElement2 = newElement2.next;
        }
        int s=0;
        for (int j = 0; j < length(); j++){
            if(str1[j]!=str2[j]) s++;
        }
        return (s==0);
    }

    public int indexOf(char c){
        MyString currElement = this;
        int x = 0;
        char[] str = new char[length()];
        while (currElement != null) {
            while (x < this.length()) {
                for (int j = 0; j < currElement.data.length; j++) {
                    str[x] = currElement.data[j];
                    x++;
                }
                currElement = currElement.next;
            }
        }
        for(int i=0; i<this.length(); i++){
            if(c == str[i]) return i;
        }
        return -1;
    }

    public int lastIndexOf(char c){
        MyString currElement = this;
        int x = 0, k=-1;
        char[] str = new char[length()];
        while (currElement != null) {
            while (x < this.length()) {
                for (int j = 0; j < currElement.data.length; j++) {
                    str[x] = currElement.data[j];
                    x++;
                }
                currElement = currElement.next;
            }
        }
        for(int i=0; i<this.length(); i++){
            if(c == str[i]) k=i;
        }
        return k;
    }

    public String toString() {
        MyString newElement = this;
        int i = 0;
        char[] str = new char[length()];
        while (newElement != null) {
            while (i < this.length()) {
                for (int j = 0; j < newElement.data.length; j++) {
                    str[i] = newElement.data[j];
                    i++;
                }
                newElement = newElement.next;
            }
        }
        return new String(str);
    }

    public char[] getData() {
        return data;
    }

    public void setData(char[] data) {
        this.data = data;
    }

    public MyString getNext() {
        return next;
    }

    public void setNext(MyString next) {
        this.next = next;
    }
}