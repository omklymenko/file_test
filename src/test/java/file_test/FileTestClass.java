package file_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
* Created by Елена on 16.02.2015.
*/
public class FileTestClass {

    @Test
    public void SomeTest3(){
        File file1 = new File("E:\\TestTxt.txt");
        FileReader filer = null;
        try {
            filer = new FileReader(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = null;
        try {
            sc = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s1;
        s1 = sc.nextLine();
        Assert.assertEquals(s1, "abc123");
    }
}
