
public class Article extends Thread{
private String line;
private Integer count;
//Your code here
public String getLine() {
return line;
}
public void setLine(String line) {
this.line = line;
}
public Integer getCount() {
return count;
}
public Article(String line) {
super();
this.line = line;
this.count=0;
}
public void run() {
String word[] = line.split(" ");
for(int i=0;i<word.length;i++) {
if(word[i].equalsIgnoreCase("a") || word[i].equalsIgnoreCase("an") || word[i].equalsIgnoreCase("the")) {
count++;
}
}
}
}