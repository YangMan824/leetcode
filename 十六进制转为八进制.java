import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//n行
        String [] result=new String[11];//保存最后输出的结果，为什么是11个长度
        /*十六进制转化为二进制*/
        for(int i=0;i<n;i++){
            String h=in.next();
            StringBuilder tempB=new StringBuilder();
            for(int m=0;m<h.length();m++){
                //取出一位十六进制数将其转为二进制数（4位二进制数对应一位十六进制数）
                char numH=h.charAt(m);
                String b=Integer.toBinaryString(Integer.valueOf(String.valueOf(numH), 16));
                //判断如果不够四位前面补0
                for(int k=b.length();k<4;k++){
                    b='0'+b;
                }
                tempB.append(b);
            }

            /*二进制转化为八进制*/
            StringBuilder tempO=new StringBuilder();
            //二进制数三位一组，计算需要补0的个数
            int addZero=3-tempB.length()%3;
            for(int p=0;p<addZero;p++){
                tempB=new StringBuilder("0").append(tempB);
            }
            for(int m=0;m<tempB.length();m+=3){
                //将二进制字符串三位一组转为八进制数
                String numB=tempB.substring(m, m+3);
                String o=Integer.toOctalString(Integer.valueOf(String.valueOf(numB), 2));
                tempO.append(o);
            }
            result[i]=tempO.toString().replaceAll("^(0+)", "");//用正则表达式去掉前导零
        }
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }
}