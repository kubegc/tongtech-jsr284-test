/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys.tongtech;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @since 2019.10.29
 *
 */

public class Main {

	public static void main(String[] args) {
		loadJsr284("javax.rcm.management.ResourceAttributesMBean");
		loadJsr284("javax.rcm.management.ResourceDomainMBean");
		loadJsr284("javax.rcm.Constraint");
		loadJsr284("javax.rcm.Notification");
		loadJsr284("javax.rcm.ResourceAttributes");
		loadJsr284("javax.rcm.ResourceAttributesFactory");
		loadJsr284("javax.rcm.ResourceConsumer");
		loadJsr284("javax.rcm.ResourceDomain");
		loadJsr284("javax.rcm.ResourceException");
		loadJsr284("javax.rcm.ResourcePermission");
		System.out.print("Current JDK supports JSR284");
	}

	public static void loadJsr284(String classname) {
		try {
			Class.forName(classname);
		} catch (ClassNotFoundException e) {
			System.out.println("Current JDK does not support JSR284");
			e.printStackTrace();
			return;
		}
	}
}
