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
		
		
		String[] dishNames={"���մ���","������˿","ʱ���߲�"};
		double[] prices={38.0,20.0,10.0};
		int[] praiseNums=new int[3];
		//String[] names=new String[4];
		
		
		do{
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ");
		System.out.println("*******************************");
		System.out.println("1.��Ҫ����");
		System.out.println("2.�鿴�ʹ�");
		System.out.println("3.ǩ�ն���");
		System.out.println("4.ɾ������");
		System.out.println("5.��Ҫ����");
		System.out.println("6.�Ƴ�ϵͳ");
		System.out.println("******************************");
		System.out.print("��ѡ��");
		int shuzi=input.nextInt();
	
		switch(shuzi){
		case 1:{
			System.out.println("***��Ҫ����***");
			boolean isAdd=false;
			for(int j=0;j<names.length;j++){
				if(names[j]==null){
					isAdd=true;
					System.out.print("�����붩���˵�����");
					String name=input.next();
					System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
					for(int i=0;i<dishNames.length;i++){
						String price=prices[i]+"Ԫ";
						String praiseNum=(praiseNums[i])>0 ?praiseNums[i] + "��":"0";
						System.out.println(i+1+"\t"+dishNames[i]+"\t"+price+"\t"+praiseNum);
					}
					System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
					int chooseDish=input.nextInt();
					System.out.print("��ѡ������Ҫ�ķ�����");
					int number=input.nextInt();
					String dishMeg=dishNames[chooseDish-1]+""+number+"��";
					double sumPrice=prices[chooseDish-1]*number;
					double deliCharge=(sumPrice>50)?0:5;
					System.out.print("�������Ͳ͵�ʱ��(�Ͳ͵�ʱ����10����20��������Ͳ�)��");
					int time=input.nextInt();
					while(time<10||time>20){
						System.out.println("����������������10-20֮���������");
						time=input.nextInt();
					}
					System.out.print("�������Ͳ͵�ַ��");
					String address=input.next();
					
					System.out.println("���ͳɹ���");
					System.out.println("�������ǣ�"+dishMeg);
					System.out.println("�Ͳ�ʱ�䣺"+time+"��");
					System.out.println("�ͷ�"+sumPrice+"Ԫ���Ͳͷ�"+deliCharge+"Ԫ���ܼ�"+(sumPrice+deliCharge)+"Ԫ��");
					names[j]=name;
					dishMegs[j]=dishMeg;
				}
				
			}
			
		}
	}}while();
		}

}
