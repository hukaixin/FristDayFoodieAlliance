package cn.kgc.vide;
import java.util.Scanner;

public class Text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String[] names=new String[4];
		String[] sishMegs=new String[4];
		int[] times=new int[4];
		String[] addresses=new String[4];
		int[] states=new int[4];
		double[] sumPrice=new double[4];
		
		
		String[] dishNames={"红烧带鱼","鱼香肉丝","时令蔬菜"};
		double[] prices={38.0,20.0,10.0};
		int[] praiseNums=new int[3];
		//String[] names=new String[4];
		
		
		do{
		System.out.println("欢迎使用“吃货联盟订舱系统");
		System.out.println("*******************************");
		System.out.println("1.我要订餐");
		System.out.println("2.查看餐袋");
		System.out.println("3.签收订单");
		System.out.println("4.删除订单");
		System.out.println("5.我要点赞");
		System.out.println("6.推出系统");
		System.out.println("******************************");
		System.out.print("请选择：");
		int shuzi=input.nextInt();
	
		switch(shuzi){
		case 1:{
			System.out.println("***我要订餐***");
			boolean isAdd=false;
			for(int j=0;j<names.length;j++){
				if(names[j]==null){
					isAdd=true;
					System.out.print("请输入订餐人的姓名");
					String name=input.next();
					System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
					for(int i=0;i<dishNames.length;i++){
						String price=prices[i]+"元";
						String praiseNum=(praiseNums[i])>0 ?praiseNums[i] + "赞":"0";
						System.out.println(i+1+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
					}
					System.out.print("请选择您要点的菜品编号：");
					int chooseDish=input.nextInt();
					System.out.print("请选择您需要的份数：");
					int number=input.nextInt();
					String dishMeg=dishNames[chooseDish-1]+""+number+"份";
					double sumPrice=prices[chooseDish-1]*number;
					double deliCharge=(sumPrice>50)?0:5;
					System.out.print("请输入送餐的时间(送餐的时间是10点至20点间整点送餐)：");
					int time=input.nextInt();
					while(time<10||time>20){
						System.out.println("您输入有误，请输入10-20之间的整数！");
						time=input.nextInt();
					}
					System.out.print("请输入送餐地址：");
					String address=input.next();
					
					System.out.println("订餐成功！");
					System.out.println("您订的是："+dishMeg);
					System.out.println("送餐时间："+time+"点");
					System.out.println("餐费"+sumPrice+"元，送餐费"+deliCharge+"元，总计"+(sumPrice+deliCharge)+"元。");
					names[j]=name;
					dishMegs[j]=dishMeg;
				}
				
			}
			
		}
	}}while();
		}

}
