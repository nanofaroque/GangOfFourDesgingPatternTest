package reflectionandintrospection;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class ReflectionTesting {

	public static void main(String[] args) {
		//getting the class name from the object; 
		//Assume that we dont know anything about the object like s and "faroque"
		//"faroque" is an object since it is string 
		Class c="faroque".getClass();
		System.out.println(c);
		
		Set<String> s = new HashSet<String>();
		Class cl = s.getClass();
		System.out.println(cl);
		
		
		//If the type is available but there is no instance then 
		//it is possible to obtain a Class by appending ".class" to the name of the type. 
		//This is also the easiest way to obtain the Class for a primitive type.
		
		boolean b;
		Class cboolean = boolean.class;
		System.out.println(cboolean);
		
		
		//If the fully-qualified name of a class is available, it is possible to 
		//get the corresponding Class using the static method Class.forName().
		try {
			Class cls = Class.forName("java.util.HashSet");
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//no paramater
		Class noparams[] = {};
			
		//String parameter
		Class[] paramString = new Class[1];	
		paramString[0] = String.class;
			
		//int parameter
		Class[] paramInt = new Class[1];	
		paramInt[0] = Integer.TYPE;
		
		try{
	        //load the AppTest at runtime
		Class cls = Class.forName("reflectionandintrospection.AppTest");
		Object obj = cls.newInstance();
			
		//call the printIt method
		Method method = cls.getDeclaredMethod("printIt", noparams);
		method.invoke(obj, null);
			
		//call the printItString method, pass a String param 
		method = cls.getDeclaredMethod("printItString", paramString);
		method.invoke(obj, new String("faroque"));
			
		//call the printItInt method, pass a int param
		method = cls.getDeclaredMethod("printItInt", paramInt);
		method.invoke(obj, 123);
			
		//call the setCounter method, pass a int param
		method = cls.getDeclaredMethod("setCounter", paramInt);
		method.invoke(obj, 999);
			
		//call the printCounter method
		method = cls.getDeclaredMethod("printCounter", noparams);
		method.invoke(obj, null);
			
	}catch(Exception ex){
		ex.printStackTrace();
	}
		
		
	}

}
