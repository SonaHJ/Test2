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
public class Tbtest_CompoundTest_A1E9452EC3B19C80DFEAE23864643438
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Tbtest_CompoundTest_A1E9452EC3B19C80DFEAE23864643438(IContainer parent, String name) {
		super(parent, "tbtest", "A1E9452EC3B19C80DFEAE23864643438");
	}

	public void execute() {

		this.add(new test.Tbtest_Test_A1E9452E6BF91950DFEAE23864643438(this, "A1E9452ECCC1B5D0DFEAE23864643438") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}