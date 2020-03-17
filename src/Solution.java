import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n = Integer.valueOf(str);
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        List<String> list = new ArrayList<>();
        int max = 0;
        int count = 0;
        int sum = 1;
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
            for (int j = 1; j < s.length && j != i; j++) {
                for (int p = 0; p < list.size(); p++) {
                    if (s[j].charAt(0) < list.get(p).charAt(0) && s[j].charAt(2) < list.get(p).charAt(2)) {
                        count++;
                    }
                    if (s[j].charAt(0) > list.get(p).charAt(0) && s[j].charAt(2) > list.get(p).charAt(2)) {
                        count++;
                    }
                }
                if (count == list.size()) {
                    sum++;
                    list.add(s[j]);
                }
            }
            if (max == 0) {
                max = sum;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
            sum = 1;
            count = 0;
            list = new ArrayList<>();
        }
        System.out.println(max);
    }
}
/*
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int n=Integer.valueOf(w);
        String[] s1=new String[n];
        for(int i=0;i<n;i++){
            //System.out.println(i);
            s1[i]=sc.nextLine();
            //System.out.println(s1[i]);
        }
        //int m=sc.nextInt();
        String str=sc.nextLine();
        //System.out.println(str);
        int m=Integer.valueOf(str);
        String[] s2=new String[m];
        for(int i=0;i<m;i++){
            s2[i]=sc.nextLine();
        }
        int count=0;
        int[] array=new int[n];
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s2[j]!=s1[i]){
                    count++;
                }else{
                    break;
                }
            }
            array[i]=count;
            count=0;
        }
        Arrays.sort(array);
        if(array[n-1]==m){
            System.out.println(-1);
        }else{
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        int n=Integer.valueOf(w);
        String[] s1=new String[n];
        for(int i=0;i<n;i++){
            s1[i]=sc.nextLine();
            System.out.println(s1[i]);
        }
        //int m=sc.nextInt();
        String str=sc.nextLine();
        System.out.println(str);
        int m=Integer.valueOf(str);
        String[] s2=new String[m];
        for(int i=0;i<m;i++){
            s2[i]=sc.nextLine();
            System.out.println(s2[i]);
            System.out.println(i);
        }
    }
}
 */
