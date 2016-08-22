package com.rwleea.reflecttest;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.rwleea.core.Test;
import com.rwleea.core.TestInfo;
import com.rwleea.test.*;

/**
 * https://www.mkyong.com/java/java-custom-annotations-example/
 * @author Rwleea
 *
 */
public class App {

		public static void main(String args[]) throws Exception{
			Class<RwTestSuite> classobj = RwTestSuite.class;
			printAnnotation(classobj);
			
			// reflect
			
			//get methods
			for(Method method:classobj.getDeclaredMethods()){
				Annotation annotation = method.getAnnotation(Test.class);
				Test testAnnotation = (Test)annotation;
				if(testAnnotation.enable()){
					method.invoke(classobj.newInstance());
				}
			}
			
			
		}
		
		public static void printAnnotation(Class<? extends RwTestSuite> classObj){
			
			Annotation annotation = classObj.getAnnotation(TestInfo.class);
			TestInfo testinfo =  (TestInfo)annotation;
			System.out.println("test suite priority: "+testinfo.priority());
			System.out.println("test suite created by: "+testinfo.createdBy());
			
			String[] tags= testinfo.tags();
			for(String tag: tags){
				System.out.println("tag-->"+tag);
			}
		}

	
}
