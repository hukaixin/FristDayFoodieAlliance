package cn.kgc.example;

import java.util.Scanner;

public class Text01 {

	/**
	 * �Ի�����ϵͳ
	 * ���ߣ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��Ʒ��Ϣ��
		String[] disNames=new String[]{"������","�ع���","��������"};
		double[] prices=new double[]{45,18,12};//
		int[] praiseNums=new int[]{5,10,2};
		int[] nums=new int[]{80,40,50};

		//������Ϣ
		String[] names=new String[5];
		String[] disMegs=new String[5];
		int[] times=new int[5];
		String[] addresses=new String[5];
		int[] states=new int[5];
		int[] number=new int[5];
		double[] sumPrices=new double[5];

		//������ʼ����
		names[0]="С��";
		number[0]=2;
		disMegs[0]="�ع���"+number[0]+"��";
		times[0]=12;
		addresses[0]="��������";
		states[0]=0;
		sumPrices[0]=number[0]*prices[1];

		names[1]="С��";
		number[1]=3;
		disMegs[1]="������"+number[1]+"��";
		times[1]=14;
		addresses[1]="��������";
		states[1]=1;
		sumPrices[1]=number[1]*prices[0];


		Scanner input=new Scanner(System.in);
		boolean isExit=false;
		boolean isExint=false;
		boolean isExints=false;
		boolean isExintss=false;
		boolean isExintsss=false;
		int sum=-1;

		int time;//����ĵ��ʱ��
		double meals;//�����5Ԫ�ͷ�
		String state;//����״̬����Ԥ����δԤ��
		System.out.println("****��ӭ����С���͹�*****");

		do{
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("��ѡ��");
			int numbers=input.nextInt();
			switch (numbers) {
			case 1:
				System.out.println("��Ҫ����");
				//System.out.println("��������������");
				if(names[names.length-1]!=null){
					System.out.println("�Բ��𣬶�������������ϵ�̼ң�");
				}
				//boolean isAdd=false;
				for(int i=0;i<names.length;i++){//���for ��Ҫ��Ϊ���������ݵı���
					if(names[i]==null){	//��¼�Ƿ���Ե��
						//isAdd=true;//��־Ϊ�գ�������Ե��
						System.out.println("��������������");
						String name=input.next();
						System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
						//��ʾ��Ʒ��Ϣ
						for(int j=0;j<disNames.length;j++){
							String price=prices[j]+"Ԫ";
							//String praiseNum=praiseNums[j]>0?praiseNums[j]+"��":"0";
							System.out.println(j+1+"\t"+disNames[j]+"\t"+price+"\t"+praiseNums[j]);
						}
						//�û����
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�"+"\n");
						int chooseDish=input.nextInt();
						System.out.print("��ѡ������Ҫ�ķ�����"+"\n");
						int number1=input.nextInt();
						do{
							isExint=false;
							System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ���");
							time=input.nextInt();
							if(time<10||time>20){
								isExint=true;
								System.out.println("�������ʱ���������������룺");
							}
						}while(isExint);
						System.out.println("�������Ͳ͵�ַ��");
						String address=input.next();
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+disNames[chooseDish-1]+number1+"��");
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						meals= prices[chooseDish-1]*number1>=50? 0:5;//��Ŀ�����if else ���һ��
						/*if(prices[chooseDish-1]*number1>=50){
							meals=0;
						}else*/
							meals=5;
						System.out.println("�ͷѣ�    "+prices[chooseDish-1]*number1+"Ԫ,"+"�Ͳͷ�"+meals+"Ԫ��"+"�ܼƣ�  "+(prices[chooseDish-1]*number1+meals)+"Ԫ��");

						//��������
						names[i]=name;
						disMegs[i]=disNames[chooseDish-1]+number1+"��";
						times[i]=time;
						addresses[i]=address;
						number[i]=number1;
						sumPrices[i]=prices[chooseDish-1]*number1+meals;
						break;
					}

				}
				break;
			case 2:
				System.out.println("�鿴�ʹ�");
				//����˴����������
				System.out.println("���"+"\t"+"������"+"\t"+"��Ʒ��Ϣ"+"\t"+"�Ͳ�ʱ��"+"\t"+"�Ͳ͵�ַ"+"\t"+"�ܽ��"+"\t"+"����״̬");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){   //�����ݲ�Ϊ�յ���Ϣ����
					if(states[i]==0){
						state="��Ԥ��";
					}else
						state="�����";
					System.out.println((i+1)+"\t"+names[i]+"\t"+disMegs[i]+"\t"+times[i]+"\t"+ addresses[i]+"\t"+sumPrices[i]+"Ԫ"+"\t"+state);
				}
					}

				break;
			case 3:
				System.out.println("ǩ�ն���");
				System.out.println("��ѡ��Ҫǩ�յĶ������");
				int orderNumber=input.nextInt();//����������-1���������±�ķ�Χ�ڣ�������Ż������������±��1
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&states[i]==0&&orderNumber==i+1){
						states[i]=1;
						isExints=true;
						System.out.println("����ǩ�ճɹ���");
					}else if(names[i]!=null&&states[i]==1&&orderNumber==i+1){
						System.out.println("����ԭ���������ǩ��,�Ѿ������ڽ���ǩ��");
						isExints=true;
					}
					//�������-1�����������±�ķ�Χ��
				}if(!isExints){
					System.out.println("������Ķ������δ�ҵ������ܽ���ǩ��");
				}

				break;
			case 4:
				System.out.println("ɾ������");
				System.out.println("������Ҫɾ���Ķ������");
				int orderNumber1=input.nextInt();
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&states[i]==0&&orderNumber1==i+1){
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ��");
						isExintss=true;
					}else if(names[i]!=null&&states[i]==1&&orderNumber1==i+1){
						System.out.println("��ѡ��Ķ���ɾ��");
						//ɾ�����������������Ԫ����ǰ��һλ
						for(int j=orderNumber1-1;j<names.length-1;j++){
							names[j]=names[j+1];
							disMegs[j]=disMegs[j+1];
							times[j]=times[j+1];
							addresses[j]=addresses[j+1];
							states[j]=states[j+1];
							number[j]=number[j+1];
							sumPrices[j]=sumPrices[j+1];
						}
						//����������Ԫ�ض���Ϊ�գ�String��null, int��0
						names[names.length-1]=null;
						disMegs[disMegs.length-1]=null;
						times[times.length-1]=0;
						addresses[addresses.length-1]=null;
						states[states.length-1]=0;
						number[number.length-1]=0;
						sumPrices[sumPrices.length-1]=0;
						isExintss=true;
					}
					//�������-1�����������±�ķ�Χ��
				}if(!isExintss){
					System.out.println("������Ķ������δ�ҵ������ܽ���ɾ��");
				}

				break;
			case 5:
				System.out.println("��Ҫ����");
				System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
				for(int j=0;j<disNames.length;j++){
					String price=prices[j]+"Ԫ";
					//String praiseNum=praiseNums[j]>0?praiseNums[j]+"��":"0";
					System.out.println(j+1+"\t"+disNames[j]+"\t"+price+"\t"+praiseNums[j]);
				}
				System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
				int orderNumber2=input.nextInt();
				for(int i=0;i<praiseNums.length;i++){
					if(orderNumber2-1==i&&orderNumber2>=1&&orderNumber2<=praiseNums.length){//�ж���Ĳ�Ʒ���-1�Ƿ������������±귶Χ��
						System.out.println("���޳ɹ�");
						isExintsss=true;
						praiseNums[i]++;
					}
					//��Ʒ���-1�����������±�ķ�Χ��
				}if(!isExintsss){
					System.out.println("û����Ҫ���޵Ĳ�Ʒ���");
				}


				break;
			case 6:
				//System.out.println("�˳�ϵͳ");
				isExit=true;
				break;

			default:
				//System.out.println("�����������");
				isExit=true;
				break;
			}
			if(!isExit){
				System.out.println("����0���أ�");
				sum=input.nextInt();
			}
			else
				break;

		}while(sum==0);
		System.out.println("лл����С���͹�");


	}

}
