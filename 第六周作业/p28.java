import java.util.*;
public class p28{
	 public static int rootd=0;//根节点的值
	 public static boolean jud(Treenode tree){//判断当前树是否是特殊状态
		 if(tree.fnode.fnode!=null&&tree.fnode.fnode.rightt!=null){
			 if(tree.fnode.fnode.rightt.rightt!=null){
				 if(tree.fnode.fnode.rightt.rightt.date==tree.date){
						return true;
					} 
			 }
		 }
		 if(tree.fnode.fnode!=null&&tree.fnode.fnode.leftt!=null){
				if(tree.fnode.fnode.leftt.leftt!=null){
					if(tree.fnode.fnode.leftt.leftt.date==tree.date){
						return true;
						}
					}
				}
				
		 return false;
	 }
	 public static String gh(Treenode tree){//递归计算·数
		 String x="";
		 if(jud(tree)){//当前树是否满足特殊条件
			 x=gh(tree.fnode);
			 x+="..";
			 for(int i=0;i<Integer.toString(tree.fnode.date).length();i++){
					x+='.';
				}
			 x+=".";
			 return x;
			 
		 }
		 else if(tree.fnode.fnode!=null){//该节点的父亲的父亲不为空
			 x=tree.fnode.x;
			 x+="|.";
			for(int i=0;i<Integer.toString(tree.fnode.date).length();i++){
				x+='.';
			}
		 x+=".";
		 return x;
		 }
		 else {//父节点为根的情况减少数字前的"."
			 for(int i=0;i<Integer.toString(tree.fnode.date).length();i++){
					x+='.';
				}
				x+=".";//代替-
				return x;
		 }		 
	 }
	public static class Treenode{
		private int date;
		private String x="";
		public Treenode leftt;
		public Treenode rightt;
		public Treenode fnode;//父结点
		public Treenode(Integer date0){
			date=date0;
		}
		public void Addtree(Treenode tree){
			if(tree.date>this.date){
				if(this.rightt!=null){
					this.rightt.Addtree(tree);
				}
				else{
					this.rightt=tree;
					this.rightt.fnode=this;
					tree.x=gh(tree);
				}
			}
			else{
				if(this.leftt!=null){
					this.leftt.Addtree(tree);
				}
				else{
					this.leftt=tree;
					this.leftt.fnode=this;
					tree.x=gh(tree);
				}
			}
		}
		public void printtree(){//输出树，RDL
			if(this.rightt!=null){
				this.rightt.printtree();	
			}
			if(date==rootd){//根结点没有“|-”
				System.out.println(date+"-|");
			}
			else{
			System.out.print(this.x);
			if(this.leftt==null&&this.rightt==null){
				System.out.println("|-"+date);
			}
			else{
				System.out.println("|-"+date+"-|");
			}
			}
			if(this.leftt!=null){
				this.leftt.printtree();
			}	
		}
}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a[]=new int[100];
		String string=input.nextLine();
		String[] s=string.split(" ");
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		}
		rootd=a[0];
		Treenode root = new Treenode(a[0]);
		for(int i=1;i<s.length;i++){
			Treenode tree=new Treenode(a[i]);
			root.Addtree(tree);
		}
		root.printtree();
 
	}
}