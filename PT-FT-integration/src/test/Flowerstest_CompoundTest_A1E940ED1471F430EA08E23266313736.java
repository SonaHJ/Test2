/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Flowerstest_CompoundTest_A1E940ED1471F430EA08E23266313736
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Flowerstest_CompoundTest_A1E940ED1471F430EA08E23266313736(IContainer parent, String name) {
		super(parent, "flowerstest", "A1E940ED1471F430EA08E23266313736");
	}

	public void execute() {

		this.add(new test.Flowers_Test_A1E940ECE73301D0EA08E23266313736(this, "A1E940ED53FA2500EA08E23266313736") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}