package lab5;

import java.util.ArrayList;
import java.util.Collections;


public class Counter {
    private String current;
    private String edited;
    private String[] split;
    private ArrayList<String> list = new ArrayList<String>();
    public Counter(String current)
    {
        this.current = current;
    }

    public String getCurrent()
    {
        return this.current;
    }

    public String removeNull(String current)
    {

        this.edited = current.substring(5,current.length());
        return this.edited;

    }

    public void populateHashMap()
    {

        this.split = this.edited.split(" ");
        for(int i = 0; i < this.split.length; i++)
            this.list.add(split[i]);



        System.out.println("The frequency of the word package is: "+
                Collections.frequency(this.list, "package"));
        System.out.println("The frequency of the word lab5 is: "+
                Collections.frequency(this.list, "lab5"));
        System.out.println("The frequency of the word ; is: "+
                Collections.frequency(this.list, ";"));
        System.out.println("The frequency of the word public is: "+
                Collections.frequency(this.list, "public"));
        System.out.println("The frequency of the word class is: "+
                Collections.frequency(this.list, "class"));
        System.out.println("The frequency of the word Test is: "+
                Collections.frequency(this.list, "Test"));
        System.out.println("The frequency of the word { is: "+
                Collections.frequency(this.list, "{"));
        System.out.println("The frequency of the word ( is: "+
                Collections.frequency(this.list, "("));
        System.out.println("The frequency of the word ) is: "+
                Collections.frequency(this.list, ")"));
        System.out.println("The frequency of the word int is: "+
                Collections.frequency(this.list, "int"));
        System.out.println("The frequency of the word i is: "+
                Collections.frequency(this.list, "i"));
        System.out.println("The frequency of the word 0 is: "+
                Collections.frequency(this.list, "0"));
        System.out.println("The frequency of the word y is: "+
                Collections.frequency(this.list, "y"));
        System.out.println("The frequency of the word 2 is: "+
                Collections.frequency(this.list, "2"));
        System.out.println("The frequency of the word + is: "+
                Collections.frequency(this.list, "+"));
        System.out.println("The frequency of the word = is: "+
                Collections.frequency(this.list, "="));
        System.out.println("The frequency of the word } is: "+
                Collections.frequency(this.list, "}"));

    }


}
