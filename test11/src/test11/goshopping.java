package test11;

import java.util.Scanner;

class shop{
	static int k = 0;
	static String sp[] = new String[10];
	static int count[] = new int[10];
	public void show(){
		Scanner in = new Scanner(System.in);
		System.out.print("请输入你要入库的商品：");
		sp[k] = in.nextLine();
		System.out.print("输入入库商品的数量：");
		count[k++] = in.nextInt();
		
	}
	public void print(){
		System.out.println("商品名称\t数量");
		for(int i = 0;i < sp.length;i++){
			if(sp[i]==null)
				break;
			System.out.println(sp[i]+"\t"+count[i]);
		}
	}
	
}
class shopping{
	String client;
	shop s = new shop();
	void show1(){
		s.print();
		Scanner in = new Scanner(System.in);
		String bey,go;
		int sl;
		int j=0;
		boolean op=false;
		System.out.println("请输入你的姓名：");
		Scanner sc= new Scanner(System.in);
		client=sc.nextLine();
		System.out.print("请输入你需要购买商品的名称：");
		bey = in.nextLine();
		for(int i = 0;i < s.k;i++){
		if(s.sp[i].equals(bey)){
			if(s.count[i]<5){
				System.out.println("商品数量小于5，不能购买，请及时添加");
				j++;
				break;
			}
			System.out.print("输入你要购买的数量：");
			sl = in.nextInt();
				if(s.count[i]>sl){
					s.count[i]-=sl;System.out.println(client+"先生你已成功购买商品！");
					s.print();
					j++;
				}else{
					System.out.println("仓库的数量不足");
					j++;
				}
			}
		}
		if(j==0)
			System.out.println("没有这个商品");
		
	}
}
public class goshopping {
	public static void main(String[] args) {
		shop s = new shop();
		shopping sh = new shopping();
		Scanner input = new Scanner(System.in);
		boolean op = false;
		String go;
		while(true){
		System.out.println("模拟销售程序");
		System.out.println("1.入库");
		System.out.println("2.购买");
		System.out.println("3.退出");
		System.out.print("请选择：");
		String a = input.nextLine();
		switch(a){
		case "1":
			do{
			s.show();
			System.out.print("是否继续(y继续)：");
			go = input.nextLine();
			if(go.equals("y"))
				op = true;
			else{
				System.out.println("你已退出入库");
				s.print();
				break;
			}
			}while(op);
		break;
		case "2":
			do{
			sh.show1();
			System.out.print("是否继续(y继续/其他退出)：");
			go = input.nextLine();
			if(go.equals("y")){
				op = true;
			}else{
				op=false;
			}
			}while(op);
		case "3":System.exit(0);
		default :System.out.println("没有这个选项,请从新选择");
		}
	}
	}

}

