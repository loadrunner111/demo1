package test11;

import java.util.Scanner;

class shop{
	static int k = 0;
	static String sp[] = new String[10];
	static int count[] = new int[10];
	public void show(){
		Scanner in = new Scanner(System.in);
		System.out.print("��������Ҫ������Ʒ��");
		sp[k] = in.nextLine();
		System.out.print("���������Ʒ��������");
		count[k++] = in.nextInt();
		
	}
	public void print(){
		System.out.println("��Ʒ����\t����");
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
		System.out.println("���������������");
		Scanner sc= new Scanner(System.in);
		client=sc.nextLine();
		System.out.print("����������Ҫ������Ʒ�����ƣ�");
		bey = in.nextLine();
		for(int i = 0;i < s.k;i++){
		if(s.sp[i].equals(bey)){
			if(s.count[i]<5){
				System.out.println("��Ʒ����С��5�����ܹ����뼰ʱ���");
				j++;
				break;
			}
			System.out.print("������Ҫ�����������");
			sl = in.nextInt();
				if(s.count[i]>sl){
					s.count[i]-=sl;System.out.println(client+"�������ѳɹ�������Ʒ��");
					s.print();
					j++;
				}else{
					System.out.println("�ֿ����������");
					j++;
				}
			}
		}
		if(j==0)
			System.out.println("û�������Ʒ");
		
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
		System.out.println("ģ�����۳���");
		System.out.println("1.���");
		System.out.println("2.����");
		System.out.println("3.�˳�");
		System.out.print("��ѡ��");
		String a = input.nextLine();
		switch(a){
		case "1":
			do{
			s.show();
			System.out.print("�Ƿ����(y����)��");
			go = input.nextLine();
			if(go.equals("y"))
				op = true;
			else{
				System.out.println("�����˳����");
				s.print();
				break;
			}
			}while(op);
		break;
		case "2":
			do{
			sh.show1();
			System.out.print("�Ƿ����(y����/�����˳�)��");
			go = input.nextLine();
			if(go.equals("y")){
				op = true;
			}else{
				op=false;
			}
			}while(op);
		case "3":System.exit(0);
		default :System.out.println("û�����ѡ��,�����ѡ��");
		}
	}
	}

}

