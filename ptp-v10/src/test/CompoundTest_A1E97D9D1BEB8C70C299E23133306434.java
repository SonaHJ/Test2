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
public class CompoundTest_A1E97D9D1BEB8C70C299E23133306434
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public CompoundTest_A1E97D9D1BEB8C70C299E23133306434(IContainer parent, String name) {
		super(parent, "https-test", "A1E97D9D1BEB8C70C299E23133306434");
	}

	public void execute() {

		this.add(new test.Test_A1E97D9C349FE63FC299E23133306434(this, "A1E97D9D1FDCEAE0C299E23133306434") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}