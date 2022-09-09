
import java.io.*;

import java.lang.*;

public class Main {

public static void main(String[] args)throws IOException{

//Your code here

BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the number of lines");

 

 

 

 

 

int n=Integer.parseInt(bf.readLine());

Article[] a =new Article[n];

for(int i=0;i<n;i++) {

System.out.println("Enter line "+(i+1));

a[i] = new Article(bf.readLine());

a[i].start();

}

try {

Thread.sleep(1000);

}catch(Exception e) {

}

int count = 0;

for(int i=0;i<a.length;i++) {

count+=a[i].getCount();

}

System.out.println("There are "+count+" articles in the given input");

}

}