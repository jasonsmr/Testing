public class DriverLock
{
	public static void main (String[] args) {
		Lock myLock1 =  new Lock("123");		
		Lock myLock2 =   new Lock("123");
		Lock myLock3 = new Lock ("1");

		System.out.println(myLock1.toString());

//		Lock.setMasterCode("999");
//
//		if (myLock1.equals(myLock2))
//			System.out.println("equals");
//
//		System.out.println(myLock1);
//
//		String s = JOptionPane.showInputDialog ("Enter String");
//
//		myLock1.enterCode(s);
//		myLock2.enterCode(s);
//
//		if (myLock1.isUnlock())
//			System.out.println ("OPEN Lock 1!");
//		else
//			System.out.println ("Lock 1 is Locked!!!");
//
//		if (myLock2.isUnlock())
//			System.out.println ("OPEN Lock 2!");
//		else
//			System.out.println ("Lock 2 is Locked!!!");
//
//		if (myLock1 == myLock2)
//			System.out.println ("Equal");
//
//		if (myLock1.equals(myLock2))
//			System.out.println ("Equal");
//
//		if (Lock.equals(myLock1,myLock2))
//			System.out.println ("Equal");

//		System.out.println(myLock1.toString());
	}        
}

