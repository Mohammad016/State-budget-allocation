package project;
import java.util.*;
import java.io.*;

public class reader
{
    char[] array=new char[100];
    public void meth(int a) throws Exception
    {
        BufferedReader r=new BufferedReader(new FileReader("file.txt"));
        r.read(array);
        writter x=new writter();
        System.out.println(array);
        
        System.out.println(x.total);
        r.close();
    }
}