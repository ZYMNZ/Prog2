import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("meow");
        al.add("m");
        al.add("e");
        al.add("o");
        al.add("w");

        al.add(1,"meow");
        al.remove(2);
        al.add("meow");
        al.size();

        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(23);
        al1.add(1,23);
        al1.remove(Integer.valueOf(23));


        al1.ensureCapacity(400);
        al1.trimToSize();


        ArrayList<String> st = new ArrayList<String>();

        ArrayList<Integer> in = new ArrayList<Integer>();

        st.add("AB");
        st.add("CD");
        st.add("EF");
        st.add("GH");
        st.add("IJ");
        st.add("KL");
        st.add("MN");
        st.add("OP");
        st.add("QR");
        st.add("ST");

        System.out.println("size: " + st.size());
        System.out.println(st);
        for (int i = 0; i < st.size(); i++) {
            if(i % 2 == 0){
                st.remove(i);
            }
        }
        System.out.println("size: " + st.size());
        System.out.println("new list: " + st);

        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        in.add(5);
        in.add(6);
        in.add(7);
        in.add(8);
        in.add(9);
        in.add(10);

        int flag =0;

        System.out.println("size: " + in.size());
        System.out.println(in);
        for (int i = 0; i < in.size(); i++) {

            if(i % 2 != 0){
                in.remove(i);
                flag = 1;
            }
            if(i % 2 == 0){
                in.remove(i);
                flag = 1;
            }


        }
        System.out.println("size: " + in.size());
        System.out.println("new list: " + in);
















    }
}
