package cn.kgc.example;

import java.util.Scanner;

public class Text01 {

	/**
	 * 吃货联盟系统
	 * 作者：胡凯新
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//菜品信息：
		String[] disNames=new String[]{"红烧肉","回锅肉","辣椒炒肉"};
		double[] prices=new double[]{45,18,12};//
		int[] praiseNums=new int[]{5,10,2};
		int[] nums=new int[]{80,40,50};

		//订单信息
		String[] names=new String[5];
		String[] disMegs=new String[5];
		int[] times=new int[5];
		String[] addresses=new String[5];
		int[] states=new int[5];
		int[] number=new int[5];
		double[] sumPrices=new double[5];

		//订单初始化：
		names[0]="小胡";
		number[0]=2;
		disMegs[0]="回锅肉"+number[0]+"份";
		times[0]=12;
		addresses[0]="环球数码";
		states[0]=0;
		sumPrices[0]=number[0]*prices[1];

		names[1]="小花";
		number[1]=3;
		disMegs[1]="红烧肉"+number[1]+"份";
		times[1]=14;
		addresses[1]="环球数码";
		states[1]=1;
		sumPrices[1]=number[1]*prices[0];


		Scanner input=new Scanner(System.in);
		boolean isExit=false;
		boolean isExint=false;
		boolean isExints=false;
		boolean isExintss=false;
		boolean isExintsss=false;
		int sum=-1;

		int time;//输入的点餐时间
		double meals;//多余的5元餐费
		String state;//订单状态的已预定和未预定
		System.out.println("****欢迎进入小胡餐馆*****");

		do{
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("请选择：");
			int numbers=input.nextInt();
			switch (numbers) {
			case 1:
				System.out.println("我要订餐");
				//System.out.println("请输入您的姓名");
				if(names[names.length-1]!=null){
					System.out.println("对不起，订单已满，请联系商家：");
				}
				//boolean isAdd=false;
				for(int i=0;i<names.length;i++){//这个for 主要是为了下面数据的保存
					if(names[i]==null){	//记录是否可以点餐
						//isAdd=true;//标志为空，里面可以点餐
						System.out.println("请输入您的姓名");
						String name=input.next();
						System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
						//显示菜品信息
						for(int j=0;j<disNames.length;j++){
							String price=prices[j]+"元";
							//String praiseNum=praiseNums[j]>0?praiseNums[j]+"赞":"0";
							System.out.println(j+1+"\t"+disNames[j]+"\t"+price+"\t"+praiseNums[j]);
						}
						//用户点菜
						System.out.print("请选择您要点的菜品编号："+"\n");
						int chooseDish=input.nextInt();
						System.out.print("请选择您需要的份数："+"\n");
						int number1=input.nextInt();
						do{
							isExint=false;
							System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
							time=input.nextInt();
							if(time<10||time>20){
								isExint=true;
								System.out.println("您输入的时间有误，请重新输入：");
							}
						}while(isExint);
						System.out.println("请输入送餐地址：");
						String address=input.next();
						System.out.println("订餐成功！");
						System.out.println("您订的是："+disNames[chooseDish-1]+number1+"份");
						System.out.println("送餐时间："+time+"点");
						meals= prices[chooseDish-1]*number1>=50? 0:5;//三目运算比if else 简便一点
						/*if(prices[chooseDish-1]*number1>=50){
							meals=0;
						}else*/
							meals=5;
						System.out.println("餐费：    "+prices[chooseDish-1]*number1+"元,"+"送餐费"+meals+"元，"+"总计：  "+(prices[chooseDish-1]*number1+meals)+"元。");

						//保存数据
						names[i]=name;
						disMegs[i]=disNames[chooseDish-1]+number1+"份";
						times[i]=time;
						addresses[i]=address;
						number[i]=number1;
						sumPrices[i]=prices[chooseDish-1]*number1+meals;
						break;
					}

				}
				break;
			case 2:
				System.out.println("查看餐袋");
				//输出菜袋里面的数据
				System.out.println("序号"+"\t"+"订餐人"+"\t"+"餐品信息"+"\t"+"送餐时间"+"\t"+"送餐地址"+"\t"+"总金额"+"\t"+"订单状态");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){   //把数据不为空的信息遍历
					if(states[i]==0){
						state="已预定";
					}else
						state="已完成";
					System.out.println((i+1)+"\t"+names[i]+"\t"+disMegs[i]+"\t"+times[i]+"\t"+ addresses[i]+"\t"+sumPrices[i]+"元"+"\t"+state);
				}
					}

				break;
			case 3:
				System.out.println("签收订单");
				System.out.println("请选择要签收的订单序号");
				int orderNumber=input.nextInt();//如果订单序号-1是在数组下标的范围内，订单序号会比数组里面的下标大1
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&states[i]==0&&orderNumber==i+1){
						states[i]=1;
						isExints=true;
						System.out.println("订单签收成功！");
					}else if(names[i]!=null&&states[i]==1&&orderNumber==i+1){
						System.out.println("订单原先已完成了签到,已经不能在进行签单");
						isExints=true;
					}
					//订单序号-1不是在数组下标的范围内
				}if(!isExints){
					System.out.println("您输入的订单序号未找到，不能进行签单");
				}

				break;
			case 4:
				System.out.println("删除订单");
				System.out.println("请输入要删除的订单序号");
				int orderNumber1=input.nextInt();
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&states[i]==0&&orderNumber1==i+1){
						System.out.println("您选择的订单未签收，不能删除");
						isExintss=true;
					}else if(names[i]!=null&&states[i]==1&&orderNumber1==i+1){
						System.out.println("您选择的订单删除");
						//删除订单后，数组里面的元素向前移一位
						for(int j=orderNumber1-1;j<names.length-1;j++){
							names[j]=names[j+1];
							disMegs[j]=disMegs[j+1];
							times[j]=times[j+1];
							addresses[j]=addresses[j+1];
							states[j]=states[j+1];
							number[j]=number[j+1];
							sumPrices[j]=sumPrices[j+1];
						}
						//数组最后面的元素定义为空，String用null, int用0
						names[names.length-1]=null;
						disMegs[disMegs.length-1]=null;
						times[times.length-1]=0;
						addresses[addresses.length-1]=null;
						states[states.length-1]=0;
						number[number.length-1]=0;
						sumPrices[sumPrices.length-1]=0;
						isExintss=true;
					}
					//订单序号-1不是在数组下标的范围内
				}if(!isExintss){
					System.out.println("您输入的订单序号未找到，不能进行删除");
				}

				break;
			case 5:
				System.out.println("我要点赞");
				System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
				for(int j=0;j<disNames.length;j++){
					String price=prices[j]+"元";
					//String praiseNum=praiseNums[j]>0?praiseNums[j]+"赞":"0";
					System.out.println(j+1+"\t"+disNames[j]+"\t"+price+"\t"+praiseNums[j]);
				}
				System.out.println("请选择您要点的菜品序号：");
				int orderNumber2=input.nextInt();
				for(int i=0;i<praiseNums.length;i++){
					if(orderNumber2-1==i&&orderNumber2>=1&&orderNumber2<=praiseNums.length){//判断你的菜品序号-1是否在这个数组的下标范围内
						System.out.println("点赞成功");
						isExintsss=true;
						praiseNums[i]++;
					}
					//菜品序号-1不是在数组下标的范围内
				}if(!isExintsss){
					System.out.println("没有您要点赞的菜品序号");
				}


				break;
			case 6:
				//System.out.println("退出系统");
				isExit=true;
				break;

			default:
				//System.out.println("您输入的有误");
				isExit=true;
				break;
			}
			if(!isExit){
				System.out.println("输入0返回：");
				sum=input.nextInt();
			}
			else
				break;

		}while(sum==0);
		System.out.println("谢谢光临小胡餐馆");


	}

}
