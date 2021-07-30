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
		try {
			Class.forName("javax.rcm.management.ResourceAttributesMBean");
		} catch (ClassNotFoundException e) {
			System.out.println("Current JDK does not support JSR284");
			e.printStackTrace();
			return;
		}
		System.out.print("Current JDK supports JSR284");
	}
}
