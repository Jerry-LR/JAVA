package com.jerry.lianxi9;
//����һ������ΪVehicle�Ľӿڣ��ڽӿ��������������һ�������ķ���start()��stop()��
//���������Ʒֱ�ΪBike��Bus������ʵ��Vehicle�ӿڡ�����һ������ΪinterfaceDemo���࣬
//��interfaceDemo��main()�����д���Bike��Bus���󣬲�����start()��stop()������
public class InterfaceDemo {
public static void main(String[] args) {
	Bike bike=new Bike();
	Bus bus=new Bus();
	bike.start("�̵�");
	bus.start("�̵�");
	bus.stop("���");
	bike.stop("���");
	
}
}
