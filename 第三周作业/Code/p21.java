import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
 
public class p21 {
	 private static String[] strArr=new String[5];
	    private static ArrayList<String> list=new ArrayList<String>();
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<5;i++){
	            strArr[i]=sc.next();
	        }
	        allSort(0,5,new char[]{'A','B','C','D','E'});
	        Collections.sort(list);
	        for(int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	        System.out.println(list.size());
	    }
 
	    private static void allSort(int start,int end,char[] arr){
	        if(start==end){
	            String s=new String(arr);
	            if(judge(s)){
	                list.add(s);
	            }
	        }else{
	            for(int i=start;i<end;i++){
	                char temp=arr[start];
	                arr[start]=arr[i];
	                arr[i]=temp;
 
	                allSort(start+1,end,arr);
 
	                temp=arr[start];
	                arr[start]=arr[i];
	                arr[i]=temp;
	            }
	        }
	    }
 
	    private static boolean judge(String s){
	        char num1=s.charAt(0);
	        char num3=s.charAt(2);
	        char num5=s.charAt(4);
	        String[] temp=new String[5];
	        for(int i=0;i<5;i++){
	            temp[i]=strArr[i].substring(0);
	        }
	        reverse(num1,temp);
	        reverse(num3,temp);
	        reverse(num5,temp);
 
	        if(check(s,temp)){
	            return true;
	        }else{
	            return false;
	        }
 
	    }
 
	    private static boolean check(String s, String[] temp) {
	        for(int i=0;i<5;i++){
	            String talk=temp[i];
	            if(talk.length()==3){
	                if(talk.charAt(1)=='<'){
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex<assumeNumIndex)){
	                        return false;
	                    }
	                }else if(talk.charAt(1)=='='){
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex==assumeNumIndex)){
	                        return false;
	                    }
	                }else{
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex>assumeNumIndex)){
	                        return false;
	                    }
	                }
	            }else{
	                if(talk.charAt(1)=='>'){
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex>=assumeNumIndex)){
	                        return false;
	                    }
	                }else if(talk.charAt(1)=='!'){
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex!=assumeNumIndex)){
	                        return false;
	                    }
	                }else{
	                    int realNumIndex=s.indexOf(""+talk.charAt(0))+1;//num实际的名词
	                    int assumeNumIndex=talk.charAt(talk.length()-1)-'0';//num推断出的名次范围
	                    if(!(realNumIndex<=assumeNumIndex)){
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
 
	    private static void reverse(char num,String[] temp){//num代表说假话的人
	        switch(num){
	        case 'A':temp[0]=change(temp[0]);break;
	        case 'B':temp[1]=change(temp[1]);break;
	        case 'C':temp[2]=change(temp[2]);break;
	        case 'D':temp[3]=change(temp[3]);break;
	        case 'E':temp[4]=change(temp[4]);break;
	        }
	    }
 
	    //<、<=、=、>=、>、!=
	    private static String change(String s){
	        if(s.length()==3){
	            if(s.charAt(1)=='<'){
	                s=s.replace("<",">=");
	            }else if(s.charAt(1)=='='){
	                s=s.replace("=","!=");
	            }else{
	                s=s.replace(">","<=");
	            }
	        }else{
	            if(s.charAt(1)=='>'){
	                s=s.replace(">=","<");
	            }else if(s.charAt(1)=='!'){
	                s=s.replace("!=","=");
	            }else{
	                s=s.replace("<=",">");
	            }
	        }
	        return s;
	    }
 
 
}
 